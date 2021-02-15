package com.zone24x7.rac.dataextractionservice.repositories;

import com.zone24x7.rac.dataextractionservice.dao.DataExtractionDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * Repository which query to  the mongoDB database according to the requests
 */
@Repository
public class DataExtractionMongoDAOImpl implements DataExtractionDAO {

    /**
     * Inject the mogo connection using mongo template
     */
    @Autowired
    MongoTemplate mongoTemplate;

    /**
     * Method to retrieve data from the mongoDb table
     * 1. Can retrieve all the data
     * 2. Can retrieve data with a limit - Todo - Have to test
     *
     * @param collection
     * @param limitSize
     * @return
     */
    @Override
    public List<Object> findAll(String collection, String limitSize) {

        if (!limitSize.equals("-1")) {
            Query query = new Query();
            int limit = Integer.parseInt(limitSize);
            query.limit(limit);
            return mongoTemplate.find(query, Object.class, collection);
        } else {
            return mongoTemplate.findAll(Object.class, collection);
        }

    }
}
