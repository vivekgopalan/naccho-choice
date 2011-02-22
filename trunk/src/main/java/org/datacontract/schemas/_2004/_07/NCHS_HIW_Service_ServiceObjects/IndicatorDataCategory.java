/**
 * IndicatorDataCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class IndicatorDataCategory  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.IndicatorDataCategory  implements java.io.Serializable {
    private java.lang.String dataCategory;

    private java.lang.String indicator;

    public IndicatorDataCategory() {
    }

    public IndicatorDataCategory(
           java.lang.Integer dataCategoryID,
           java.lang.Integer ID,
           java.lang.Integer indicatorID,
           java.lang.String dataCategory,
           java.lang.String indicator) {
        super(
            dataCategoryID,
            ID,
            indicatorID);
        this.dataCategory = dataCategory;
        this.indicator = indicator;
    }


    /**
     * Gets the dataCategory value for this IndicatorDataCategory.
     * 
     * @return dataCategory
     */
    public java.lang.String getDataCategory() {
        return dataCategory;
    }


    /**
     * Sets the dataCategory value for this IndicatorDataCategory.
     * 
     * @param dataCategory
     */
    public void setDataCategory(java.lang.String dataCategory) {
        this.dataCategory = dataCategory;
    }


    /**
     * Gets the indicator value for this IndicatorDataCategory.
     * 
     * @return indicator
     */
    public java.lang.String getIndicator() {
        return indicator;
    }


    /**
     * Sets the indicator value for this IndicatorDataCategory.
     * 
     * @param indicator
     */
    public void setIndicator(java.lang.String indicator) {
        this.indicator = indicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicatorDataCategory)) return false;
        IndicatorDataCategory other = (IndicatorDataCategory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dataCategory==null && other.getDataCategory()==null) || 
             (this.dataCategory!=null &&
              this.dataCategory.equals(other.getDataCategory()))) &&
            ((this.indicator==null && other.getIndicator()==null) || 
             (this.indicator!=null &&
              this.indicator.equals(other.getIndicator())));
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
        if (getDataCategory() != null) {
            _hashCode += getDataCategory().hashCode();
        }
        if (getIndicator() != null) {
            _hashCode += getIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorDataCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorDataCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "DataCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Indicator"));
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
