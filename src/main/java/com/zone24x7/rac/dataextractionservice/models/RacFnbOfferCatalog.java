package com.zone24x7.rac.dataextractionservice.models;

import javax.persistence.*;

/**
 * Pojo class for the rac_fnb_offer_catalog in sql database
 */
@Entity
@Table(name = "rac_fnb_offer_catalog")
@AttributeOverride(name = "id", column = @Column(name = "offer_id"))
public class RacFnbOfferCatalog extends SQLAbstractModel {

    @Column(name = "offer_name")
    private String offerName;

    @Column(name = "offer_description")
    private String offerDescription;

    @Column(name = "recency_category")
    private String recencyCategory;

    @Column(name = "frequency_category")
    private String frequencyCategory;

    @Column(name = "monetary_category")
    private String monetaryCategory;

    @Column(name = "churn_level")
    private String churnLevel;

    /**
     * Parameterized constructor
     *
     * @param offerName
     * @param offerDescription
     * @param recencyCategory
     * @param frequencyCategory
     * @param monetaryCategory
     * @param churnLevel
     */
    public RacFnbOfferCatalog(String offerName, String offerDescription, String recencyCategory, String frequencyCategory, String monetaryCategory, String churnLevel) {
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
    public RacFnbOfferCatalog() {
    }

    /**
     * Method to get offer name
     *
     * @return
     */
    public String getOfferName() {
        return offerName;
    }

    /**
     * Method to set offer name
     *
     * @param offerName
     */
    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    /**
     * method to get offer description
     *
     * @return
     */
    public String getOfferDescription() {
        return offerDescription;
    }

    /**
     * method to set offer description
     *
     * @param offerDescription
     */
    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    /**
     * method to get recency category
     *
     * @return
     */
    public String getRecencyCategory() {
        return recencyCategory;
    }

    /**
     * method to set recency category
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
     * method to set frequency category
     *
     * @param frequencyCategory
     */
    public void setFrequencyCategory(String frequencyCategory) {
        this.frequencyCategory = frequencyCategory;
    }

    /**
     * method to get monetary category
     *
     * @return
     */
    public String getMonetaryCategory() {
        return monetaryCategory;
    }

    /**
     * method to set monetary category
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
        return "RacFnbOfferCatalog{" +
                "offerName='" + offerName + '\'' +
                ", offerDescription='" + offerDescription + '\'' +
                ", recencyCategory='" + recencyCategory + '\'' +
                ", frequencyCategory='" + frequencyCategory + '\'' +
                ", monetaryCategory='" + monetaryCategory + '\'' +
                ", churnLevel='" + churnLevel + '\'' +
                '}';
    }
}
