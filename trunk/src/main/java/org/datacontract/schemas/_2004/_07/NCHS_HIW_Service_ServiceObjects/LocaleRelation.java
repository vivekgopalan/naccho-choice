/**
 * LocaleRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class LocaleRelation  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.LocaleRelation  implements java.io.Serializable {
    private java.lang.String ancestorLocale;

    private java.lang.String descendantLocale;

    public LocaleRelation() {
    }

    public LocaleRelation(
           java.lang.Integer ancestorLocaleID,
           java.lang.Integer descendantLocaleID,
           java.lang.Integer hops,
           java.lang.Integer ID,
           java.lang.String ancestorLocale,
           java.lang.String descendantLocale) {
        super(
            ancestorLocaleID,
            descendantLocaleID,
            hops,
            ID);
        this.ancestorLocale = ancestorLocale;
        this.descendantLocale = descendantLocale;
    }


    /**
     * Gets the ancestorLocale value for this LocaleRelation.
     * 
     * @return ancestorLocale
     */
    public java.lang.String getAncestorLocale() {
        return ancestorLocale;
    }


    /**
     * Sets the ancestorLocale value for this LocaleRelation.
     * 
     * @param ancestorLocale
     */
    public void setAncestorLocale(java.lang.String ancestorLocale) {
        this.ancestorLocale = ancestorLocale;
    }


    /**
     * Gets the descendantLocale value for this LocaleRelation.
     * 
     * @return descendantLocale
     */
    public java.lang.String getDescendantLocale() {
        return descendantLocale;
    }


    /**
     * Sets the descendantLocale value for this LocaleRelation.
     * 
     * @param descendantLocale
     */
    public void setDescendantLocale(java.lang.String descendantLocale) {
        this.descendantLocale = descendantLocale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocaleRelation)) return false;
        LocaleRelation other = (LocaleRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.ancestorLocale==null && other.getAncestorLocale()==null) || 
             (this.ancestorLocale!=null &&
              this.ancestorLocale.equals(other.getAncestorLocale()))) &&
            ((this.descendantLocale==null && other.getDescendantLocale()==null) || 
             (this.descendantLocale!=null &&
              this.descendantLocale.equals(other.getDescendantLocale())));
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
        if (getAncestorLocale() != null) {
            _hashCode += getAncestorLocale().hashCode();
        }
        if (getDescendantLocale() != null) {
            _hashCode += getDescendantLocale().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocaleRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "LocaleRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancestorLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "AncestorLocale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descendantLocale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "DescendantLocale"));
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
