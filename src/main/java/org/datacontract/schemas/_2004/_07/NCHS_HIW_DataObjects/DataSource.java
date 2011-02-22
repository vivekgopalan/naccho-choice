/**
 * DataSource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class DataSource  implements java.io.Serializable {
    private java.lang.String acronym;

    private java.lang.String dataLimitations;

    private java.lang.String dataYearsAvailable;

    private java.lang.String description;

    private java.lang.Integer endYearID;

    private java.lang.Integer ID;

    private java.lang.String interpretationIssues;

    private java.lang.String methodology;

    private java.lang.String mode;

    private java.lang.String name;

    private java.lang.String periodicity;

    private java.lang.String populationCovered;

    private java.lang.String references1;

    private java.lang.String references2;

    private java.lang.String references3;

    private java.lang.String references4;

    private java.lang.String responseRateAndSampleSize;

    private java.lang.String selectedContent;

    private java.lang.Integer sortOrder;

    private java.lang.Integer startYearID;

    private java.lang.String supplierAcronym;

    private java.lang.String supplierName;

    private java.lang.String suppressionCriteria;

    private java.lang.String URL;

    public DataSource() {
    }

    public DataSource(
           java.lang.String acronym,
           java.lang.String dataLimitations,
           java.lang.String dataYearsAvailable,
           java.lang.String description,
           java.lang.Integer endYearID,
           java.lang.Integer ID,
           java.lang.String interpretationIssues,
           java.lang.String methodology,
           java.lang.String mode,
           java.lang.String name,
           java.lang.String periodicity,
           java.lang.String populationCovered,
           java.lang.String references1,
           java.lang.String references2,
           java.lang.String references3,
           java.lang.String references4,
           java.lang.String responseRateAndSampleSize,
           java.lang.String selectedContent,
           java.lang.Integer sortOrder,
           java.lang.Integer startYearID,
           java.lang.String supplierAcronym,
           java.lang.String supplierName,
           java.lang.String suppressionCriteria,
           java.lang.String URL) {
           this.acronym = acronym;
           this.dataLimitations = dataLimitations;
           this.dataYearsAvailable = dataYearsAvailable;
           this.description = description;
           this.endYearID = endYearID;
           this.ID = ID;
           this.interpretationIssues = interpretationIssues;
           this.methodology = methodology;
           this.mode = mode;
           this.name = name;
           this.periodicity = periodicity;
           this.populationCovered = populationCovered;
           this.references1 = references1;
           this.references2 = references2;
           this.references3 = references3;
           this.references4 = references4;
           this.responseRateAndSampleSize = responseRateAndSampleSize;
           this.selectedContent = selectedContent;
           this.sortOrder = sortOrder;
           this.startYearID = startYearID;
           this.supplierAcronym = supplierAcronym;
           this.supplierName = supplierName;
           this.suppressionCriteria = suppressionCriteria;
           this.URL = URL;
    }


    /**
     * Gets the acronym value for this DataSource.
     * 
     * @return acronym
     */
    public java.lang.String getAcronym() {
        return acronym;
    }


    /**
     * Sets the acronym value for this DataSource.
     * 
     * @param acronym
     */
    public void setAcronym(java.lang.String acronym) {
        this.acronym = acronym;
    }


    /**
     * Gets the dataLimitations value for this DataSource.
     * 
     * @return dataLimitations
     */
    public java.lang.String getDataLimitations() {
        return dataLimitations;
    }


    /**
     * Sets the dataLimitations value for this DataSource.
     * 
     * @param dataLimitations
     */
    public void setDataLimitations(java.lang.String dataLimitations) {
        this.dataLimitations = dataLimitations;
    }


    /**
     * Gets the dataYearsAvailable value for this DataSource.
     * 
     * @return dataYearsAvailable
     */
    public java.lang.String getDataYearsAvailable() {
        return dataYearsAvailable;
    }


    /**
     * Sets the dataYearsAvailable value for this DataSource.
     * 
     * @param dataYearsAvailable
     */
    public void setDataYearsAvailable(java.lang.String dataYearsAvailable) {
        this.dataYearsAvailable = dataYearsAvailable;
    }


    /**
     * Gets the description value for this DataSource.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this DataSource.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the endYearID value for this DataSource.
     * 
     * @return endYearID
     */
    public java.lang.Integer getEndYearID() {
        return endYearID;
    }


    /**
     * Sets the endYearID value for this DataSource.
     * 
     * @param endYearID
     */
    public void setEndYearID(java.lang.Integer endYearID) {
        this.endYearID = endYearID;
    }


    /**
     * Gets the ID value for this DataSource.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this DataSource.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the interpretationIssues value for this DataSource.
     * 
     * @return interpretationIssues
     */
    public java.lang.String getInterpretationIssues() {
        return interpretationIssues;
    }


    /**
     * Sets the interpretationIssues value for this DataSource.
     * 
     * @param interpretationIssues
     */
    public void setInterpretationIssues(java.lang.String interpretationIssues) {
        this.interpretationIssues = interpretationIssues;
    }


    /**
     * Gets the methodology value for this DataSource.
     * 
     * @return methodology
     */
    public java.lang.String getMethodology() {
        return methodology;
    }


    /**
     * Sets the methodology value for this DataSource.
     * 
     * @param methodology
     */
    public void setMethodology(java.lang.String methodology) {
        this.methodology = methodology;
    }


    /**
     * Gets the mode value for this DataSource.
     * 
     * @return mode
     */
    public java.lang.String getMode() {
        return mode;
    }


    /**
     * Sets the mode value for this DataSource.
     * 
     * @param mode
     */
    public void setMode(java.lang.String mode) {
        this.mode = mode;
    }


    /**
     * Gets the name value for this DataSource.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this DataSource.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the periodicity value for this DataSource.
     * 
     * @return periodicity
     */
    public java.lang.String getPeriodicity() {
        return periodicity;
    }


    /**
     * Sets the periodicity value for this DataSource.
     * 
     * @param periodicity
     */
    public void setPeriodicity(java.lang.String periodicity) {
        this.periodicity = periodicity;
    }


    /**
     * Gets the populationCovered value for this DataSource.
     * 
     * @return populationCovered
     */
    public java.lang.String getPopulationCovered() {
        return populationCovered;
    }


    /**
     * Sets the populationCovered value for this DataSource.
     * 
     * @param populationCovered
     */
    public void setPopulationCovered(java.lang.String populationCovered) {
        this.populationCovered = populationCovered;
    }


    /**
     * Gets the references1 value for this DataSource.
     * 
     * @return references1
     */
    public java.lang.String getReferences1() {
        return references1;
    }


    /**
     * Sets the references1 value for this DataSource.
     * 
     * @param references1
     */
    public void setReferences1(java.lang.String references1) {
        this.references1 = references1;
    }


    /**
     * Gets the references2 value for this DataSource.
     * 
     * @return references2
     */
    public java.lang.String getReferences2() {
        return references2;
    }


    /**
     * Sets the references2 value for this DataSource.
     * 
     * @param references2
     */
    public void setReferences2(java.lang.String references2) {
        this.references2 = references2;
    }


    /**
     * Gets the references3 value for this DataSource.
     * 
     * @return references3
     */
    public java.lang.String getReferences3() {
        return references3;
    }


    /**
     * Sets the references3 value for this DataSource.
     * 
     * @param references3
     */
    public void setReferences3(java.lang.String references3) {
        this.references3 = references3;
    }


    /**
     * Gets the references4 value for this DataSource.
     * 
     * @return references4
     */
    public java.lang.String getReferences4() {
        return references4;
    }


    /**
     * Sets the references4 value for this DataSource.
     * 
     * @param references4
     */
    public void setReferences4(java.lang.String references4) {
        this.references4 = references4;
    }


    /**
     * Gets the responseRateAndSampleSize value for this DataSource.
     * 
     * @return responseRateAndSampleSize
     */
    public java.lang.String getResponseRateAndSampleSize() {
        return responseRateAndSampleSize;
    }


    /**
     * Sets the responseRateAndSampleSize value for this DataSource.
     * 
     * @param responseRateAndSampleSize
     */
    public void setResponseRateAndSampleSize(java.lang.String responseRateAndSampleSize) {
        this.responseRateAndSampleSize = responseRateAndSampleSize;
    }


    /**
     * Gets the selectedContent value for this DataSource.
     * 
     * @return selectedContent
     */
    public java.lang.String getSelectedContent() {
        return selectedContent;
    }


    /**
     * Sets the selectedContent value for this DataSource.
     * 
     * @param selectedContent
     */
    public void setSelectedContent(java.lang.String selectedContent) {
        this.selectedContent = selectedContent;
    }


    /**
     * Gets the sortOrder value for this DataSource.
     * 
     * @return sortOrder
     */
    public java.lang.Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this DataSource.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the startYearID value for this DataSource.
     * 
     * @return startYearID
     */
    public java.lang.Integer getStartYearID() {
        return startYearID;
    }


    /**
     * Sets the startYearID value for this DataSource.
     * 
     * @param startYearID
     */
    public void setStartYearID(java.lang.Integer startYearID) {
        this.startYearID = startYearID;
    }


    /**
     * Gets the supplierAcronym value for this DataSource.
     * 
     * @return supplierAcronym
     */
    public java.lang.String getSupplierAcronym() {
        return supplierAcronym;
    }


    /**
     * Sets the supplierAcronym value for this DataSource.
     * 
     * @param supplierAcronym
     */
    public void setSupplierAcronym(java.lang.String supplierAcronym) {
        this.supplierAcronym = supplierAcronym;
    }


    /**
     * Gets the supplierName value for this DataSource.
     * 
     * @return supplierName
     */
    public java.lang.String getSupplierName() {
        return supplierName;
    }


    /**
     * Sets the supplierName value for this DataSource.
     * 
     * @param supplierName
     */
    public void setSupplierName(java.lang.String supplierName) {
        this.supplierName = supplierName;
    }


    /**
     * Gets the suppressionCriteria value for this DataSource.
     * 
     * @return suppressionCriteria
     */
    public java.lang.String getSuppressionCriteria() {
        return suppressionCriteria;
    }


    /**
     * Sets the suppressionCriteria value for this DataSource.
     * 
     * @param suppressionCriteria
     */
    public void setSuppressionCriteria(java.lang.String suppressionCriteria) {
        this.suppressionCriteria = suppressionCriteria;
    }


    /**
     * Gets the URL value for this DataSource.
     * 
     * @return URL
     */
    public java.lang.String getURL() {
        return URL;
    }


    /**
     * Sets the URL value for this DataSource.
     * 
     * @param URL
     */
    public void setURL(java.lang.String URL) {
        this.URL = URL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DataSource)) return false;
        DataSource other = (DataSource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.acronym==null && other.getAcronym()==null) || 
             (this.acronym!=null &&
              this.acronym.equals(other.getAcronym()))) &&
            ((this.dataLimitations==null && other.getDataLimitations()==null) || 
             (this.dataLimitations!=null &&
              this.dataLimitations.equals(other.getDataLimitations()))) &&
            ((this.dataYearsAvailable==null && other.getDataYearsAvailable()==null) || 
             (this.dataYearsAvailable!=null &&
              this.dataYearsAvailable.equals(other.getDataYearsAvailable()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.endYearID==null && other.getEndYearID()==null) || 
             (this.endYearID!=null &&
              this.endYearID.equals(other.getEndYearID()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.interpretationIssues==null && other.getInterpretationIssues()==null) || 
             (this.interpretationIssues!=null &&
              this.interpretationIssues.equals(other.getInterpretationIssues()))) &&
            ((this.methodology==null && other.getMethodology()==null) || 
             (this.methodology!=null &&
              this.methodology.equals(other.getMethodology()))) &&
            ((this.mode==null && other.getMode()==null) || 
             (this.mode!=null &&
              this.mode.equals(other.getMode()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            ((this.periodicity==null && other.getPeriodicity()==null) || 
             (this.periodicity!=null &&
              this.periodicity.equals(other.getPeriodicity()))) &&
            ((this.populationCovered==null && other.getPopulationCovered()==null) || 
             (this.populationCovered!=null &&
              this.populationCovered.equals(other.getPopulationCovered()))) &&
            ((this.references1==null && other.getReferences1()==null) || 
             (this.references1!=null &&
              this.references1.equals(other.getReferences1()))) &&
            ((this.references2==null && other.getReferences2()==null) || 
             (this.references2!=null &&
              this.references2.equals(other.getReferences2()))) &&
            ((this.references3==null && other.getReferences3()==null) || 
             (this.references3!=null &&
              this.references3.equals(other.getReferences3()))) &&
            ((this.references4==null && other.getReferences4()==null) || 
             (this.references4!=null &&
              this.references4.equals(other.getReferences4()))) &&
            ((this.responseRateAndSampleSize==null && other.getResponseRateAndSampleSize()==null) || 
             (this.responseRateAndSampleSize!=null &&
              this.responseRateAndSampleSize.equals(other.getResponseRateAndSampleSize()))) &&
            ((this.selectedContent==null && other.getSelectedContent()==null) || 
             (this.selectedContent!=null &&
              this.selectedContent.equals(other.getSelectedContent()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.startYearID==null && other.getStartYearID()==null) || 
             (this.startYearID!=null &&
              this.startYearID.equals(other.getStartYearID()))) &&
            ((this.supplierAcronym==null && other.getSupplierAcronym()==null) || 
             (this.supplierAcronym!=null &&
              this.supplierAcronym.equals(other.getSupplierAcronym()))) &&
            ((this.supplierName==null && other.getSupplierName()==null) || 
             (this.supplierName!=null &&
              this.supplierName.equals(other.getSupplierName()))) &&
            ((this.suppressionCriteria==null && other.getSuppressionCriteria()==null) || 
             (this.suppressionCriteria!=null &&
              this.suppressionCriteria.equals(other.getSuppressionCriteria()))) &&
            ((this.URL==null && other.getURL()==null) || 
             (this.URL!=null &&
              this.URL.equals(other.getURL())));
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
        if (getAcronym() != null) {
            _hashCode += getAcronym().hashCode();
        }
        if (getDataLimitations() != null) {
            _hashCode += getDataLimitations().hashCode();
        }
        if (getDataYearsAvailable() != null) {
            _hashCode += getDataYearsAvailable().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getEndYearID() != null) {
            _hashCode += getEndYearID().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getInterpretationIssues() != null) {
            _hashCode += getInterpretationIssues().hashCode();
        }
        if (getMethodology() != null) {
            _hashCode += getMethodology().hashCode();
        }
        if (getMode() != null) {
            _hashCode += getMode().hashCode();
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        if (getPeriodicity() != null) {
            _hashCode += getPeriodicity().hashCode();
        }
        if (getPopulationCovered() != null) {
            _hashCode += getPopulationCovered().hashCode();
        }
        if (getReferences1() != null) {
            _hashCode += getReferences1().hashCode();
        }
        if (getReferences2() != null) {
            _hashCode += getReferences2().hashCode();
        }
        if (getReferences3() != null) {
            _hashCode += getReferences3().hashCode();
        }
        if (getReferences4() != null) {
            _hashCode += getReferences4().hashCode();
        }
        if (getResponseRateAndSampleSize() != null) {
            _hashCode += getResponseRateAndSampleSize().hashCode();
        }
        if (getSelectedContent() != null) {
            _hashCode += getSelectedContent().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getStartYearID() != null) {
            _hashCode += getStartYearID().hashCode();
        }
        if (getSupplierAcronym() != null) {
            _hashCode += getSupplierAcronym().hashCode();
        }
        if (getSupplierName() != null) {
            _hashCode += getSupplierName().hashCode();
        }
        if (getSuppressionCriteria() != null) {
            _hashCode += getSuppressionCriteria().hashCode();
        }
        if (getURL() != null) {
            _hashCode += getURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DataSource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataSource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acronym");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Acronym"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataLimitations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataLimitations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataYearsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataYearsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endYearID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "EndYearID"));
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
        elemField.setFieldName("interpretationIssues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "InterpretationIssues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodology");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Methodology"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Mode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("periodicity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Periodicity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("populationCovered");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "PopulationCovered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("references1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "References1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("references2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "References2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("references3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "References3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("references4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "References4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseRateAndSampleSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ResponseRateAndSampleSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("selectedContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SelectedContent"));
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
        elemField.setFieldName("startYearID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "StartYearID"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("suppressionCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "SuppressionCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "URL"));
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
