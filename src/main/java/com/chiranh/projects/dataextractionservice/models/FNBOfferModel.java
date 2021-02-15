package com.zone24x7.rac.dataextractionservice.models;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * FnbOffer Model Class - MongoDB Collection
 */
@Document(collection = "rac_fnb_offer_catalog")
public class FNBOfferModel extends MongoAbstractModel {

    private long id;
    private String offerName;
    private String offerDescription;
    private String recencyCategory;
    private String frequencyCategory;
    private String monetaryCategory;
    private String churnLevel;

    /**
     * Method to get id
     *
     * @return
     */
    public long getId() {
        return id;
    }

    /**
     * method for set id
     *
     * @param id
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * method for get offerName
     *
     * @return
     */
    public String getOfferName() {
        return offerName;
    }

    /**
     * method for set offer name
     *
     * @param offerName
     */
    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    /**
     * method for get offerDescription
     *
     * @return
     */
    public String getOfferDescription() {
        return offerDescription;
    }

    /**
     * method to setOfferDescription
     *
     * @param offerDescription
     */
    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    /**
     * method for get recency category
     *
     * @return
     */
    public String getRecencyCategory() {
        return recencyCategory;
    }

    /**
     * method for set recency category
     *
     * @param recencyCategory
     */
    public void setRecencyCategory(String recencyCategory) {
        this.recencyCategory = recencyCategory;
    }

    /**
     * method to get frequency category
     *
     * @return
     */
    public String getFrequencyCategory() {
        return frequencyCategory;
    }

    /**
     * Method to set frequency category
     *
     * @param frequencyCategory
     */
    public void setFrequencyCategory(String frequencyCategory) {
        this.frequencyCategory = frequencyCategory;
    }

    /**
     * Method to ger monetary category
     *
     * @return
     */
    public String getMonetaryCategory() {
        return monetaryCategory;
    }

    /**
     * Method to send monetary category
     *
     * @param monetaryCategory
     */
    public void setMonetaryCategory(String monetaryCategory) {
        this.monetaryCategory = monetaryCategory;
    }

    /**
     * method to get churn level
     *
     * @return
     */
    public String getChurnLevel() {
        return churnLevel;
    }

    /**
     * method to set churn level
     *
     * @param churnLevel
     */
    public void setChurnLevel(String churnLevel) {
        this.churnLevel = churnLevel;
    }

    /**
     * to string method
     *
     * @return
     */
    @Override
    public String toString() {
        return "FNBOfferModel{" +
                "id=" + id +
                ", offerName='" + offerName + '\'' +
                ", offerDescription='" + offerDescription + '\'' +
                ", recencyCategory='" + recencyCategory + '\'' +
                ", frequencyCategory='" + frequencyCategory + '\'' +
                ", monetaryCategory='" + monetaryCategory + '\'' +
                ", churnLevel='" + churnLevel + '\'' +
                '}';
    }

    /**
     * constructor with parameters
     *
     * @param id
     * @param offerName
     * @param offerDescription
     * @param recencyCategory
     * @param frequencyCategory
     * @param monetaryCategory
     * @param churnLevel
     */
    public FNBOfferModel(long id, String offerName, String offerDescription, String recencyCategory, String frequencyCategory, String monetaryCategory, String churnLevel) {
        this.id = id;
        this.offerName = offerName;
        this.offerDescription = offerDescription;
        this.recencyCategory = recencyCategory;
        this.frequencyCategory = frequencyCategory;
        this.monetaryCategory = monetaryCategory;
        this.churnLevel = churnLevel;
    }

    /**
     * Default constructor
     */
    public FNBOfferModel() {
    }
}
