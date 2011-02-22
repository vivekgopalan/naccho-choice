/**
 * IndicatorDescriptionYear.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class IndicatorDescriptionYear  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.Integer indicatorDescriptionID;

    private java.lang.Integer yearID;

    public IndicatorDescriptionYear() {
    }

    public IndicatorDescriptionYear(
           java.lang.Integer ID,
           java.lang.Integer indicatorDescriptionID,
           java.lang.Integer yearID) {
           this.ID = ID;
           this.indicatorDescriptionID = indicatorDescriptionID;
           this.yearID = yearID;
    }


    /**
     * Gets the ID value for this IndicatorDescriptionYear.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this IndicatorDescriptionYear.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the indicatorDescriptionID value for this IndicatorDescriptionYear.
     * 
     * @return indicatorDescriptionID
     */
    public java.lang.Integer getIndicatorDescriptionID() {
        return indicatorDescriptionID;
    }


    /**
     * Sets the indicatorDescriptionID value for this IndicatorDescriptionYear.
     * 
     * @param indicatorDescriptionID
     */
    public void setIndicatorDescriptionID(java.lang.Integer indicatorDescriptionID) {
        this.indicatorDescriptionID = indicatorDescriptionID;
    }


    /**
     * Gets the yearID value for this IndicatorDescriptionYear.
     * 
     * @return yearID
     */
    public java.lang.Integer getYearID() {
        return yearID;
    }


    /**
     * Sets the yearID value for this IndicatorDescriptionYear.
     * 
     * @param yearID
     */
    public void setYearID(java.lang.Integer yearID) {
        this.yearID = yearID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicatorDescriptionYear)) return false;
        IndicatorDescriptionYear other = (IndicatorDescriptionYear) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.indicatorDescriptionID==null && other.getIndicatorDescriptionID()==null) || 
             (this.indicatorDescriptionID!=null &&
              this.indicatorDescriptionID.equals(other.getIndicatorDescriptionID()))) &&
            ((this.yearID==null && other.getYearID()==null) || 
             (this.yearID!=null &&
              this.yearID.equals(other.getYearID())));
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
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIndicatorDescriptionID() != null) {
            _hashCode += getIndicatorDescriptionID().hashCode();
        }
        if (getYearID() != null) {
            _hashCode += getYearID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorDescriptionYear.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorDescriptionYear"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatorDescriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorDescriptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yearID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "YearID"));
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
