/**
 * IndicatorDescriptionIntervention.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class IndicatorDescriptionIntervention  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.IndicatorDescriptionIntervention  implements java.io.Serializable {
    private java.lang.String indicatorDescription;

    public IndicatorDescriptionIntervention() {
    }

    public IndicatorDescriptionIntervention(
           java.lang.String grade,
           java.lang.Integer ID,
           java.lang.Integer indicatorDescriptionID,
           java.lang.String interventionSource,
           java.lang.String proposedText,
           java.lang.String recommendationURL,
           java.lang.Integer sortOrder,
           java.lang.String taskForceOnCommunityPreventiveServicesFinding,
           java.lang.String topic,
           java.lang.String URLTag,
           java.lang.String indicatorDescription) {
        super(
            grade,
            ID,
            indicatorDescriptionID,
            interventionSource,
            proposedText,
            recommendationURL,
            sortOrder,
            taskForceOnCommunityPreventiveServicesFinding,
            topic,
            URLTag);
        this.indicatorDescription = indicatorDescription;
    }


    /**
     * Gets the indicatorDescription value for this IndicatorDescriptionIntervention.
     * 
     * @return indicatorDescription
     */
    public java.lang.String getIndicatorDescription() {
        return indicatorDescription;
    }


    /**
     * Sets the indicatorDescription value for this IndicatorDescriptionIntervention.
     * 
     * @param indicatorDescription
     */
    public void setIndicatorDescription(java.lang.String indicatorDescription) {
        this.indicatorDescription = indicatorDescription;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicatorDescriptionIntervention)) return false;
        IndicatorDescriptionIntervention other = (IndicatorDescriptionIntervention) obj;
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
              this.indicatorDescription.equals(other.getIndicatorDescription())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorDescriptionIntervention.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorDescriptionIntervention"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorDescription"));
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
