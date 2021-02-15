package com.zone24x7.rac.dataextractionservice.repositories;

import com.zone24x7.rac.dataextractionservice.dao.DataExtractionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.hadoop.hbase.HbaseTemplate;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Repository which query to the hive database according to the requests
 */
@Repository
public class DataExtractionHiveDAOImpl {
//        implements DataExtractionDAO {
//
//    /**
//     * Inject the hive connection (Since this used a jdbc template used @qualifier to specify the connection)
//     */
//    @Autowired
//    @Qualifier("HiveConfig")
//    JdbcTemplate hiveJdbCTemplate;
//
//    /**
//     * Method to retrieve data from the hive table
//     * 1. Can retrieve all the data
//     * 2. todo - able to retrieve data with a limit
//     *
//     * @param tableName
//     * @param limitSize
//     * @return
//     */
//    @Override
//    public List<Object> findAll(String tableName,String limitSize) {
//        hiveJdbCTemplate.execute("USE "+tableName);
//        List<Object> list = Arrays.asList(hiveJdbCTemplate.queryForList("SELECT * FROM "+tableName).toArray());
//        return list;
//    }
}
