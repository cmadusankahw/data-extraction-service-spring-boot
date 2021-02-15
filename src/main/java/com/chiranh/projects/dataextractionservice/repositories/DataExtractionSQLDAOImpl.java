package com.zone24x7.rac.dataextractionservice.repositories;

import com.zone24x7.rac.dataextractionservice.dao.DataExtractionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;
import java.util.Arrays;
import java.util.List;

/**
 * Repository which query to  the sql database according to the requests
 */
@Repository
public class DataExtractionSQLDAOImpl extends JdbcDaoSupport implements DataExtractionDAO {

    /**
     * established the sql database connection
     * Todo - When used two sql databases we have to specifically create classes for configure those databases
     * https://stackoverflow.com/questions/30362546/how-to-use-2-or-more-databases-with-spring
     */
    @Autowired
    DataSource dataSource;

    @PostConstruct
    private void initialize() {
        setDataSource(dataSource);
    }

    /**
     * Method to retrieve data from the sql table
     * 1. Can retrieve all the data
     * 2. Can retrieve data with a limit
     *
     * @param tableName
     * @param limitSize
     * @return
     */
    @Override
    public List<Object> findAll(String tableName, String limitSize) {

        String sql = "SELECT * FROM " + tableName;
        if (!limitSize.equals("-1")) {
            sql = "SELECT * FROM " + tableName + " LIMIT " + limitSize;
        }
        List<Object> list = Arrays.asList(getJdbcTemplate().queryForList(sql).toArray());
        return list;
    }
}
