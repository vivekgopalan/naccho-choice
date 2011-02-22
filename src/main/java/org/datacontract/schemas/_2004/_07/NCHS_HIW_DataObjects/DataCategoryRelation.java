/**
 * DataCategoryRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class DataCategoryRelation  implements java.io.Serializable {
    private java.lang.Integer ancestorDataCategoryID;

    private java.lang.Integer descendantDataCategoryID;

    private java.lang.Integer hops;

    private java.lang.Integer ID;

    public DataCategoryRelation() {
    }

    public DataCategoryRelation(
           java.lang.Integer ancestorDataCategoryID,
           java.lang.Integer descendantDataCategoryID,
           java.lang.Integer hops,
           java.lang.Integer ID) {
           this.ancestorDataCategoryID = ancestorDataCategoryID;
           this.descendantDataCategoryID = descendantDataCategoryID;
           this.hops = hops;
           this.ID = ID;
    }


    /**
     * Gets the ancestorDataCategoryID value for this DataCategoryRelation.
     * 
     * @return ancestorDataCategoryID
     */
    public java.lang.Integer getAncestorDataCategoryID() {
        return ancestorDataCategoryID;
    }


    /**
     * Sets the ancestorDataCategoryID value for this DataCategoryRelation.
     * 
     * @param ancestorDataCategoryID
     */
    public void setAncestorDataCategoryID(java.lang.Integer ancestorDataCategoryID) {
        this.ancestorDataCategoryID = ancestorDataCategoryID;
    }


    /**
     * Gets the descendantDataCategoryID value for this DataCategoryRelation.
     * 
     * @return descendantDataCategoryID
     */
    public java.lang.Integer getDescendantDataCategoryID() {
        return descendantDataCategoryID;
    }


    /**
     * Sets the descendantDataCategoryID value for this DataCategoryRelation.
     * 
     * @param descendantDataCategoryID
     */
    public void setDescendantDataCategoryID(java.lang.Integer descendantDataCategoryID) {
        this.descendantDataCategoryID = descendantDataCategoryID;
    }


    /**
     * Gets the hops value for this DataCategoryRelation.
     * 
     * @return hops
     */
    public java.lang.Integer getHops() {
        return hops;
    }


    /**
     * Sets the hops value for this DataCategoryRelation.
     * 
     * @param hops
     */
    public void setHops(java.lang.Integer hops) {
        this.hops = hops;
    }


    /**
     * Gets the ID value for this DataCategoryRelation.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this DataCategoryRelation.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataCategoryRelation)) return false;
        DataCategoryRelation other = (DataCategoryRelation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ancestorDataCategoryID==null && other.getAncestorDataCategoryID()==null) || 
             (this.ancestorDataCategoryID!=null &&
              this.ancestorDataCategoryID.equals(other.getAncestorDataCategoryID()))) &&
            ((this.descendantDataCategoryID==null && other.getDescendantDataCategoryID()==null) || 
             (this.descendantDataCategoryID!=null &&
              this.descendantDataCategoryID.equals(other.getDescendantDataCategoryID()))) &&
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
        if (getAncestorDataCategoryID() != null) {
            _hashCode += getAncestorDataCategoryID().hashCode();
        }
        if (getDescendantDataCategoryID() != null) {
            _hashCode += getDescendantDataCategoryID().hashCode();
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
        new org.apache.axis.description.TypeDesc(DataCategoryRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataCategoryRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancestorDataCategoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "AncestorDataCategoryID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descendantDataCategoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DescendantDataCategoryID"));
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
