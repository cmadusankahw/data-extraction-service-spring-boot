package com.zone24x7.rac.dataextractionservice.repositories;

import com.zone24x7.rac.dataextractionservice.config.HBaseConnection;
import com.zone24x7.rac.dataextractionservice.dao.DataExtractionDAO;
import org.apache.hadoop.hbase.TableName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.hadoop.hbase.client.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Repository which query to the hbase database according to the requests
 */
@Repository
public class DataExtractionHBaseDAOImpl implements DataExtractionDAO {

    /**
     * Inject Hbase connection
     */
    @Autowired
    private HBaseConnection connection;

    /**
     * Method to retrieve data from the hbase table
     * 1. Can retrieve all the data
     * 2. todo - able to retrieve data with a limit
     *
     * @param tableName
     * @param limitSize
     * @return
     */
    @Override
    public List<Object> findAll(String tableName, String limitSize) {
        Scan scan = new Scan();
        tableName = "recommendations_customer";
        try (Table table = connection.getConnection().getTable(TableName.valueOf(tableName))) {
            return StreamSupport
                    .stream(table.getScanner(scan).spliterator(), false)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
