package com.zone24x7.rac.dataextractionservice.dao;

import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Data Access object for data sourcers
 */
@Repository
public interface DataExtractionDAO {
    List<Object> findAll(String tableName, String limitSize);
}
