/**
 * Locale.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class Locale  implements java.io.Serializable {
    private java.lang.String abbreviation;

    private java.lang.String countyFipsCode;

    private java.lang.Integer FIPS_County_Int;

    private java.lang.Integer FIPS_State_Int;

    private java.lang.Integer FIPS_int;

    private java.lang.String fullName;

    private java.lang.String HRR_Code;

    private java.lang.Integer HRR_Code_Int;

    private java.lang.Integer ID;

    private java.lang.Integer localeLevelID;

    private java.lang.String name;

    private java.lang.Integer parentLocaleID;

    private java.lang.String SSA_County;

    private java.lang.Integer SSA_County_Int;

    private java.lang.Integer sortOrder;

    private java.lang.String stateFipsCode;

    public Locale() {
    }

    public Locale(
           java.lang.String abbreviation,
           java.lang.String countyFipsCode,
           java.lang.Integer FIPS_County_Int,
           java.lang.Integer FIPS_State_Int,
           java.lang.Integer FIPS_int,
           java.lang.String fullName,
           java.lang.String HRR_Code,
           java.lang.Integer HRR_Code_Int,
           java.lang.Integer ID,
           java.lang.Integer localeLevelID,
           java.lang.String name,
           java.lang.Integer parentLocaleID,
           java.lang.String SSA_County,
           java.lang.Integer SSA_County_Int,
           java.lang.Integer sortOrder,
           java.lang.String stateFipsCode) {
           this.abbreviation = abbreviation;
           this.countyFipsCode = countyFipsCode;
           this.FIPS_County_Int = FIPS_County_Int;
           this.FIPS_State_Int = FIPS_State_Int;
           this.FIPS_int = FIPS_int;
           this.fullName = fullName;
           this.HRR_Code = HRR_Code;
           this.HRR_Code_Int = HRR_Code_Int;
           this.ID = ID;
           this.localeLevelID = localeLevelID;
           this.name = name;
           this.parentLocaleID = parentLocaleID;
           this.SSA_County = SSA_County;
           this.SSA_County_Int = SSA_County_Int;
           this.sortOrder = sortOrder;
           this.stateFipsCode = stateFipsCode;
    }


    /**
     * Gets the abbreviation value for this Locale.
     * 
     * @return abbreviation
     */
    public java.lang.String getAbbreviation() {
        return abbreviation;
    }


    /**
     * Sets the abbreviation value for this Locale.
     * 
     * @param abbreviation
     */
    public void setAbbreviation(java.lang.String abbreviation) {
        this.abbreviation = abbreviation;
    }


    /**
     * Gets the countyFipsCode value for this Locale.
     * 
     * @return countyFipsCode
     */
    public java.lang.String getCountyFipsCode() {
        return countyFipsCode;
    }


    /**
     * Sets the countyFipsCode value for this Locale.
     * 
     * @param countyFipsCode
     */
    public void setCountyFipsCode(java.lang.String countyFipsCode) {
        this.countyFipsCode = countyFipsCode;
    }


    /**
     * Gets the FIPS_County_Int value for this Locale.
     * 
     * @return FIPS_County_Int
     */
    public java.lang.Integer getFIPS_County_Int() {
        return FIPS_County_Int;
    }


    /**
     * Sets the FIPS_County_Int value for this Locale.
     * 
     * @param FIPS_County_Int
     */
    public void setFIPS_County_Int(java.lang.Integer FIPS_County_Int) {
        this.FIPS_County_Int = FIPS_County_Int;
    }


    /**
     * Gets the FIPS_State_Int value for this Locale.
     * 
     * @return FIPS_State_Int
     */
    public java.lang.Integer getFIPS_State_Int() {
        return FIPS_State_Int;
    }


    /**
     * Sets the FIPS_State_Int value for this Locale.
     * 
     * @param FIPS_State_Int
     */
    public void setFIPS_State_Int(java.lang.Integer FIPS_State_Int) {
        this.FIPS_State_Int = FIPS_State_Int;
    }


    /**
     * Gets the FIPS_int value for this Locale.
     * 
     * @return FIPS_int
     */
    public java.lang.Integer getFIPS_int() {
        return FIPS_int;
    }


    /**
     * Sets the FIPS_int value for this Locale.
     * 
     * @param FIPS_int
     */
    public void setFIPS_int(java.lang.Integer FIPS_int) {
        this.FIPS_int = FIPS_int;
    }


    /**
     * Gets the fullName value for this Locale.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this Locale.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the HRR_Code value for this Locale.
     * 
     * @return HRR_Code
     */
    public java.lang.String getHRR_Code() {
        return HRR_Code;
    }


    /**
     * Sets the HRR_Code value for this Locale.
     * 
     * @param HRR_Code
     */
    public void setHRR_Code(java.lang.String HRR_Code) {
        this.HRR_Code = HRR_Code;
    }


    /**
     * Gets the HRR_Code_Int value for this Locale.
     * 
     * @return HRR_Code_Int
     */
    public java.lang.Integer getHRR_Code_Int() {
        return HRR_Code_Int;
    }


    /**
     * Sets the HRR_Code_Int value for this Locale.
     * 
     * @param HRR_Code_Int
     */
    public void setHRR_Code_Int(java.lang.Integer HRR_Code_Int) {
        this.HRR_Code_Int = HRR_Code_Int;
    }


    /**
     * Gets the ID value for this Locale.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this Locale.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the localeLevelID value for this Locale.
     * 
     * @return localeLevelID
     */
    public java.lang.Integer getLocaleLevelID() {
        return localeLevelID;
    }


    /**
     * Sets the localeLevelID value for this Locale.
     * 
     * @param localeLevelID
     */
    public void setLocaleLevelID(java.lang.Integer localeLevelID) {
        this.localeLevelID = localeLevelID;
    }


    /**
     * Gets the name value for this Locale.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this Locale.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the parentLocaleID value for this Locale.
     * 
     * @return parentLocaleID
     */
    public java.lang.Integer getParentLocaleID() {
        return parentLocaleID;
    }


    /**
     * Sets the parentLocaleID value for this Locale.
     * 
     * @param parentLocaleID
     */
    public void setParentLocaleID(java.lang.Integer parentLocaleID) {
        this.parentLocaleID = parentLocaleID;
    }


    /**
     * Gets the SSA_County value for this Locale.
     * 
     * @return SSA_County
     */
    public java.lang.String getSSA_County() {
        return SSA_County;
    }


    /**
     * Sets the SSA_County value for this Locale.
     * 
     * @param SSA_County
     */
    public void setSSA_County(java.lang.String SSA_County) {
        this.SSA_County = SSA_County;
    }


    /**
     * Gets the SSA_County_Int value for this Locale.
     * 
     * @return SSA_County_Int
     */
    public java.lang.Integer getSSA_County_Int() {
        return SSA_County_Int;
    }


    /**
     * Sets the SSA_County_Int value for this Locale.
     * 
     * @param SSA_County_Int
     */
    public void setSSA_County_Int(java.lang.Integer SSA_County_Int) {
        this.SSA_County_Int = SSA_County_Int;
    }


    /**
     * Gets the sortOrder value for this Locale.
     * 
     * @return sortOrder
     */
    public java.lang.Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this Locale.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the stateFipsCode value for this Locale.
     * 
     * @return stateFipsCode
     */
    public java.lang.String getStateFipsCode() {
        return stateFipsCode;
    }


    /**
     * Sets the stateFipsCode value for this Locale.
     * 
     * @param stateFipsCode
     */
    public void setStateFipsCode(java.lang.String stateFipsCode) {
        this.stateFipsCode = stateFipsCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Locale)) return false;
        Locale other = (Locale) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.abbreviation==null && other.getAbbreviation()==null) || 
             (this.abbreviation!=null &&
              this.abbreviation.equals(other.getAbbreviation()))) &&
            ((this.countyFipsCode==null && other.getCountyFipsCode()==null) || 
             (this.countyFipsCode!=null &&
              this.countyFipsCode.equals(other.getCountyFipsCode()))) &&
            ((this.FIPS_County_Int==null && other.getFIPS_County_Int()==null) || 
             (this.FIPS_County_Int!=null &&
              this.FIPS_County_Int.equals(other.getFIPS_County_Int()))) &&
            ((this.FIPS_State_Int==null && other.getFIPS_State_Int()==null) || 
             (this.FIPS_State_Int!=null &&
              this.FIPS_State_Int.equals(other.getFIPS_State_Int()))) &&
            ((this.FIPS_int==null && other.getFIPS_int()==null) || 
             (this.FIPS_int!=null &&
              this.FIPS_int.equals(other.getFIPS_int()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.HRR_Code==null && other.getHRR_Code()==null) || 
             (this.HRR_Code!=null &&
              this.HRR_Code.equals(other.getHRR_Code()))) &&
            ((this.HRR_Code_Int==null && other.getHRR_Code_Int()==null) || 
             (this.HRR_Code_Int!=null &&
              this.HRR_Code_Int.equals(other.getHRR_Code_Int()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.localeLevelID==null && other.getLocaleLevelID()==null) || 
             (this.localeLevelID!=null &&
              this.localeLevelID.equals(other.getLocaleLevelID()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.parentLocaleID==null && other.getParentLocaleID()==null) || 
             (this.parentLocaleID!=null &&
              this.parentLocaleID.equals(other.getParentLocaleID()))) &&
            ((this.SSA_County==null && other.getSSA_County()==null) || 
             (this.SSA_County!=null &&
              this.SSA_County.equals(other.getSSA_County()))) &&
            ((this.SSA_County_Int==null && other.getSSA_County_Int()==null) || 
             (this.SSA_County_Int!=null &&
              this.SSA_County_Int.equals(other.getSSA_County_Int()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.stateFipsCode==null && other.getStateFipsCode()==null) || 
             (this.stateFipsCode!=null &&
              this.stateFipsCode.equals(other.getStateFipsCode())));
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
        if (getAbbreviation() != null) {
            _hashCode += getAbbreviation().hashCode();
        }
        if (getCountyFipsCode() != null) {
            _hashCode += getCountyFipsCode().hashCode();
        }
        if (getFIPS_County_Int() != null) {
            _hashCode += getFIPS_County_Int().hashCode();
        }
        if (getFIPS_State_Int() != null) {
            _hashCode += getFIPS_State_Int().hashCode();
        }
        if (getFIPS_int() != null) {
            _hashCode += getFIPS_int().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getHRR_Code() != null) {
            _hashCode += getHRR_Code().hashCode();
        }
        if (getHRR_Code_Int() != null) {
            _hashCode += getHRR_Code_Int().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getLocaleLevelID() != null) {
            _hashCode += getLocaleLevelID().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getParentLocaleID() != null) {
            _hashCode += getParentLocaleID().hashCode();
        }
        if (getSSA_County() != null) {
            _hashCode += getSSA_County().hashCode();
        }
        if (getSSA_County_Int() != null) {
            _hashCode += getSSA_County_Int().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getStateFipsCode() != null) {
            _hashCode += getStateFipsCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Locale.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Locale"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Abbreviation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countyFipsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "CountyFipsCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIPS_County_Int");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FIPS_County_Int"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIPS_State_Int");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FIPS_State_Int"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FIPS_int");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FIPS_int"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "FullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HRR_Code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "HRR_Code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("HRR_Code_Int");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "HRR_Code_Int"));
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
        elemField.setFieldName("localeLevelID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "LocaleLevelID"));
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
        elemField.setFieldName("parentLocaleID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ParentLocaleID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSA_County");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SSA_County"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSA_County_Int");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SSA_County_Int"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("stateFipsCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "StateFipsCode"));
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
