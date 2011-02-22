/**
 * LocaleRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class LocaleRelation  implements java.io.Serializable {
    private java.lang.Integer ancestorLocaleID;

    private java.lang.Integer descendantLocaleID;

    private java.lang.Integer hops;

    private java.lang.Integer ID;

    public LocaleRelation() {
    }

    public LocaleRelation(
           java.lang.Integer ancestorLocaleID,
           java.lang.Integer descendantLocaleID,
           java.lang.Integer hops,
           java.lang.Integer ID) {
           this.ancestorLocaleID = ancestorLocaleID;
           this.descendantLocaleID = descendantLocaleID;
           this.hops = hops;
           this.ID = ID;
    }


    /**
     * Gets the ancestorLocaleID value for this LocaleRelation.
     * 
     * @return ancestorLocaleID
     */
    public java.lang.Integer getAncestorLocaleID() {
        return ancestorLocaleID;
    }


    /**
     * Sets the ancestorLocaleID value for this LocaleRelation.
     * 
     * @param ancestorLocaleID
     */
    public void setAncestorLocaleID(java.lang.Integer ancestorLocaleID) {
        this.ancestorLocaleID = ancestorLocaleID;
    }


    /**
     * Gets the descendantLocaleID value for this LocaleRelation.
     * 
     * @return descendantLocaleID
     */
    public java.lang.Integer getDescendantLocaleID() {
        return descendantLocaleID;
    }


    /**
     * Sets the descendantLocaleID value for this LocaleRelation.
     * 
     * @param descendantLocaleID
     */
    public void setDescendantLocaleID(java.lang.Integer descendantLocaleID) {
        this.descendantLocaleID = descendantLocaleID;
    }


    /**
     * Gets the hops value for this LocaleRelation.
     * 
     * @return hops
     */
    public java.lang.Integer getHops() {
        return hops;
    }


    /**
     * Sets the hops value for this LocaleRelation.
     * 
     * @param hops
     */
    public void setHops(java.lang.Integer hops) {
        this.hops = hops;
    }


    /**
     * Gets the ID value for this LocaleRelation.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this LocaleRelation.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
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
        _equals = true && 
            ((this.ancestorLocaleID==null && other.getAncestorLocaleID()==null) || 
             (this.ancestorLocaleID!=null &&
              this.ancestorLocaleID.equals(other.getAncestorLocaleID()))) &&
            ((this.descendantLocaleID==null && other.getDescendantLocaleID()==null) || 
             (this.descendantLocaleID!=null &&
              this.descendantLocaleID.equals(other.getDescendantLocaleID()))) &&
            ((this.hops==null && other.getHops()==null) || 
             (this.hops!=null &&
              this.hops.equals(other.getHops()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAncestorLocaleID() != null) {
            _hashCode += getAncestorLocaleID().hashCode();
        }
        if (getDescendantLocaleID() != null) {
            _hashCode += getDescendantLocaleID().hashCode();
        }
        if (getHops() != null) {
            _hashCode += getHops().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocaleRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "LocaleRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancestorLocaleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "AncestorLocaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descendantLocaleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DescendantLocaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Hops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
