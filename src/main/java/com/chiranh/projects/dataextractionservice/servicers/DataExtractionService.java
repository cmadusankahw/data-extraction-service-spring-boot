package com.zone24x7.rac.dataextractionservice.servicers;

import com.zone24x7.rac.dataextractionservice.repositories.DataExtractionHBaseDAOImpl;
import com.zone24x7.rac.dataextractionservice.repositories.DataExtractionHiveDAOImpl;
import com.zone24x7.rac.dataextractionservice.repositories.DataExtractionMongoDAOImpl;
import com.zone24x7.rac.dataextractionservice.repositories.DataExtractionSQLDAOImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * A service map the requests from the controller to specific dao implementation
 */
@Service
public class DataExtractionService {

    private static final Logger logger = LoggerFactory.getLogger(DataExtractionService.class);

    /**
     * Inject SQL DAO implementation
     */
    @Autowired
    DataExtractionSQLDAOImpl dataExtractionSQLDAO;

    /**
     * Inject Mongo DAO implementation
     */
    @Autowired
    DataExtractionMongoDAOImpl dataExtractionMongoDAO;

    /**
     * Inject Hive DAO implementation
     */
    @Autowired
    DataExtractionHiveDAOImpl dataExtractionHiveDAO;

    /**
     * Inject the Hbase DAO implementation
     */
    @Autowired
    DataExtractionHBaseDAOImpl dataExtractionHBaseDAO;

    /**
     * Method to get records which make the mapping between controller and the each dao implementations
     * 1. Check the database type
     * 2. call the findAll method from the required dao
     *
     * @param dataSource
     * @param tableName
     * @param limitSize
     * @return
     * @throws Exception
     */
    public List<Object> getAllRecords(String dataSource, String tableName, String limitSize) throws Exception {
        if (dataSource.equals("mongo")) {
            return dataExtractionMongoDAO.findAll(tableName, limitSize);
        } else if (dataSource.equals("sql")) {
            return dataExtractionSQLDAO.findAll(tableName, limitSize);
        } else if (dataSource.equals("hbase")) {
            System.out.println("Executing Hbase ........");
            return dataExtractionHBaseDAO.findAll(tableName, limitSize);
        }
//        else if(dataSource.contains("hive")){
//            return dataExtractionHiveDAO.findAll(tableName);
//        }
        else {
            logger.error("Error with retrieving correct dao implementation");
            throw new Exception();
        }
    }
}
