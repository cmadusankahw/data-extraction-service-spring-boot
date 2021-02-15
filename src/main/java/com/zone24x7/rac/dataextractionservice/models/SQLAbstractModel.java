package com.zone24x7.rac.dataextractionservice.models;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Abstract Model . A common Model for all the lower level models
 */
@MappedSuperclass
public abstract class SQLAbstractModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    /**
     * hash code method
     *
     * @return
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    /**
     * method to get id
     *
     * @return
     */
    public Long getId() {
        return id;
    }

    /**
     * Method to set id
     *
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * equals method
     *
     * @param obj
     * @return
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SQLAbstractModel other = (SQLAbstractModel) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    /**
     * to string method
     *
     * @return
     */
    @Override
    public String toString() {
        return "BaseModel{" +
                "id=" + id +
                '}';
    }
}
