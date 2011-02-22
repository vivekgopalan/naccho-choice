/**
 * FAQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class FAQ  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.FAQ  implements java.io.Serializable {
    private java.lang.String FAQCategories;

    public FAQ() {
    }

    public FAQ(
           java.lang.String answer,
           java.lang.Integer FAQCategoryID,
           java.lang.Integer ID,
           java.lang.String question,
           java.lang.Integer sortOrder,
           java.lang.String FAQCategories) {
        super(
            answer,
            FAQCategoryID,
            ID,
            question,
            sortOrder);
        this.FAQCategories = FAQCategories;
    }


    /**
     * Gets the FAQCategories value for this FAQ.
     * 
     * @return FAQCategories
     */
    public java.lang.String getFAQCategories() {
        return FAQCategories;
    }


    /**
     * Sets the FAQCategories value for this FAQ.
     * 
     * @param FAQCategories
     */
    public void setFAQCategories(java.lang.String FAQCategories) {
        this.FAQCategories = FAQCategories;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FAQ)) return false;
        FAQ other = (FAQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.FAQCategories==null && other.getFAQCategories()==null) || 
             (this.FAQCategories!=null &&
              this.FAQCategories.equals(other.getFAQCategories())));
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
        if (getFAQCategories() != null) {
            _hashCode += getFAQCategories().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FAQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "FAQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FAQCategories");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "FAQCategories"));
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
