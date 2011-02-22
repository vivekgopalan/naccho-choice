/**
 * DataCategoryRelation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class DataCategoryRelation  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.DataCategoryRelation  implements java.io.Serializable {
    private java.lang.String ancestorDataCategory;

    private java.lang.String descendantDataCategory;

    public DataCategoryRelation() {
    }

    public DataCategoryRelation(
           java.lang.Integer ancestorDataCategoryID,
           java.lang.Integer descendantDataCategoryID,
           java.lang.Integer hops,
           java.lang.Integer ID,
           java.lang.String ancestorDataCategory,
           java.lang.String descendantDataCategory) {
        super(
            ancestorDataCategoryID,
            descendantDataCategoryID,
            hops,
            ID);
        this.ancestorDataCategory = ancestorDataCategory;
        this.descendantDataCategory = descendantDataCategory;
    }


    /**
     * Gets the ancestorDataCategory value for this DataCategoryRelation.
     * 
     * @return ancestorDataCategory
     */
    public java.lang.String getAncestorDataCategory() {
        return ancestorDataCategory;
    }


    /**
     * Sets the ancestorDataCategory value for this DataCategoryRelation.
     * 
     * @param ancestorDataCategory
     */
    public void setAncestorDataCategory(java.lang.String ancestorDataCategory) {
        this.ancestorDataCategory = ancestorDataCategory;
    }


    /**
     * Gets the descendantDataCategory value for this DataCategoryRelation.
     * 
     * @return descendantDataCategory
     */
    public java.lang.String getDescendantDataCategory() {
        return descendantDataCategory;
    }


    /**
     * Sets the descendantDataCategory value for this DataCategoryRelation.
     * 
     * @param descendantDataCategory
     */
    public void setDescendantDataCategory(java.lang.String descendantDataCategory) {
        this.descendantDataCategory = descendantDataCategory;
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
        _equals = super.equals(obj) && 
            ((this.ancestorDataCategory==null && other.getAncestorDataCategory()==null) || 
             (this.ancestorDataCategory!=null &&
              this.ancestorDataCategory.equals(other.getAncestorDataCategory()))) &&
            ((this.descendantDataCategory==null && other.getDescendantDataCategory()==null) || 
             (this.descendantDataCategory!=null &&
              this.descendantDataCategory.equals(other.getDescendantDataCategory())));
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
        if (getAncestorDataCategory() != null) {
            _hashCode += getAncestorDataCategory().hashCode();
        }
        if (getDescendantDataCategory() != null) {
            _hashCode += getDescendantDataCategory().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataCategoryRelation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "DataCategoryRelation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ancestorDataCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "AncestorDataCategory"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descendantDataCategory");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "DescendantDataCategory"));
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
