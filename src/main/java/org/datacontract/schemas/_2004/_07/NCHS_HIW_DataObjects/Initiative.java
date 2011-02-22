/**
 * Initiative.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class Initiative  implements java.io.Serializable {
    private java.lang.String acknowledgement;

    private java.lang.String acronym;

    private java.lang.Integer ID;

    private java.lang.Boolean isSSA;

    private java.lang.Integer maximumYear;

    private java.lang.Integer minimumYear;

    private java.lang.String name;

    private java.lang.Integer sortOrder;

    private java.lang.String supplierAcronym;

    private java.lang.String supplierName;

    public Initiative() {
    }

    public Initiative(
           java.lang.String acknowledgement,
           java.lang.String acronym,
           java.lang.Integer ID,
           java.lang.Boolean isSSA,
           java.lang.Integer maximumYear,
           java.lang.Integer minimumYear,
           java.lang.String name,
           java.lang.Integer sortOrder,
           java.lang.String supplierAcronym,
           java.lang.String supplierName) {
           this.acknowledgement = acknowledgement;
           this.acronym = acronym;
           this.ID = ID;
           this.isSSA = isSSA;
           this.maximumYear = maximumYear;
           this.minimumYear = minimumYear;
           this.name = name;
           this.sortOrder = sortOrder;
           this.supplierAcronym = supplierAcronym;
           this.supplierName = supplierName;
    }


    /**
     * Gets the acknowledgement value for this Initiative.
     * 
     * @return acknowledgement
     */
    public java.lang.String getAcknowledgement() {
        return acknowledgement;
    }


    /**
     * Sets the acknowledgement value for this Initiative.
     * 
     * @param acknowledgement
     */
    public void setAcknowledgement(java.lang.String acknowledgement) {
        this.acknowledgement = acknowledgement;
    }


    /**
     * Gets the acronym value for this Initiative.
     * 
     * @return acronym
     */
    public java.lang.String getAcronym() {
        return acronym;
    }


    /**
     * Sets the acronym value for this Initiative.
     * 
     * @param acronym
     */
    public void setAcronym(java.lang.String acronym) {
        this.acronym = acronym;
    }


    /**
     * Gets the ID value for this Initiative.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Initiative.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the isSSA value for this Initiative.
     * 
     * @return isSSA
     */
    public java.lang.Boolean getIsSSA() {
        return isSSA;
    }


    /**
     * Sets the isSSA value for this Initiative.
     * 
     * @param isSSA
     */
    public void setIsSSA(java.lang.Boolean isSSA) {
        this.isSSA = isSSA;
    }


    /**
     * Gets the maximumYear value for this Initiative.
     * 
     * @return maximumYear
     */
    public java.lang.Integer getMaximumYear() {
        return maximumYear;
    }


    /**
     * Sets the maximumYear value for this Initiative.
     * 
     * @param maximumYear
     */
    public void setMaximumYear(java.lang.Integer maximumYear) {
        this.maximumYear = maximumYear;
    }


    /**
     * Gets the minimumYear value for this Initiative.
     * 
     * @return minimumYear
     */
    public java.lang.Integer getMinimumYear() {
        return minimumYear;
    }


    /**
     * Sets the minimumYear value for this Initiative.
     * 
     * @param minimumYear
     */
    public void setMinimumYear(java.lang.Integer minimumYear) {
        this.minimumYear = minimumYear;
    }


    /**
     * Gets the name value for this Initiative.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Initiative.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the sortOrder value for this Initiative.
     * 
     * @return sortOrder
     */
    public java.lang.Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this Initiative.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the supplierAcronym value for this Initiative.
     * 
     * @return supplierAcronym
     */
    public java.lang.String getSupplierAcronym() {
        return supplierAcronym;
    }


    /**
     * Sets the supplierAcronym value for this Initiative.
     * 
     * @param supplierAcronym
     */
    public void setSupplierAcronym(java.lang.String supplierAcronym) {
        this.supplierAcronym = supplierAcronym;
    }


    /**
     * Gets the supplierName value for this Initiative.
     * 
     * @return supplierName
     */
    public java.lang.String getSupplierName() {
        return supplierName;
    }


    /**
     * Sets the supplierName value for this Initiative.
     * 
     * @param supplierName
     */
    public void setSupplierName(java.lang.String supplierName) {
        this.supplierName = supplierName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Initiative)) return false;
        Initiative other = (Initiative) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acknowledgement==null && other.getAcknowledgement()==null) || 
             (this.acknowledgement!=null &&
              this.acknowledgement.equals(other.getAcknowledgement()))) &&
            ((this.acronym==null && other.getAcronym()==null) || 
             (this.acronym!=null &&
              this.acronym.equals(other.getAcronym()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.isSSA==null && other.getIsSSA()==null) || 
             (this.isSSA!=null &&
              this.isSSA.equals(other.getIsSSA()))) &&
            ((this.maximumYear==null && other.getMaximumYear()==null) || 
             (this.maximumYear!=null &&
              this.maximumYear.equals(other.getMaximumYear()))) &&
            ((this.minimumYear==null && other.getMinimumYear()==null) || 
             (this.minimumYear!=null &&
              this.minimumYear.equals(other.getMinimumYear()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.supplierAcronym==null && other.getSupplierAcronym()==null) || 
             (this.supplierAcronym!=null &&
              this.supplierAcronym.equals(other.getSupplierAcronym()))) &&
            ((this.supplierName==null && other.getSupplierName()==null) || 
             (this.supplierName!=null &&
              this.supplierName.equals(other.getSupplierName())));
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
        if (getAcknowledgement() != null) {
            _hashCode += getAcknowledgement().hashCode();
        }
        if (getAcronym() != null) {
            _hashCode += getAcronym().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIsSSA() != null) {
            _hashCode += getIsSSA().hashCode();
        }
        if (getMaximumYear() != null) {
            _hashCode += getMaximumYear().hashCode();
        }
        if (getMinimumYear() != null) {
            _hashCode += getMinimumYear().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getSupplierAcronym() != null) {
            _hashCode += getSupplierAcronym().hashCode();
        }
        if (getSupplierName() != null) {
            _hashCode += getSupplierName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Initiative.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Initiative"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acknowledgement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Acknowledgement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acronym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Acronym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isSSA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IsSSA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "MaximumYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumYear");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "MinimumYear"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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
        elemField.setFieldName("supplierAcronym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SupplierAcronym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supplierName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SupplierName"));
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
