package com.zone24x7.rac.dataextractionservice.controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.zone24x7.rac.dataextractionservice.servicers.DataExtractionService;
import com.zone24x7.rac.dataextractionservice.utils.JsonUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controller responsible for data extraction
 */
@CrossOrigin
@RestController
public class DataExtractionController {

    private static final Logger logger = LoggerFactory.getLogger(DataExtractionController.class);
    @Autowired
    private DataExtractionService dataExtractionService;

    /**
     * Method to retrieve data from given data source
     *
     * @param dataSource
     * @param tableName
     * @return
     */
    @GetMapping(value = "${url.get.mapping}")
    @Transactional(timeout = 1)
    public ResponseEntity<JsonNode> getAllRecords(@RequestParam(value = "data-source") String dataSource,
                                                  @RequestParam(value = "table-name") String tableName,
                                                  @RequestParam(value = "limit", defaultValue = "-1", required = false) String limitSize) {
        try {
            List<Object> all = dataExtractionService.getAllRecords(dataSource, tableName, limitSize);
            JsonNode node = JsonUtils.toJson(all);
            logger.info("Retrieving Data from " + dataSource + " and " + tableName);
            return new ResponseEntity<>(node, HttpStatus.OK);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error("Data Retrieving Fail for " + dataSource + " and " + tableName);
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }
}
