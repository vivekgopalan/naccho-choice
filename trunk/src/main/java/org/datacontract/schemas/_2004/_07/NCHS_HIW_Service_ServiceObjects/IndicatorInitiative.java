/**
 * IndicatorInitiative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class IndicatorInitiative  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.IndicatorInitiative  implements java.io.Serializable {
    private java.lang.String indicator;

    private java.lang.String initiative;

    public IndicatorInitiative() {
    }

    public IndicatorInitiative(
           java.lang.Integer ID,
           java.lang.Integer indicatorID,
           java.lang.Integer initiativeID,
           java.lang.String indicator,
           java.lang.String initiative) {
        super(
            ID,
            indicatorID,
            initiativeID);
        this.indicator = indicator;
        this.initiative = initiative;
    }


    /**
     * Gets the indicator value for this IndicatorInitiative.
     * 
     * @return indicator
     */
    public java.lang.String getIndicator() {
        return indicator;
    }


    /**
     * Sets the indicator value for this IndicatorInitiative.
     * 
     * @param indicator
     */
    public void setIndicator(java.lang.String indicator) {
        this.indicator = indicator;
    }


    /**
     * Gets the initiative value for this IndicatorInitiative.
     * 
     * @return initiative
     */
    public java.lang.String getInitiative() {
        return initiative;
    }


    /**
     * Sets the initiative value for this IndicatorInitiative.
     * 
     * @param initiative
     */
    public void setInitiative(java.lang.String initiative) {
        this.initiative = initiative;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicatorInitiative)) return false;
        IndicatorInitiative other = (IndicatorInitiative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.indicator==null && other.getIndicator()==null) || 
             (this.indicator!=null &&
              this.indicator.equals(other.getIndicator()))) &&
            ((this.initiative==null && other.getInitiative()==null) || 
             (this.initiative!=null &&
              this.initiative.equals(other.getInitiative())));
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
        if (getIndicator() != null) {
            _hashCode += getIndicator().hashCode();
        }
        if (getInitiative() != null) {
            _hashCode += getInitiative().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorInitiative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorInitiative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Indicator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiative");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "Initiative"));
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
