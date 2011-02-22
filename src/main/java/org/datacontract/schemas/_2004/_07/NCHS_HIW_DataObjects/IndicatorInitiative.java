/**
 * IndicatorInitiative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class IndicatorInitiative  implements java.io.Serializable {
    private java.lang.Integer ID;

    private java.lang.Integer indicatorID;

    private java.lang.Integer initiativeID;

    public IndicatorInitiative() {
    }

    public IndicatorInitiative(
           java.lang.Integer ID,
           java.lang.Integer indicatorID,
           java.lang.Integer initiativeID) {
           this.ID = ID;
           this.indicatorID = indicatorID;
           this.initiativeID = initiativeID;
    }


    /**
     * Gets the ID value for this IndicatorInitiative.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this IndicatorInitiative.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the indicatorID value for this IndicatorInitiative.
     * 
     * @return indicatorID
     */
    public java.lang.Integer getIndicatorID() {
        return indicatorID;
    }


    /**
     * Sets the indicatorID value for this IndicatorInitiative.
     * 
     * @param indicatorID
     */
    public void setIndicatorID(java.lang.Integer indicatorID) {
        this.indicatorID = indicatorID;
    }


    /**
     * Gets the initiativeID value for this IndicatorInitiative.
     * 
     * @return initiativeID
     */
    public java.lang.Integer getInitiativeID() {
        return initiativeID;
    }


    /**
     * Sets the initiativeID value for this IndicatorInitiative.
     * 
     * @param initiativeID
     */
    public void setInitiativeID(java.lang.Integer initiativeID) {
        this.initiativeID = initiativeID;
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
        _equals = true && 
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.indicatorID==null && other.getIndicatorID()==null) || 
             (this.indicatorID!=null &&
              this.indicatorID.equals(other.getIndicatorID()))) &&
            ((this.initiativeID==null && other.getInitiativeID()==null) || 
             (this.initiativeID!=null &&
              this.initiativeID.equals(other.getInitiativeID())));
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
        if (getIndicatorID() != null) {
            _hashCode += getIndicatorID().hashCode();
        }
        if (getInitiativeID() != null) {
            _hashCode += getInitiativeID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorInitiative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorInitiative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initiativeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "InitiativeID"));
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
