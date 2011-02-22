/**
 * Timeframe.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class Timeframe  implements java.io.Serializable {
    private java.lang.Integer firstYear;

    private java.lang.Integer ID;

    private java.lang.Integer lastYear;

    private java.lang.String name;

    private java.lang.Integer sortOrder;

    private java.lang.String twoDigitFirstYear;

    private java.lang.String twoDigitLastYear;

    public Timeframe() {
    }

    public Timeframe(
           java.lang.Integer firstYear,
           java.lang.Integer ID,
           java.lang.Integer lastYear,
           java.lang.String name,
           java.lang.Integer sortOrder,
           java.lang.String twoDigitFirstYear,
           java.lang.String twoDigitLastYear) {
           this.firstYear = firstYear;
           this.ID = ID;
           this.lastYear = lastYear;
           this.name = name;
           this.sortOrder = sortOrder;
           this.twoDigitFirstYear = twoDigitFirstYear;
           this.twoDigitLastYear = twoDigitLastYear;
    }


    /**
     * Gets the firstYear value for this Timeframe.
     * 
     * @return firstYear
     */
    public java.lang.Integer getFirstYear() {
        return firstYear;
    }


    /**
     * Sets the firstYear value for this Timeframe.
     * 
     * @param firstYear
     */
    public void setFirstYear(java.lang.Integer firstYear) {
        this.firstYear = firstYear;
    }


    /**
     * Gets the ID value for this Timeframe.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Timeframe.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the lastYear value for this Timeframe.
     * 
     * @return lastYear
     */
    public java.lang.Integer getLastYear() {
        return lastYear;
    }


    /**
     * Sets the lastYear value for this Timeframe.
     * 
     * @param lastYear
     */
    public void setLastYear(java.lang.Integer lastYear) {
        this.lastYear = lastYear;
    }


    /**
     * Gets the name value for this Timeframe.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Timeframe.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sortOrder value for this Timeframe.
     * 
     * @return sortOrder
     */
    public java.lang.Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this Timeframe.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the twoDigitFirstYear value for this Timeframe.
     * 
     * @return twoDigitFirstYear
     */
    public java.lang.String getTwoDigitFirstYear() {
        return twoDigitFirstYear;
    }


    /**
     * Sets the twoDigitFirstYear value for this Timeframe.
     * 
     * @param twoDigitFirstYear
     */
    public void setTwoDigitFirstYear(java.lang.String twoDigitFirstYear) {
        this.twoDigitFirstYear = twoDigitFirstYear;
    }


    /**
     * Gets the twoDigitLastYear value for this Timeframe.
     * 
     * @return twoDigitLastYear
     */
    public java.lang.String getTwoDigitLastYear() {
        return twoDigitLastYear;
    }


    /**
     * Sets the twoDigitLastYear value for this Timeframe.
     * 
     * @param twoDigitLastYear
     */
    public void setTwoDigitLastYear(java.lang.String twoDigitLastYear) {
        this.twoDigitLastYear = twoDigitLastYear;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Timeframe)) return false;
        Timeframe other = (Timeframe) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.firstYear==null && other.getFirstYear()==null) || 
             (this.firstYear!=null &&
              this.firstYear.equals(other.getFirstYear()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.lastYear==null && other.getLastYear()==null) || 
             (this.lastYear!=null &&
              this.lastYear.equals(other.getLastYear()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.twoDigitFirstYear==null && other.getTwoDigitFirstYear()==null) || 
             (this.twoDigitFirstYear!=null &&
              this.twoDigitFirstYear.equals(other.getTwoDigitFirstYear()))) &&
            ((this.twoDigitLastYear==null && other.getTwoDigitLastYear()==null) || 
             (this.twoDigitLastYear!=null &&
              this.twoDigitLastYear.equals(other.getTwoDigitLastYear())));
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
        if (getFirstYear() != null) {
            _hashCode += getFirstYear().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getLastYear() != null) {
            _hashCode += getLastYear().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getTwoDigitFirstYear() != null) {
            _hashCode += getTwoDigitFirstYear().hashCode();
        }
        if (getTwoDigitLastYear() != null) {
            _hashCode += getTwoDigitLastYear().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Timeframe.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Timeframe"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FirstYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "LastYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twoDigitFirstYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "TwoDigitFirstYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("twoDigitLastYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "TwoDigitLastYear"));
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
