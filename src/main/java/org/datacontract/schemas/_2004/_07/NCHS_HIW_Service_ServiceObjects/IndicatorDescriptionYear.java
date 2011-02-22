/**
 * IndicatorDescriptionYear.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class IndicatorDescriptionYear  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.IndicatorDescriptionYear  implements java.io.Serializable {
    private java.lang.String indicatorDescription;

    private java.lang.String year;

    public IndicatorDescriptionYear() {
    }

    public IndicatorDescriptionYear(
           java.lang.Integer ID,
           java.lang.Integer indicatorDescriptionID,
           java.lang.Integer yearID,
           java.lang.String indicatorDescription,
           java.lang.String year) {
        super(
            ID,
            indicatorDescriptionID,
            yearID);
        this.indicatorDescription = indicatorDescription;
        this.year = year;
    }


    /**
     * Gets the indicatorDescription value for this IndicatorDescriptionYear.
     * 
     * @return indicatorDescription
     */
    public java.lang.String getIndicatorDescription() {
        return indicatorDescription;
    }


    /**
     * Sets the indicatorDescription value for this IndicatorDescriptionYear.
     * 
     * @param indicatorDescription
     */
    public void setIndicatorDescription(java.lang.String indicatorDescription) {
        this.indicatorDescription = indicatorDescription;
    }


    /**
     * Gets the year value for this IndicatorDescriptionYear.
     * 
     * @return year
     */
    public java.lang.String getYear() {
        return year;
    }


    /**
     * Sets the year value for this IndicatorDescriptionYear.
     * 
     * @param year
     */
    public void setYear(java.lang.String year) {
        this.year = year;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicatorDescriptionYear)) return false;
        IndicatorDescriptionYear other = (IndicatorDescriptionYear) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.indicatorDescription==null && other.getIndicatorDescription()==null) || 
             (this.indicatorDescription!=null &&
              this.indicatorDescription.equals(other.getIndicatorDescription()))) &&
            ((this.year==null && other.getYear()==null) || 
             (this.year!=null &&
              this.year.equals(other.getYear())));
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
        if (getIndicatorDescription() != null) {
            _hashCode += getIndicatorDescription().hashCode();
        }
        if (getYear() != null) {
            _hashCode += getYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorDescriptionYear.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorDescriptionYear"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Year"));
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
