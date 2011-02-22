/**
 * Indicator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class Indicator  implements java.io.Serializable {
    private java.lang.Integer adjustmentID;

    private java.lang.Integer ageAdjustmentID;

    private java.lang.String ageAdjustmentValue;

    private java.lang.Integer ageRangeID;

    private java.lang.Integer chronicConditionID;

    private java.math.BigDecimal confidenceIntervalHigh;

    private java.lang.String confidenceIntervalHighFormatted;

    private java.math.BigDecimal confidenceIntervalLow;

    private java.lang.String confidenceIntervalLowFormatted;

    private java.lang.String dimensionGraphHeader;

    private java.lang.Integer dimensionGraphID;

    private java.lang.String dimensionGraphLabel;

    private java.lang.Integer disabilityStatusID;

    private java.lang.Integer educationLevelID;

    private java.lang.Integer ethnicityID;

    private java.lang.Integer familyIncomeLevelID;

    private java.lang.Integer familyTypeID;

    private java.math.BigDecimal floatTarget;

    private java.math.BigDecimal floatValue;

    private java.lang.String formattedTarget;

    private java.lang.String formattedValue;

    private java.lang.Integer genderID;

    private java.lang.Integer healthInsuranceStatusID;

    private java.lang.Integer ID;

    private java.lang.Integer indicatorDescriptionID;

    private java.lang.Integer integralTarget;

    private java.lang.Integer integralValue;

    private java.lang.Boolean isBaseline;

    private java.lang.Integer localeID;

    private java.lang.Integer maritalStatusID;

    private java.lang.Integer metroLocationID;

    private java.lang.Integer otherID;

    private java.lang.Integer schoolGradeLevelID;

    private java.lang.Integer sexualOrientationID;

    private java.lang.String sourceColumnName;

    private java.lang.Integer sourceID;

    private java.math.BigDecimal standardError;

    private java.lang.String textualValue;

    private java.lang.Integer timeframeID;

    private java.lang.Integer totalID;

    public Indicator() {
    }

    public Indicator(
           java.lang.Integer adjustmentID,
           java.lang.Integer ageAdjustmentID,
           java.lang.String ageAdjustmentValue,
           java.lang.Integer ageRangeID,
           java.lang.Integer chronicConditionID,
           java.math.BigDecimal confidenceIntervalHigh,
           java.lang.String confidenceIntervalHighFormatted,
           java.math.BigDecimal confidenceIntervalLow,
           java.lang.String confidenceIntervalLowFormatted,
           java.lang.String dimensionGraphHeader,
           java.lang.Integer dimensionGraphID,
           java.lang.String dimensionGraphLabel,
           java.lang.Integer disabilityStatusID,
           java.lang.Integer educationLevelID,
           java.lang.Integer ethnicityID,
           java.lang.Integer familyIncomeLevelID,
           java.lang.Integer familyTypeID,
           java.math.BigDecimal floatTarget,
           java.math.BigDecimal floatValue,
           java.lang.String formattedTarget,
           java.lang.String formattedValue,
           java.lang.Integer genderID,
           java.lang.Integer healthInsuranceStatusID,
           java.lang.Integer ID,
           java.lang.Integer indicatorDescriptionID,
           java.lang.Integer integralTarget,
           java.lang.Integer integralValue,
           java.lang.Boolean isBaseline,
           java.lang.Integer localeID,
           java.lang.Integer maritalStatusID,
           java.lang.Integer metroLocationID,
           java.lang.Integer otherID,
           java.lang.Integer schoolGradeLevelID,
           java.lang.Integer sexualOrientationID,
           java.lang.String sourceColumnName,
           java.lang.Integer sourceID,
           java.math.BigDecimal standardError,
           java.lang.String textualValue,
           java.lang.Integer timeframeID,
           java.lang.Integer totalID) {
           this.adjustmentID = adjustmentID;
           this.ageAdjustmentID = ageAdjustmentID;
           this.ageAdjustmentValue = ageAdjustmentValue;
           this.ageRangeID = ageRangeID;
           this.chronicConditionID = chronicConditionID;
           this.confidenceIntervalHigh = confidenceIntervalHigh;
           this.confidenceIntervalHighFormatted = confidenceIntervalHighFormatted;
           this.confidenceIntervalLow = confidenceIntervalLow;
           this.confidenceIntervalLowFormatted = confidenceIntervalLowFormatted;
           this.dimensionGraphHeader = dimensionGraphHeader;
           this.dimensionGraphID = dimensionGraphID;
           this.dimensionGraphLabel = dimensionGraphLabel;
           this.disabilityStatusID = disabilityStatusID;
           this.educationLevelID = educationLevelID;
           this.ethnicityID = ethnicityID;
           this.familyIncomeLevelID = familyIncomeLevelID;
           this.familyTypeID = familyTypeID;
           this.floatTarget = floatTarget;
           this.floatValue = floatValue;
           this.formattedTarget = formattedTarget;
           this.formattedValue = formattedValue;
           this.genderID = genderID;
           this.healthInsuranceStatusID = healthInsuranceStatusID;
           this.ID = ID;
           this.indicatorDescriptionID = indicatorDescriptionID;
           this.integralTarget = integralTarget;
           this.integralValue = integralValue;
           this.isBaseline = isBaseline;
           this.localeID = localeID;
           this.maritalStatusID = maritalStatusID;
           this.metroLocationID = metroLocationID;
           this.otherID = otherID;
           this.schoolGradeLevelID = schoolGradeLevelID;
           this.sexualOrientationID = sexualOrientationID;
           this.sourceColumnName = sourceColumnName;
           this.sourceID = sourceID;
           this.standardError = standardError;
           this.textualValue = textualValue;
           this.timeframeID = timeframeID;
           this.totalID = totalID;
    }


    /**
     * Gets the adjustmentID value for this Indicator.
     * 
     * @return adjustmentID
     */
    public java.lang.Integer getAdjustmentID() {
        return adjustmentID;
    }


    /**
     * Sets the adjustmentID value for this Indicator.
     * 
     * @param adjustmentID
     */
    public void setAdjustmentID(java.lang.Integer adjustmentID) {
        this.adjustmentID = adjustmentID;
    }


    /**
     * Gets the ageAdjustmentID value for this Indicator.
     * 
     * @return ageAdjustmentID
     */
    public java.lang.Integer getAgeAdjustmentID() {
        return ageAdjustmentID;
    }


    /**
     * Sets the ageAdjustmentID value for this Indicator.
     * 
     * @param ageAdjustmentID
     */
    public void setAgeAdjustmentID(java.lang.Integer ageAdjustmentID) {
        this.ageAdjustmentID = ageAdjustmentID;
    }


    /**
     * Gets the ageAdjustmentValue value for this Indicator.
     * 
     * @return ageAdjustmentValue
     */
    public java.lang.String getAgeAdjustmentValue() {
        return ageAdjustmentValue;
    }


    /**
     * Sets the ageAdjustmentValue value for this Indicator.
     * 
     * @param ageAdjustmentValue
     */
    public void setAgeAdjustmentValue(java.lang.String ageAdjustmentValue) {
        this.ageAdjustmentValue = ageAdjustmentValue;
    }


    /**
     * Gets the ageRangeID value for this Indicator.
     * 
     * @return ageRangeID
     */
    public java.lang.Integer getAgeRangeID() {
        return ageRangeID;
    }


    /**
     * Sets the ageRangeID value for this Indicator.
     * 
     * @param ageRangeID
     */
    public void setAgeRangeID(java.lang.Integer ageRangeID) {
        this.ageRangeID = ageRangeID;
    }


    /**
     * Gets the chronicConditionID value for this Indicator.
     * 
     * @return chronicConditionID
     */
    public java.lang.Integer getChronicConditionID() {
        return chronicConditionID;
    }


    /**
     * Sets the chronicConditionID value for this Indicator.
     * 
     * @param chronicConditionID
     */
    public void setChronicConditionID(java.lang.Integer chronicConditionID) {
        this.chronicConditionID = chronicConditionID;
    }


    /**
     * Gets the confidenceIntervalHigh value for this Indicator.
     * 
     * @return confidenceIntervalHigh
     */
    public java.math.BigDecimal getConfidenceIntervalHigh() {
        return confidenceIntervalHigh;
    }


    /**
     * Sets the confidenceIntervalHigh value for this Indicator.
     * 
     * @param confidenceIntervalHigh
     */
    public void setConfidenceIntervalHigh(java.math.BigDecimal confidenceIntervalHigh) {
        this.confidenceIntervalHigh = confidenceIntervalHigh;
    }


    /**
     * Gets the confidenceIntervalHighFormatted value for this Indicator.
     * 
     * @return confidenceIntervalHighFormatted
     */
    public java.lang.String getConfidenceIntervalHighFormatted() {
        return confidenceIntervalHighFormatted;
    }


    /**
     * Sets the confidenceIntervalHighFormatted value for this Indicator.
     * 
     * @param confidenceIntervalHighFormatted
     */
    public void setConfidenceIntervalHighFormatted(java.lang.String confidenceIntervalHighFormatted) {
        this.confidenceIntervalHighFormatted = confidenceIntervalHighFormatted;
    }


    /**
     * Gets the confidenceIntervalLow value for this Indicator.
     * 
     * @return confidenceIntervalLow
     */
    public java.math.BigDecimal getConfidenceIntervalLow() {
        return confidenceIntervalLow;
    }


    /**
     * Sets the confidenceIntervalLow value for this Indicator.
     * 
     * @param confidenceIntervalLow
     */
    public void setConfidenceIntervalLow(java.math.BigDecimal confidenceIntervalLow) {
        this.confidenceIntervalLow = confidenceIntervalLow;
    }


    /**
     * Gets the confidenceIntervalLowFormatted value for this Indicator.
     * 
     * @return confidenceIntervalLowFormatted
     */
    public java.lang.String getConfidenceIntervalLowFormatted() {
        return confidenceIntervalLowFormatted;
    }


    /**
     * Sets the confidenceIntervalLowFormatted value for this Indicator.
     * 
     * @param confidenceIntervalLowFormatted
     */
    public void setConfidenceIntervalLowFormatted(java.lang.String confidenceIntervalLowFormatted) {
        this.confidenceIntervalLowFormatted = confidenceIntervalLowFormatted;
    }


    /**
     * Gets the dimensionGraphHeader value for this Indicator.
     * 
     * @return dimensionGraphHeader
     */
    public java.lang.String getDimensionGraphHeader() {
        return dimensionGraphHeader;
    }


    /**
     * Sets the dimensionGraphHeader value for this Indicator.
     * 
     * @param dimensionGraphHeader
     */
    public void setDimensionGraphHeader(java.lang.String dimensionGraphHeader) {
        this.dimensionGraphHeader = dimensionGraphHeader;
    }


    /**
     * Gets the dimensionGraphID value for this Indicator.
     * 
     * @return dimensionGraphID
     */
    public java.lang.Integer getDimensionGraphID() {
        return dimensionGraphID;
    }


    /**
     * Sets the dimensionGraphID value for this Indicator.
     * 
     * @param dimensionGraphID
     */
    public void setDimensionGraphID(java.lang.Integer dimensionGraphID) {
        this.dimensionGraphID = dimensionGraphID;
    }


    /**
     * Gets the dimensionGraphLabel value for this Indicator.
     * 
     * @return dimensionGraphLabel
     */
    public java.lang.String getDimensionGraphLabel() {
        return dimensionGraphLabel;
    }


    /**
     * Sets the dimensionGraphLabel value for this Indicator.
     * 
     * @param dimensionGraphLabel
     */
    public void setDimensionGraphLabel(java.lang.String dimensionGraphLabel) {
        this.dimensionGraphLabel = dimensionGraphLabel;
    }


    /**
     * Gets the disabilityStatusID value for this Indicator.
     * 
     * @return disabilityStatusID
     */
    public java.lang.Integer getDisabilityStatusID() {
        return disabilityStatusID;
    }


    /**
     * Sets the disabilityStatusID value for this Indicator.
     * 
     * @param disabilityStatusID
     */
    public void setDisabilityStatusID(java.lang.Integer disabilityStatusID) {
        this.disabilityStatusID = disabilityStatusID;
    }


    /**
     * Gets the educationLevelID value for this Indicator.
     * 
     * @return educationLevelID
     */
    public java.lang.Integer getEducationLevelID() {
        return educationLevelID;
    }


    /**
     * Sets the educationLevelID value for this Indicator.
     * 
     * @param educationLevelID
     */
    public void setEducationLevelID(java.lang.Integer educationLevelID) {
        this.educationLevelID = educationLevelID;
    }


    /**
     * Gets the ethnicityID value for this Indicator.
     * 
     * @return ethnicityID
     */
    public java.lang.Integer getEthnicityID() {
        return ethnicityID;
    }


    /**
     * Sets the ethnicityID value for this Indicator.
     * 
     * @param ethnicityID
     */
    public void setEthnicityID(java.lang.Integer ethnicityID) {
        this.ethnicityID = ethnicityID;
    }


    /**
     * Gets the familyIncomeLevelID value for this Indicator.
     * 
     * @return familyIncomeLevelID
     */
    public java.lang.Integer getFamilyIncomeLevelID() {
        return familyIncomeLevelID;
    }


    /**
     * Sets the familyIncomeLevelID value for this Indicator.
     * 
     * @param familyIncomeLevelID
     */
    public void setFamilyIncomeLevelID(java.lang.Integer familyIncomeLevelID) {
        this.familyIncomeLevelID = familyIncomeLevelID;
    }


    /**
     * Gets the familyTypeID value for this Indicator.
     * 
     * @return familyTypeID
     */
    public java.lang.Integer getFamilyTypeID() {
        return familyTypeID;
    }


    /**
     * Sets the familyTypeID value for this Indicator.
     * 
     * @param familyTypeID
     */
    public void setFamilyTypeID(java.lang.Integer familyTypeID) {
        this.familyTypeID = familyTypeID;
    }


    /**
     * Gets the floatTarget value for this Indicator.
     * 
     * @return floatTarget
     */
    public java.math.BigDecimal getFloatTarget() {
        return floatTarget;
    }


    /**
     * Sets the floatTarget value for this Indicator.
     * 
     * @param floatTarget
     */
    public void setFloatTarget(java.math.BigDecimal floatTarget) {
        this.floatTarget = floatTarget;
    }


    /**
     * Gets the floatValue value for this Indicator.
     * 
     * @return floatValue
     */
    public java.math.BigDecimal getFloatValue() {
        return floatValue;
    }


    /**
     * Sets the floatValue value for this Indicator.
     * 
     * @param floatValue
     */
    public void setFloatValue(java.math.BigDecimal floatValue) {
        this.floatValue = floatValue;
    }


    /**
     * Gets the formattedTarget value for this Indicator.
     * 
     * @return formattedTarget
     */
    public java.lang.String getFormattedTarget() {
        return formattedTarget;
    }


    /**
     * Sets the formattedTarget value for this Indicator.
     * 
     * @param formattedTarget
     */
    public void setFormattedTarget(java.lang.String formattedTarget) {
        this.formattedTarget = formattedTarget;
    }


    /**
     * Gets the formattedValue value for this Indicator.
     * 
     * @return formattedValue
     */
    public java.lang.String getFormattedValue() {
        return formattedValue;
    }


    /**
     * Sets the formattedValue value for this Indicator.
     * 
     * @param formattedValue
     */
    public void setFormattedValue(java.lang.String formattedValue) {
        this.formattedValue = formattedValue;
    }


    /**
     * Gets the genderID value for this Indicator.
     * 
     * @return genderID
     */
    public java.lang.Integer getGenderID() {
        return genderID;
    }


    /**
     * Sets the genderID value for this Indicator.
     * 
     * @param genderID
     */
    public void setGenderID(java.lang.Integer genderID) {
        this.genderID = genderID;
    }


    /**
     * Gets the healthInsuranceStatusID value for this Indicator.
     * 
     * @return healthInsuranceStatusID
     */
    public java.lang.Integer getHealthInsuranceStatusID() {
        return healthInsuranceStatusID;
    }


    /**
     * Sets the healthInsuranceStatusID value for this Indicator.
     * 
     * @param healthInsuranceStatusID
     */
    public void setHealthInsuranceStatusID(java.lang.Integer healthInsuranceStatusID) {
        this.healthInsuranceStatusID = healthInsuranceStatusID;
    }


    /**
     * Gets the ID value for this Indicator.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Indicator.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the indicatorDescriptionID value for this Indicator.
     * 
     * @return indicatorDescriptionID
     */
    public java.lang.Integer getIndicatorDescriptionID() {
        return indicatorDescriptionID;
    }


    /**
     * Sets the indicatorDescriptionID value for this Indicator.
     * 
     * @param indicatorDescriptionID
     */
    public void setIndicatorDescriptionID(java.lang.Integer indicatorDescriptionID) {
        this.indicatorDescriptionID = indicatorDescriptionID;
    }


    /**
     * Gets the integralTarget value for this Indicator.
     * 
     * @return integralTarget
     */
    public java.lang.Integer getIntegralTarget() {
        return integralTarget;
    }


    /**
     * Sets the integralTarget value for this Indicator.
     * 
     * @param integralTarget
     */
    public void setIntegralTarget(java.lang.Integer integralTarget) {
        this.integralTarget = integralTarget;
    }


    /**
     * Gets the integralValue value for this Indicator.
     * 
     * @return integralValue
     */
    public java.lang.Integer getIntegralValue() {
        return integralValue;
    }


    /**
     * Sets the integralValue value for this Indicator.
     * 
     * @param integralValue
     */
    public void setIntegralValue(java.lang.Integer integralValue) {
        this.integralValue = integralValue;
    }


    /**
     * Gets the isBaseline value for this Indicator.
     * 
     * @return isBaseline
     */
    public java.lang.Boolean getIsBaseline() {
        return isBaseline;
    }


    /**
     * Sets the isBaseline value for this Indicator.
     * 
     * @param isBaseline
     */
    public void setIsBaseline(java.lang.Boolean isBaseline) {
        this.isBaseline = isBaseline;
    }


    /**
     * Gets the localeID value for this Indicator.
     * 
     * @return localeID
     */
    public java.lang.Integer getLocaleID() {
        return localeID;
    }


    /**
     * Sets the localeID value for this Indicator.
     * 
     * @param localeID
     */
    public void setLocaleID(java.lang.Integer localeID) {
        this.localeID = localeID;
    }


    /**
     * Gets the maritalStatusID value for this Indicator.
     * 
     * @return maritalStatusID
     */
    public java.lang.Integer getMaritalStatusID() {
        return maritalStatusID;
    }


    /**
     * Sets the maritalStatusID value for this Indicator.
     * 
     * @param maritalStatusID
     */
    public void setMaritalStatusID(java.lang.Integer maritalStatusID) {
        this.maritalStatusID = maritalStatusID;
    }


    /**
     * Gets the metroLocationID value for this Indicator.
     * 
     * @return metroLocationID
     */
    public java.lang.Integer getMetroLocationID() {
        return metroLocationID;
    }


    /**
     * Sets the metroLocationID value for this Indicator.
     * 
     * @param metroLocationID
     */
    public void setMetroLocationID(java.lang.Integer metroLocationID) {
        this.metroLocationID = metroLocationID;
    }


    /**
     * Gets the otherID value for this Indicator.
     * 
     * @return otherID
     */
    public java.lang.Integer getOtherID() {
        return otherID;
    }


    /**
     * Sets the otherID value for this Indicator.
     * 
     * @param otherID
     */
    public void setOtherID(java.lang.Integer otherID) {
        this.otherID = otherID;
    }


    /**
     * Gets the schoolGradeLevelID value for this Indicator.
     * 
     * @return schoolGradeLevelID
     */
    public java.lang.Integer getSchoolGradeLevelID() {
        return schoolGradeLevelID;
    }


    /**
     * Sets the schoolGradeLevelID value for this Indicator.
     * 
     * @param schoolGradeLevelID
     */
    public void setSchoolGradeLevelID(java.lang.Integer schoolGradeLevelID) {
        this.schoolGradeLevelID = schoolGradeLevelID;
    }


    /**
     * Gets the sexualOrientationID value for this Indicator.
     * 
     * @return sexualOrientationID
     */
    public java.lang.Integer getSexualOrientationID() {
        return sexualOrientationID;
    }


    /**
     * Sets the sexualOrientationID value for this Indicator.
     * 
     * @param sexualOrientationID
     */
    public void setSexualOrientationID(java.lang.Integer sexualOrientationID) {
        this.sexualOrientationID = sexualOrientationID;
    }


    /**
     * Gets the sourceColumnName value for this Indicator.
     * 
     * @return sourceColumnName
     */
    public java.lang.String getSourceColumnName() {
        return sourceColumnName;
    }


    /**
     * Sets the sourceColumnName value for this Indicator.
     * 
     * @param sourceColumnName
     */
    public void setSourceColumnName(java.lang.String sourceColumnName) {
        this.sourceColumnName = sourceColumnName;
    }


    /**
     * Gets the sourceID value for this Indicator.
     * 
     * @return sourceID
     */
    public java.lang.Integer getSourceID() {
        return sourceID;
    }


    /**
     * Sets the sourceID value for this Indicator.
     * 
     * @param sourceID
     */
    public void setSourceID(java.lang.Integer sourceID) {
        this.sourceID = sourceID;
    }


    /**
     * Gets the standardError value for this Indicator.
     * 
     * @return standardError
     */
    public java.math.BigDecimal getStandardError() {
        return standardError;
    }


    /**
     * Sets the standardError value for this Indicator.
     * 
     * @param standardError
     */
    public void setStandardError(java.math.BigDecimal standardError) {
        this.standardError = standardError;
    }


    /**
     * Gets the textualValue value for this Indicator.
     * 
     * @return textualValue
     */
    public java.lang.String getTextualValue() {
        return textualValue;
    }


    /**
     * Sets the textualValue value for this Indicator.
     * 
     * @param textualValue
     */
    public void setTextualValue(java.lang.String textualValue) {
        this.textualValue = textualValue;
    }


    /**
     * Gets the timeframeID value for this Indicator.
     * 
     * @return timeframeID
     */
    public java.lang.Integer getTimeframeID() {
        return timeframeID;
    }


    /**
     * Sets the timeframeID value for this Indicator.
     * 
     * @param timeframeID
     */
    public void setTimeframeID(java.lang.Integer timeframeID) {
        this.timeframeID = timeframeID;
    }


    /**
     * Gets the totalID value for this Indicator.
     * 
     * @return totalID
     */
    public java.lang.Integer getTotalID() {
        return totalID;
    }


    /**
     * Sets the totalID value for this Indicator.
     * 
     * @param totalID
     */
    public void setTotalID(java.lang.Integer totalID) {
        this.totalID = totalID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Indicator)) return false;
        Indicator other = (Indicator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adjustmentID==null && other.getAdjustmentID()==null) || 
             (this.adjustmentID!=null &&
              this.adjustmentID.equals(other.getAdjustmentID()))) &&
            ((this.ageAdjustmentID==null && other.getAgeAdjustmentID()==null) || 
             (this.ageAdjustmentID!=null &&
              this.ageAdjustmentID.equals(other.getAgeAdjustmentID()))) &&
            ((this.ageAdjustmentValue==null && other.getAgeAdjustmentValue()==null) || 
             (this.ageAdjustmentValue!=null &&
              this.ageAdjustmentValue.equals(other.getAgeAdjustmentValue()))) &&
            ((this.ageRangeID==null && other.getAgeRangeID()==null) || 
             (this.ageRangeID!=null &&
              this.ageRangeID.equals(other.getAgeRangeID()))) &&
            ((this.chronicConditionID==null && other.getChronicConditionID()==null) || 
             (this.chronicConditionID!=null &&
              this.chronicConditionID.equals(other.getChronicConditionID()))) &&
            ((this.confidenceIntervalHigh==null && other.getConfidenceIntervalHigh()==null) || 
             (this.confidenceIntervalHigh!=null &&
              this.confidenceIntervalHigh.equals(other.getConfidenceIntervalHigh()))) &&
            ((this.confidenceIntervalHighFormatted==null && other.getConfidenceIntervalHighFormatted()==null) || 
             (this.confidenceIntervalHighFormatted!=null &&
              this.confidenceIntervalHighFormatted.equals(other.getConfidenceIntervalHighFormatted()))) &&
            ((this.confidenceIntervalLow==null && other.getConfidenceIntervalLow()==null) || 
             (this.confidenceIntervalLow!=null &&
              this.confidenceIntervalLow.equals(other.getConfidenceIntervalLow()))) &&
            ((this.confidenceIntervalLowFormatted==null && other.getConfidenceIntervalLowFormatted()==null) || 
             (this.confidenceIntervalLowFormatted!=null &&
              this.confidenceIntervalLowFormatted.equals(other.getConfidenceIntervalLowFormatted()))) &&
            ((this.dimensionGraphHeader==null && other.getDimensionGraphHeader()==null) || 
             (this.dimensionGraphHeader!=null &&
              this.dimensionGraphHeader.equals(other.getDimensionGraphHeader()))) &&
            ((this.dimensionGraphID==null && other.getDimensionGraphID()==null) || 
             (this.dimensionGraphID!=null &&
              this.dimensionGraphID.equals(other.getDimensionGraphID()))) &&
            ((this.dimensionGraphLabel==null && other.getDimensionGraphLabel()==null) || 
             (this.dimensionGraphLabel!=null &&
              this.dimensionGraphLabel.equals(other.getDimensionGraphLabel()))) &&
            ((this.disabilityStatusID==null && other.getDisabilityStatusID()==null) || 
             (this.disabilityStatusID!=null &&
              this.disabilityStatusID.equals(other.getDisabilityStatusID()))) &&
            ((this.educationLevelID==null && other.getEducationLevelID()==null) || 
             (this.educationLevelID!=null &&
              this.educationLevelID.equals(other.getEducationLevelID()))) &&
            ((this.ethnicityID==null && other.getEthnicityID()==null) || 
             (this.ethnicityID!=null &&
              this.ethnicityID.equals(other.getEthnicityID()))) &&
            ((this.familyIncomeLevelID==null && other.getFamilyIncomeLevelID()==null) || 
             (this.familyIncomeLevelID!=null &&
              this.familyIncomeLevelID.equals(other.getFamilyIncomeLevelID()))) &&
            ((this.familyTypeID==null && other.getFamilyTypeID()==null) || 
             (this.familyTypeID!=null &&
              this.familyTypeID.equals(other.getFamilyTypeID()))) &&
            ((this.floatTarget==null && other.getFloatTarget()==null) || 
             (this.floatTarget!=null &&
              this.floatTarget.equals(other.getFloatTarget()))) &&
            ((this.floatValue==null && other.getFloatValue()==null) || 
             (this.floatValue!=null &&
              this.floatValue.equals(other.getFloatValue()))) &&
            ((this.formattedTarget==null && other.getFormattedTarget()==null) || 
             (this.formattedTarget!=null &&
              this.formattedTarget.equals(other.getFormattedTarget()))) &&
            ((this.formattedValue==null && other.getFormattedValue()==null) || 
             (this.formattedValue!=null &&
              this.formattedValue.equals(other.getFormattedValue()))) &&
            ((this.genderID==null && other.getGenderID()==null) || 
             (this.genderID!=null &&
              this.genderID.equals(other.getGenderID()))) &&
            ((this.healthInsuranceStatusID==null && other.getHealthInsuranceStatusID()==null) || 
             (this.healthInsuranceStatusID!=null &&
              this.healthInsuranceStatusID.equals(other.getHealthInsuranceStatusID()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.indicatorDescriptionID==null && other.getIndicatorDescriptionID()==null) || 
             (this.indicatorDescriptionID!=null &&
              this.indicatorDescriptionID.equals(other.getIndicatorDescriptionID()))) &&
            ((this.integralTarget==null && other.getIntegralTarget()==null) || 
             (this.integralTarget!=null &&
              this.integralTarget.equals(other.getIntegralTarget()))) &&
            ((this.integralValue==null && other.getIntegralValue()==null) || 
             (this.integralValue!=null &&
              this.integralValue.equals(other.getIntegralValue()))) &&
            ((this.isBaseline==null && other.getIsBaseline()==null) || 
             (this.isBaseline!=null &&
              this.isBaseline.equals(other.getIsBaseline()))) &&
            ((this.localeID==null && other.getLocaleID()==null) || 
             (this.localeID!=null &&
              this.localeID.equals(other.getLocaleID()))) &&
            ((this.maritalStatusID==null && other.getMaritalStatusID()==null) || 
             (this.maritalStatusID!=null &&
              this.maritalStatusID.equals(other.getMaritalStatusID()))) &&
            ((this.metroLocationID==null && other.getMetroLocationID()==null) || 
             (this.metroLocationID!=null &&
              this.metroLocationID.equals(other.getMetroLocationID()))) &&
            ((this.otherID==null && other.getOtherID()==null) || 
             (this.otherID!=null &&
              this.otherID.equals(other.getOtherID()))) &&
            ((this.schoolGradeLevelID==null && other.getSchoolGradeLevelID()==null) || 
             (this.schoolGradeLevelID!=null &&
              this.schoolGradeLevelID.equals(other.getSchoolGradeLevelID()))) &&
            ((this.sexualOrientationID==null && other.getSexualOrientationID()==null) || 
             (this.sexualOrientationID!=null &&
              this.sexualOrientationID.equals(other.getSexualOrientationID()))) &&
            ((this.sourceColumnName==null && other.getSourceColumnName()==null) || 
             (this.sourceColumnName!=null &&
              this.sourceColumnName.equals(other.getSourceColumnName()))) &&
            ((this.sourceID==null && other.getSourceID()==null) || 
             (this.sourceID!=null &&
              this.sourceID.equals(other.getSourceID()))) &&
            ((this.standardError==null && other.getStandardError()==null) || 
             (this.standardError!=null &&
              this.standardError.equals(other.getStandardError()))) &&
            ((this.textualValue==null && other.getTextualValue()==null) || 
             (this.textualValue!=null &&
              this.textualValue.equals(other.getTextualValue()))) &&
            ((this.timeframeID==null && other.getTimeframeID()==null) || 
             (this.timeframeID!=null &&
              this.timeframeID.equals(other.getTimeframeID()))) &&
            ((this.totalID==null && other.getTotalID()==null) || 
             (this.totalID!=null &&
              this.totalID.equals(other.getTotalID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAdjustmentID() != null) {
            _hashCode += getAdjustmentID().hashCode();
        }
        if (getAgeAdjustmentID() != null) {
            _hashCode += getAgeAdjustmentID().hashCode();
        }
        if (getAgeAdjustmentValue() != null) {
            _hashCode += getAgeAdjustmentValue().hashCode();
        }
        if (getAgeRangeID() != null) {
            _hashCode += getAgeRangeID().hashCode();
        }
        if (getChronicConditionID() != null) {
            _hashCode += getChronicConditionID().hashCode();
        }
        if (getConfidenceIntervalHigh() != null) {
            _hashCode += getConfidenceIntervalHigh().hashCode();
        }
        if (getConfidenceIntervalHighFormatted() != null) {
            _hashCode += getConfidenceIntervalHighFormatted().hashCode();
        }
        if (getConfidenceIntervalLow() != null) {
            _hashCode += getConfidenceIntervalLow().hashCode();
        }
        if (getConfidenceIntervalLowFormatted() != null) {
            _hashCode += getConfidenceIntervalLowFormatted().hashCode();
        }
        if (getDimensionGraphHeader() != null) {
            _hashCode += getDimensionGraphHeader().hashCode();
        }
        if (getDimensionGraphID() != null) {
            _hashCode += getDimensionGraphID().hashCode();
        }
        if (getDimensionGraphLabel() != null) {
            _hashCode += getDimensionGraphLabel().hashCode();
        }
        if (getDisabilityStatusID() != null) {
            _hashCode += getDisabilityStatusID().hashCode();
        }
        if (getEducationLevelID() != null) {
            _hashCode += getEducationLevelID().hashCode();
        }
        if (getEthnicityID() != null) {
            _hashCode += getEthnicityID().hashCode();
        }
        if (getFamilyIncomeLevelID() != null) {
            _hashCode += getFamilyIncomeLevelID().hashCode();
        }
        if (getFamilyTypeID() != null) {
            _hashCode += getFamilyTypeID().hashCode();
        }
        if (getFloatTarget() != null) {
            _hashCode += getFloatTarget().hashCode();
        }
        if (getFloatValue() != null) {
            _hashCode += getFloatValue().hashCode();
        }
        if (getFormattedTarget() != null) {
            _hashCode += getFormattedTarget().hashCode();
        }
        if (getFormattedValue() != null) {
            _hashCode += getFormattedValue().hashCode();
        }
        if (getGenderID() != null) {
            _hashCode += getGenderID().hashCode();
        }
        if (getHealthInsuranceStatusID() != null) {
            _hashCode += getHealthInsuranceStatusID().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIndicatorDescriptionID() != null) {
            _hashCode += getIndicatorDescriptionID().hashCode();
        }
        if (getIntegralTarget() != null) {
            _hashCode += getIntegralTarget().hashCode();
        }
        if (getIntegralValue() != null) {
            _hashCode += getIntegralValue().hashCode();
        }
        if (getIsBaseline() != null) {
            _hashCode += getIsBaseline().hashCode();
        }
        if (getLocaleID() != null) {
            _hashCode += getLocaleID().hashCode();
        }
        if (getMaritalStatusID() != null) {
            _hashCode += getMaritalStatusID().hashCode();
        }
        if (getMetroLocationID() != null) {
            _hashCode += getMetroLocationID().hashCode();
        }
        if (getOtherID() != null) {
            _hashCode += getOtherID().hashCode();
        }
        if (getSchoolGradeLevelID() != null) {
            _hashCode += getSchoolGradeLevelID().hashCode();
        }
        if (getSexualOrientationID() != null) {
            _hashCode += getSexualOrientationID().hashCode();
        }
        if (getSourceColumnName() != null) {
            _hashCode += getSourceColumnName().hashCode();
        }
        if (getSourceID() != null) {
            _hashCode += getSourceID().hashCode();
        }
        if (getStandardError() != null) {
            _hashCode += getStandardError().hashCode();
        }
        if (getTextualValue() != null) {
            _hashCode += getTextualValue().hashCode();
        }
        if (getTimeframeID() != null) {
            _hashCode += getTimeframeID().hashCode();
        }
        if (getTotalID() != null) {
            _hashCode += getTotalID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Indicator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Indicator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "AdjustmentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageAdjustmentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "AgeAdjustmentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageAdjustmentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "AgeAdjustmentValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageRangeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "AgeRangeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chronicConditionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ChronicConditionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidenceIntervalHigh");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ConfidenceIntervalHigh"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidenceIntervalHighFormatted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ConfidenceIntervalHighFormatted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidenceIntervalLow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ConfidenceIntervalLow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidenceIntervalLowFormatted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ConfidenceIntervalLowFormatted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionGraphHeader");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DimensionGraphHeader"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionGraphID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DimensionGraphID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionGraphLabel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DimensionGraphLabel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabilityStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DisabilityStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationLevelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "EducationLevelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnicityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "EthnicityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyIncomeLevelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FamilyIncomeLevelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FamilyTypeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floatTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FloatTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("floatValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FloatValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formattedTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FormattedTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formattedValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FormattedValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genderID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "GenderID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthInsuranceStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "HealthInsuranceStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatorDescriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorDescriptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integralTarget");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IntegralTarget"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("integralValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IntegralValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBaseline");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IsBaseline"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("localeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "LocaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatusID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "MaritalStatusID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metroLocationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "MetroLocationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("otherID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "OtherID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schoolGradeLevelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SchoolGradeLevelID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexualOrientationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SexualOrientationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceColumnName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SourceColumnName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sourceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SourceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("standardError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "StandardError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("textualValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "TextualValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeframeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "TimeframeID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "TotalID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
