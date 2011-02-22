/**
 * DataSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class DataSource  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.DataSource  implements java.io.Serializable {
    private java.lang.String endYear;

    private java.lang.String startYear;

    public DataSource() {
    }

    public DataSource(
           java.lang.String acronym,
           java.lang.String dataLimitations,
           java.lang.String dataYearsAvailable,
           java.lang.String description,
           java.lang.Integer endYearID,
           java.lang.Integer ID,
           java.lang.String interpretationIssues,
           java.lang.String methodology,
           java.lang.String mode,
           java.lang.String name,
           java.lang.String periodicity,
           java.lang.String populationCovered,
           java.lang.String references1,
           java.lang.String references2,
           java.lang.String references3,
           java.lang.String references4,
           java.lang.String responseRateAndSampleSize,
           java.lang.String selectedContent,
           java.lang.Integer sortOrder,
           java.lang.Integer startYearID,
           java.lang.String supplierAcronym,
           java.lang.String supplierName,
           java.lang.String suppressionCriteria,
           java.lang.String URL,
           java.lang.String endYear,
           java.lang.String startYear) {
        super(
            acronym,
            dataLimitations,
            dataYearsAvailable,
            description,
            endYearID,
            ID,
            interpretationIssues,
            methodology,
            mode,
            name,
            periodicity,
            populationCovered,
            references1,
            references2,
            references3,
            references4,
            responseRateAndSampleSize,
            selectedContent,
            sortOrder,
            startYearID,
            supplierAcronym,
            supplierName,
            suppressionCriteria,
            URL);
        this.endYear = endYear;
        this.startYear = startYear;
    }


    /**
     * Gets the endYear value for this DataSource.
     * 
     * @return endYear
     */
    public java.lang.String getEndYear() {
        return endYear;
    }


    /**
     * Sets the endYear value for this DataSource.
     * 
     * @param endYear
     */
    public void setEndYear(java.lang.String endYear) {
        this.endYear = endYear;
    }


    /**
     * Gets the startYear value for this DataSource.
     * 
     * @return startYear
     */
    public java.lang.String getStartYear() {
        return startYear;
    }


    /**
     * Sets the startYear value for this DataSource.
     * 
     * @param startYear
     */
    public void setStartYear(java.lang.String startYear) {
        this.startYear = startYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSource)) return false;
        DataSource other = (DataSource) obj;
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
        new org.apache.axis.description.TypeDesc(DataSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "DataSource"));
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
