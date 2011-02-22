/**
 * IndicatorDataCategory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class IndicatorDataCategory  implements java.io.Serializable {
    private java.lang.Integer dataCategoryID;

    private java.lang.Integer ID;

    private java.lang.Integer indicatorID;

    public IndicatorDataCategory() {
    }

    public IndicatorDataCategory(
           java.lang.Integer dataCategoryID,
           java.lang.Integer ID,
           java.lang.Integer indicatorID) {
           this.dataCategoryID = dataCategoryID;
           this.ID = ID;
           this.indicatorID = indicatorID;
    }


    /**
     * Gets the dataCategoryID value for this IndicatorDataCategory.
     * 
     * @return dataCategoryID
     */
    public java.lang.Integer getDataCategoryID() {
        return dataCategoryID;
    }


    /**
     * Sets the dataCategoryID value for this IndicatorDataCategory.
     * 
     * @param dataCategoryID
     */
    public void setDataCategoryID(java.lang.Integer dataCategoryID) {
        this.dataCategoryID = dataCategoryID;
    }


    /**
     * Gets the ID value for this IndicatorDataCategory.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this IndicatorDataCategory.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the indicatorID value for this IndicatorDataCategory.
     * 
     * @return indicatorID
     */
    public java.lang.Integer getIndicatorID() {
        return indicatorID;
    }


    /**
     * Sets the indicatorID value for this IndicatorDataCategory.
     * 
     * @param indicatorID
     */
    public void setIndicatorID(java.lang.Integer indicatorID) {
        this.indicatorID = indicatorID;
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
        _equals = true && 
            ((this.dataCategoryID==null && other.getDataCategoryID()==null) || 
             (this.dataCategoryID!=null &&
              this.dataCategoryID.equals(other.getDataCategoryID()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.indicatorID==null && other.getIndicatorID()==null) || 
             (this.indicatorID!=null &&
              this.indicatorID.equals(other.getIndicatorID())));
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
        if (getDataCategoryID() != null) {
            _hashCode += getDataCategoryID().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIndicatorID() != null) {
            _hashCode += getIndicatorID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorDataCategory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorDataCategory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCategoryID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataCategoryID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatorID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
