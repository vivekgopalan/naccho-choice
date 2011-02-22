/**
 * IndicatorFootnote.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class IndicatorFootnote  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.IndicatorFootnote  implements java.io.Serializable {
    private java.lang.String footnote;

    private java.lang.String indicator;

    public IndicatorFootnote() {
    }

    public IndicatorFootnote(
           java.lang.Integer footnoteID,
           java.lang.Integer ID,
           java.lang.Integer indicatorID,
           java.lang.String footnote,
           java.lang.String indicator) {
        super(
            footnoteID,
            ID,
            indicatorID);
        this.footnote = footnote;
        this.indicator = indicator;
    }


    /**
     * Gets the footnote value for this IndicatorFootnote.
     * 
     * @return footnote
     */
    public java.lang.String getFootnote() {
        return footnote;
    }


    /**
     * Sets the footnote value for this IndicatorFootnote.
     * 
     * @param footnote
     */
    public void setFootnote(java.lang.String footnote) {
        this.footnote = footnote;
    }


    /**
     * Gets the indicator value for this IndicatorFootnote.
     * 
     * @return indicator
     */
    public java.lang.String getIndicator() {
        return indicator;
    }


    /**
     * Sets the indicator value for this IndicatorFootnote.
     * 
     * @param indicator
     */
    public void setIndicator(java.lang.String indicator) {
        this.indicator = indicator;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicatorFootnote)) return false;
        IndicatorFootnote other = (IndicatorFootnote) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.footnote==null && other.getFootnote()==null) || 
             (this.footnote!=null &&
              this.footnote.equals(other.getFootnote()))) &&
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
        if (getFootnote() != null) {
            _hashCode += getFootnote().hashCode();
        }
        if (getIndicator() != null) {
            _hashCode += getIndicator().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorFootnote.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorFootnote"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("footnote");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Footnote"));
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
