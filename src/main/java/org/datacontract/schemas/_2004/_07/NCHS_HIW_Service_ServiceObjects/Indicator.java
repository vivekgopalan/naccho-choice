/**
 * Indicator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class Indicator  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.Indicator  implements java.io.Serializable {
    private java.lang.String adjustment;

    private java.lang.String ageAdjustment;

    private java.lang.String ageRange;

    private java.lang.String chronicCondition;

    private java.lang.String dimensionGraph;

    private java.lang.String disabilityStatus;

    private java.lang.String educationLevel;

    private java.lang.String ethnicity;

    private java.lang.String familyIncomeLevel;

    private java.lang.String familyType;

    private java.lang.String gender;

    private java.lang.String healthInsuranceStatus;

    private java.lang.String indicatorDescription;

    private java.lang.String locale;

    private java.lang.String maritalStatus;

    private java.lang.String metroLocation;

    private java.lang.String other;

    private java.lang.String schoolGradeLevel;

    private java.lang.String sexualOrientation;

    private java.lang.String timeframe;

    private java.lang.String total;

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
           java.lang.Integer totalID,
           java.lang.String adjustment,
           java.lang.String ageAdjustment,
           java.lang.String ageRange,
           java.lang.String chronicCondition,
           java.lang.String dimensionGraph,
           java.lang.String disabilityStatus,
           java.lang.String educationLevel,
           java.lang.String ethnicity,
           java.lang.String familyIncomeLevel,
           java.lang.String familyType,
           java.lang.String gender,
           java.lang.String healthInsuranceStatus,
           java.lang.String indicatorDescription,
           java.lang.String locale,
           java.lang.String maritalStatus,
           java.lang.String metroLocation,
           java.lang.String other,
           java.lang.String schoolGradeLevel,
           java.lang.String sexualOrientation,
           java.lang.String timeframe,
           java.lang.String total) {
        super(
            adjustmentID,
            ageAdjustmentID,
            ageAdjustmentValue,
            ageRangeID,
            chronicConditionID,
            confidenceIntervalHigh,
            confidenceIntervalHighFormatted,
            confidenceIntervalLow,
            confidenceIntervalLowFormatted,
            dimensionGraphHeader,
            dimensionGraphID,
            dimensionGraphLabel,
            disabilityStatusID,
            educationLevelID,
            ethnicityID,
            familyIncomeLevelID,
            familyTypeID,
            floatTarget,
            floatValue,
            formattedTarget,
            formattedValue,
            genderID,
            healthInsuranceStatusID,
            ID,
            indicatorDescriptionID,
            integralTarget,
            integralValue,
            isBaseline,
            localeID,
            maritalStatusID,
            metroLocationID,
            otherID,
            schoolGradeLevelID,
            sexualOrientationID,
            sourceColumnName,
            sourceID,
            standardError,
            textualValue,
            timeframeID,
            totalID);
        this.adjustment = adjustment;
        this.ageAdjustment = ageAdjustment;
        this.ageRange = ageRange;
        this.chronicCondition = chronicCondition;
        this.dimensionGraph = dimensionGraph;
        this.disabilityStatus = disabilityStatus;
        this.educationLevel = educationLevel;
        this.ethnicity = ethnicity;
        this.familyIncomeLevel = familyIncomeLevel;
        this.familyType = familyType;
        this.gender = gender;
        this.healthInsuranceStatus = healthInsuranceStatus;
        this.indicatorDescription = indicatorDescription;
        this.locale = locale;
        this.maritalStatus = maritalStatus;
        this.metroLocation = metroLocation;
        this.other = other;
        this.schoolGradeLevel = schoolGradeLevel;
        this.sexualOrientation = sexualOrientation;
        this.timeframe = timeframe;
        this.total = total;
    }


    /**
     * Gets the adjustment value for this Indicator.
     * 
     * @return adjustment
     */
    public java.lang.String getAdjustment() {
        return adjustment;
    }


    /**
     * Sets the adjustment value for this Indicator.
     * 
     * @param adjustment
     */
    public void setAdjustment(java.lang.String adjustment) {
        this.adjustment = adjustment;
    }


    /**
     * Gets the ageAdjustment value for this Indicator.
     * 
     * @return ageAdjustment
     */
    public java.lang.String getAgeAdjustment() {
        return ageAdjustment;
    }


    /**
     * Sets the ageAdjustment value for this Indicator.
     * 
     * @param ageAdjustment
     */
    public void setAgeAdjustment(java.lang.String ageAdjustment) {
        this.ageAdjustment = ageAdjustment;
    }


    /**
     * Gets the ageRange value for this Indicator.
     * 
     * @return ageRange
     */
    public java.lang.String getAgeRange() {
        return ageRange;
    }


    /**
     * Sets the ageRange value for this Indicator.
     * 
     * @param ageRange
     */
    public void setAgeRange(java.lang.String ageRange) {
        this.ageRange = ageRange;
    }


    /**
     * Gets the chronicCondition value for this Indicator.
     * 
     * @return chronicCondition
     */
    public java.lang.String getChronicCondition() {
        return chronicCondition;
    }


    /**
     * Sets the chronicCondition value for this Indicator.
     * 
     * @param chronicCondition
     */
    public void setChronicCondition(java.lang.String chronicCondition) {
        this.chronicCondition = chronicCondition;
    }


    /**
     * Gets the dimensionGraph value for this Indicator.
     * 
     * @return dimensionGraph
     */
    public java.lang.String getDimensionGraph() {
        return dimensionGraph;
    }


    /**
     * Sets the dimensionGraph value for this Indicator.
     * 
     * @param dimensionGraph
     */
    public void setDimensionGraph(java.lang.String dimensionGraph) {
        this.dimensionGraph = dimensionGraph;
    }


    /**
     * Gets the disabilityStatus value for this Indicator.
     * 
     * @return disabilityStatus
     */
    public java.lang.String getDisabilityStatus() {
        return disabilityStatus;
    }


    /**
     * Sets the disabilityStatus value for this Indicator.
     * 
     * @param disabilityStatus
     */
    public void setDisabilityStatus(java.lang.String disabilityStatus) {
        this.disabilityStatus = disabilityStatus;
    }


    /**
     * Gets the educationLevel value for this Indicator.
     * 
     * @return educationLevel
     */
    public java.lang.String getEducationLevel() {
        return educationLevel;
    }


    /**
     * Sets the educationLevel value for this Indicator.
     * 
     * @param educationLevel
     */
    public void setEducationLevel(java.lang.String educationLevel) {
        this.educationLevel = educationLevel;
    }


    /**
     * Gets the ethnicity value for this Indicator.
     * 
     * @return ethnicity
     */
    public java.lang.String getEthnicity() {
        return ethnicity;
    }


    /**
     * Sets the ethnicity value for this Indicator.
     * 
     * @param ethnicity
     */
    public void setEthnicity(java.lang.String ethnicity) {
        this.ethnicity = ethnicity;
    }


    /**
     * Gets the familyIncomeLevel value for this Indicator.
     * 
     * @return familyIncomeLevel
     */
    public java.lang.String getFamilyIncomeLevel() {
        return familyIncomeLevel;
    }


    /**
     * Sets the familyIncomeLevel value for this Indicator.
     * 
     * @param familyIncomeLevel
     */
    public void setFamilyIncomeLevel(java.lang.String familyIncomeLevel) {
        this.familyIncomeLevel = familyIncomeLevel;
    }


    /**
     * Gets the familyType value for this Indicator.
     * 
     * @return familyType
     */
    public java.lang.String getFamilyType() {
        return familyType;
    }


    /**
     * Sets the familyType value for this Indicator.
     * 
     * @param familyType
     */
    public void setFamilyType(java.lang.String familyType) {
        this.familyType = familyType;
    }


    /**
     * Gets the gender value for this Indicator.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this Indicator.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the healthInsuranceStatus value for this Indicator.
     * 
     * @return healthInsuranceStatus
     */
    public java.lang.String getHealthInsuranceStatus() {
        return healthInsuranceStatus;
    }


    /**
     * Sets the healthInsuranceStatus value for this Indicator.
     * 
     * @param healthInsuranceStatus
     */
    public void setHealthInsuranceStatus(java.lang.String healthInsuranceStatus) {
        this.healthInsuranceStatus = healthInsuranceStatus;
    }


    /**
     * Gets the indicatorDescription value for this Indicator.
     * 
     * @return indicatorDescription
     */
    public java.lang.String getIndicatorDescription() {
        return indicatorDescription;
    }


    /**
     * Sets the indicatorDescription value for this Indicator.
     * 
     * @param indicatorDescription
     */
    public void setIndicatorDescription(java.lang.String indicatorDescription) {
        this.indicatorDescription = indicatorDescription;
    }


    /**
     * Gets the locale value for this Indicator.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this Indicator.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the maritalStatus value for this Indicator.
     * 
     * @return maritalStatus
     */
    public java.lang.String getMaritalStatus() {
        return maritalStatus;
    }


    /**
     * Sets the maritalStatus value for this Indicator.
     * 
     * @param maritalStatus
     */
    public void setMaritalStatus(java.lang.String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }


    /**
     * Gets the metroLocation value for this Indicator.
     * 
     * @return metroLocation
     */
    public java.lang.String getMetroLocation() {
        return metroLocation;
    }


    /**
     * Sets the metroLocation value for this Indicator.
     * 
     * @param metroLocation
     */
    public void setMetroLocation(java.lang.String metroLocation) {
        this.metroLocation = metroLocation;
    }


    /**
     * Gets the other value for this Indicator.
     * 
     * @return other
     */
    public java.lang.String getOther() {
        return other;
    }


    /**
     * Sets the other value for this Indicator.
     * 
     * @param other
     */
    public void setOther(java.lang.String other) {
        this.other = other;
    }


    /**
     * Gets the schoolGradeLevel value for this Indicator.
     * 
     * @return schoolGradeLevel
     */
    public java.lang.String getSchoolGradeLevel() {
        return schoolGradeLevel;
    }


    /**
     * Sets the schoolGradeLevel value for this Indicator.
     * 
     * @param schoolGradeLevel
     */
    public void setSchoolGradeLevel(java.lang.String schoolGradeLevel) {
        this.schoolGradeLevel = schoolGradeLevel;
    }


    /**
     * Gets the sexualOrientation value for this Indicator.
     * 
     * @return sexualOrientation
     */
    public java.lang.String getSexualOrientation() {
        return sexualOrientation;
    }


    /**
     * Sets the sexualOrientation value for this Indicator.
     * 
     * @param sexualOrientation
     */
    public void setSexualOrientation(java.lang.String sexualOrientation) {
        this.sexualOrientation = sexualOrientation;
    }


    /**
     * Gets the timeframe value for this Indicator.
     * 
     * @return timeframe
     */
    public java.lang.String getTimeframe() {
        return timeframe;
    }


    /**
     * Sets the timeframe value for this Indicator.
     * 
     * @param timeframe
     */
    public void setTimeframe(java.lang.String timeframe) {
        this.timeframe = timeframe;
    }


    /**
     * Gets the total value for this Indicator.
     * 
     * @return total
     */
    public java.lang.String getTotal() {
        return total;
    }


    /**
     * Sets the total value for this Indicator.
     * 
     * @param total
     */
    public void setTotal(java.lang.String total) {
        this.total = total;
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
        _equals = super.equals(obj) && 
            ((this.adjustment==null && other.getAdjustment()==null) || 
             (this.adjustment!=null &&
              this.adjustment.equals(other.getAdjustment()))) &&
            ((this.ageAdjustment==null && other.getAgeAdjustment()==null) || 
             (this.ageAdjustment!=null &&
              this.ageAdjustment.equals(other.getAgeAdjustment()))) &&
            ((this.ageRange==null && other.getAgeRange()==null) || 
             (this.ageRange!=null &&
              this.ageRange.equals(other.getAgeRange()))) &&
            ((this.chronicCondition==null && other.getChronicCondition()==null) || 
             (this.chronicCondition!=null &&
              this.chronicCondition.equals(other.getChronicCondition()))) &&
            ((this.dimensionGraph==null && other.getDimensionGraph()==null) || 
             (this.dimensionGraph!=null &&
              this.dimensionGraph.equals(other.getDimensionGraph()))) &&
            ((this.disabilityStatus==null && other.getDisabilityStatus()==null) || 
             (this.disabilityStatus!=null &&
              this.disabilityStatus.equals(other.getDisabilityStatus()))) &&
            ((this.educationLevel==null && other.getEducationLevel()==null) || 
             (this.educationLevel!=null &&
              this.educationLevel.equals(other.getEducationLevel()))) &&
            ((this.ethnicity==null && other.getEthnicity()==null) || 
             (this.ethnicity!=null &&
              this.ethnicity.equals(other.getEthnicity()))) &&
            ((this.familyIncomeLevel==null && other.getFamilyIncomeLevel()==null) || 
             (this.familyIncomeLevel!=null &&
              this.familyIncomeLevel.equals(other.getFamilyIncomeLevel()))) &&
            ((this.familyType==null && other.getFamilyType()==null) || 
             (this.familyType!=null &&
              this.familyType.equals(other.getFamilyType()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.healthInsuranceStatus==null && other.getHealthInsuranceStatus()==null) || 
             (this.healthInsuranceStatus!=null &&
              this.healthInsuranceStatus.equals(other.getHealthInsuranceStatus()))) &&
            ((this.indicatorDescription==null && other.getIndicatorDescription()==null) || 
             (this.indicatorDescription!=null &&
              this.indicatorDescription.equals(other.getIndicatorDescription()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.maritalStatus==null && other.getMaritalStatus()==null) || 
             (this.maritalStatus!=null &&
              this.maritalStatus.equals(other.getMaritalStatus()))) &&
            ((this.metroLocation==null && other.getMetroLocation()==null) || 
             (this.metroLocation!=null &&
              this.metroLocation.equals(other.getMetroLocation()))) &&
            ((this.other==null && other.getOther()==null) || 
             (this.other!=null &&
              this.other.equals(other.getOther()))) &&
            ((this.schoolGradeLevel==null && other.getSchoolGradeLevel()==null) || 
             (this.schoolGradeLevel!=null &&
              this.schoolGradeLevel.equals(other.getSchoolGradeLevel()))) &&
            ((this.sexualOrientation==null && other.getSexualOrientation()==null) || 
             (this.sexualOrientation!=null &&
              this.sexualOrientation.equals(other.getSexualOrientation()))) &&
            ((this.timeframe==null && other.getTimeframe()==null) || 
             (this.timeframe!=null &&
              this.timeframe.equals(other.getTimeframe()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getAdjustment() != null) {
            _hashCode += getAdjustment().hashCode();
        }
        if (getAgeAdjustment() != null) {
            _hashCode += getAgeAdjustment().hashCode();
        }
        if (getAgeRange() != null) {
            _hashCode += getAgeRange().hashCode();
        }
        if (getChronicCondition() != null) {
            _hashCode += getChronicCondition().hashCode();
        }
        if (getDimensionGraph() != null) {
            _hashCode += getDimensionGraph().hashCode();
        }
        if (getDisabilityStatus() != null) {
            _hashCode += getDisabilityStatus().hashCode();
        }
        if (getEducationLevel() != null) {
            _hashCode += getEducationLevel().hashCode();
        }
        if (getEthnicity() != null) {
            _hashCode += getEthnicity().hashCode();
        }
        if (getFamilyIncomeLevel() != null) {
            _hashCode += getFamilyIncomeLevel().hashCode();
        }
        if (getFamilyType() != null) {
            _hashCode += getFamilyType().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getHealthInsuranceStatus() != null) {
            _hashCode += getHealthInsuranceStatus().hashCode();
        }
        if (getIndicatorDescription() != null) {
            _hashCode += getIndicatorDescription().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getMaritalStatus() != null) {
            _hashCode += getMaritalStatus().hashCode();
        }
        if (getMetroLocation() != null) {
            _hashCode += getMetroLocation().hashCode();
        }
        if (getOther() != null) {
            _hashCode += getOther().hashCode();
        }
        if (getSchoolGradeLevel() != null) {
            _hashCode += getSchoolGradeLevel().hashCode();
        }
        if (getSexualOrientation() != null) {
            _hashCode += getSexualOrientation().hashCode();
        }
        if (getTimeframe() != null) {
            _hashCode += getTimeframe().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Indicator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Indicator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Adjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageAdjustment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "AgeAdjustment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ageRange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "AgeRange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chronicCondition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "ChronicCondition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dimensionGraph");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "DimensionGraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disabilityStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "DisabilityStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("educationLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "EducationLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ethnicity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Ethnicity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyIncomeLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "FamilyIncomeLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("familyType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "FamilyType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("healthInsuranceStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "HealthInsuranceStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "MaritalStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metroLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "MetroLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("other");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Other"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schoolGradeLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "SchoolGradeLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sexualOrientation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "SexualOrientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeframe");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Timeframe"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Total"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
