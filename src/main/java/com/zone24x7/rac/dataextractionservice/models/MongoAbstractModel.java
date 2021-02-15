package com.zone24x7.rac.dataextractionservice.models;

import org.springframework.data.annotation.Id;

import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Abstract class for common attributes in mongo collections
 */
@MappedSuperclass
public class MongoAbstractModel implements Serializable {

    @Id
    private String object_id;

    /**
     * Method to get object id
     *
     * @return
     */
    public String getObject_id() {
        return object_id;
    }

    /**
     * method to set object id
     *
     * @param object_id
     */
    public void setObject_id(String object_id) {
        this.object_id = object_id;
    }

    @Override
    public String toString() {
        return "MongoAbstractModel{" +
                "object_id='" + object_id + '\'' +
                '}';
    }
}
