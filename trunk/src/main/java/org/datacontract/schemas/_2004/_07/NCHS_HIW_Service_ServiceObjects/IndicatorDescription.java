/**
 * IndicatorDescription.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class IndicatorDescription  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.IndicatorDescription  implements java.io.Serializable {
    private java.lang.String endYear;

    private java.lang.String startYear;

    public IndicatorDescription() {
    }

    public IndicatorDescription(
           java.lang.String caveatsAndLimitations,
           java.lang.String dataSupplier,
           java.lang.String dataType,
           java.lang.String denominatorDescription,
           java.lang.Integer endYearID,
           java.lang.String footNote1,
           java.lang.String footNote2,
           java.lang.String footNote3,
           java.lang.String fullDescription,
           java.lang.String geographicLevels,
           java.lang.Double healthyPeople2020Target,
           java.lang.Integer ID,
           java.lang.String indicatorNumber,
           java.lang.Boolean isWeighted,
           java.lang.String localeLevel,
           java.lang.String moreInfoText1,
           java.lang.String moreInfoText2,
           java.lang.String moreInfoText3,
           java.lang.String moreInfoUrl1,
           java.lang.String moreInfoUrl2,
           java.lang.String moreInfoUrl3,
           java.lang.String numeratorDescription,
           java.lang.String otherDataSource,
           java.lang.String reference1,
           java.lang.String reference2,
           java.lang.String reference3,
           java.lang.String reference4,
           java.lang.String shortDescription,
           java.lang.Boolean showMe,
           java.lang.Integer sortOrder,
           java.lang.Integer startYearID,
           java.lang.String trendIssues,
           java.lang.String valueLabel,
           java.lang.Double cacheMaxValue,
           java.lang.Double cacheMinValue,
           java.lang.Boolean hasTrendYears,
           java.lang.String endYear,
           java.lang.String startYear) {
        super(
            caveatsAndLimitations,
            dataSupplier,
            dataType,
            denominatorDescription,
            endYearID,
            footNote1,
            footNote2,
            footNote3,
            fullDescription,
            geographicLevels,
            healthyPeople2020Target,
            ID,
            indicatorNumber,
            isWeighted,
            localeLevel,
            moreInfoText1,
            moreInfoText2,
            moreInfoText3,
            moreInfoUrl1,
            moreInfoUrl2,
            moreInfoUrl3,
            numeratorDescription,
            otherDataSource,
            reference1,
            reference2,
            reference3,
            reference4,
            shortDescription,
            showMe,
            sortOrder,
            startYearID,
            trendIssues,
            valueLabel,
            cacheMaxValue,
            cacheMinValue,
            hasTrendYears);
        this.endYear = endYear;
        this.startYear = startYear;
    }


    /**
     * Gets the endYear value for this IndicatorDescription.
     * 
     * @return endYear
     */
    public java.lang.String getEndYear() {
        return endYear;
    }


    /**
     * Sets the endYear value for this IndicatorDescription.
     * 
     * @param endYear
     */
    public void setEndYear(java.lang.String endYear) {
        this.endYear = endYear;
    }


    /**
     * Gets the startYear value for this IndicatorDescription.
     * 
     * @return startYear
     */
    public java.lang.String getStartYear() {
        return startYear;
    }


    /**
     * Sets the startYear value for this IndicatorDescription.
     * 
     * @param startYear
     */
    public void setStartYear(java.lang.String startYear) {
        this.startYear = startYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicatorDescription)) return false;
        IndicatorDescription other = (IndicatorDescription) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.endYear==null && other.getEndYear()==null) || 
             (this.endYear!=null &&
              this.endYear.equals(other.getEndYear()))) &&
            ((this.startYear==null && other.getStartYear()==null) || 
             (this.startYear!=null &&
              this.startYear.equals(other.getStartYear())));
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
        if (getEndYear() != null) {
            _hashCode += getEndYear().hashCode();
        }
        if (getStartYear() != null) {
            _hashCode += getStartYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorDescription.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorDescription"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "EndYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "StartYear"));
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
