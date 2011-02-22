/**
 * IndicatorExport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class IndicatorExport  implements java.io.Serializable {
    private java.util.Calendar createdDate;

    private byte[] dataFile;

    private java.lang.String dataFileContentType;

    private java.lang.String dataFileExtension;

    private java.lang.String dataFileGUID;

    private java.lang.Integer dataFileLength;

    private java.lang.String dataFileName;

    private java.lang.Integer exportFileTypeID;

    private java.lang.Integer ID;

    private java.lang.Integer indicatorDescriptionID;

    public IndicatorExport() {
    }

    public IndicatorExport(
           java.util.Calendar createdDate,
           byte[] dataFile,
           java.lang.String dataFileContentType,
           java.lang.String dataFileExtension,
           java.lang.String dataFileGUID,
           java.lang.Integer dataFileLength,
           java.lang.String dataFileName,
           java.lang.Integer exportFileTypeID,
           java.lang.Integer ID,
           java.lang.Integer indicatorDescriptionID) {
           this.createdDate = createdDate;
           this.dataFile = dataFile;
           this.dataFileContentType = dataFileContentType;
           this.dataFileExtension = dataFileExtension;
           this.dataFileGUID = dataFileGUID;
           this.dataFileLength = dataFileLength;
           this.dataFileName = dataFileName;
           this.exportFileTypeID = exportFileTypeID;
           this.ID = ID;
           this.indicatorDescriptionID = indicatorDescriptionID;
    }


    /**
     * Gets the createdDate value for this IndicatorExport.
     * 
     * @return createdDate
     */
    public java.util.Calendar getCreatedDate() {
        return createdDate;
    }


    /**
     * Sets the createdDate value for this IndicatorExport.
     * 
     * @param createdDate
     */
    public void setCreatedDate(java.util.Calendar createdDate) {
        this.createdDate = createdDate;
    }


    /**
     * Gets the dataFile value for this IndicatorExport.
     * 
     * @return dataFile
     */
    public byte[] getDataFile() {
        return dataFile;
    }


    /**
     * Sets the dataFile value for this IndicatorExport.
     * 
     * @param dataFile
     */
    public void setDataFile(byte[] dataFile) {
        this.dataFile = dataFile;
    }


    /**
     * Gets the dataFileContentType value for this IndicatorExport.
     * 
     * @return dataFileContentType
     */
    public java.lang.String getDataFileContentType() {
        return dataFileContentType;
    }


    /**
     * Sets the dataFileContentType value for this IndicatorExport.
     * 
     * @param dataFileContentType
     */
    public void setDataFileContentType(java.lang.String dataFileContentType) {
        this.dataFileContentType = dataFileContentType;
    }


    /**
     * Gets the dataFileExtension value for this IndicatorExport.
     * 
     * @return dataFileExtension
     */
    public java.lang.String getDataFileExtension() {
        return dataFileExtension;
    }


    /**
     * Sets the dataFileExtension value for this IndicatorExport.
     * 
     * @param dataFileExtension
     */
    public void setDataFileExtension(java.lang.String dataFileExtension) {
        this.dataFileExtension = dataFileExtension;
    }


    /**
     * Gets the dataFileGUID value for this IndicatorExport.
     * 
     * @return dataFileGUID
     */
    public java.lang.String getDataFileGUID() {
        return dataFileGUID;
    }


    /**
     * Sets the dataFileGUID value for this IndicatorExport.
     * 
     * @param dataFileGUID
     */
    public void setDataFileGUID(java.lang.String dataFileGUID) {
        this.dataFileGUID = dataFileGUID;
    }


    /**
     * Gets the dataFileLength value for this IndicatorExport.
     * 
     * @return dataFileLength
     */
    public java.lang.Integer getDataFileLength() {
        return dataFileLength;
    }


    /**
     * Sets the dataFileLength value for this IndicatorExport.
     * 
     * @param dataFileLength
     */
    public void setDataFileLength(java.lang.Integer dataFileLength) {
        this.dataFileLength = dataFileLength;
    }


    /**
     * Gets the dataFileName value for this IndicatorExport.
     * 
     * @return dataFileName
     */
    public java.lang.String getDataFileName() {
        return dataFileName;
    }


    /**
     * Sets the dataFileName value for this IndicatorExport.
     * 
     * @param dataFileName
     */
    public void setDataFileName(java.lang.String dataFileName) {
        this.dataFileName = dataFileName;
    }


    /**
     * Gets the exportFileTypeID value for this IndicatorExport.
     * 
     * @return exportFileTypeID
     */
    public java.lang.Integer getExportFileTypeID() {
        return exportFileTypeID;
    }


    /**
     * Sets the exportFileTypeID value for this IndicatorExport.
     * 
     * @param exportFileTypeID
     */
    public void setExportFileTypeID(java.lang.Integer exportFileTypeID) {
        this.exportFileTypeID = exportFileTypeID;
    }


    /**
     * Gets the ID value for this IndicatorExport.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this IndicatorExport.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the indicatorDescriptionID value for this IndicatorExport.
     * 
     * @return indicatorDescriptionID
     */
    public java.lang.Integer getIndicatorDescriptionID() {
        return indicatorDescriptionID;
    }


    /**
     * Sets the indicatorDescriptionID value for this IndicatorExport.
     * 
     * @param indicatorDescriptionID
     */
    public void setIndicatorDescriptionID(java.lang.Integer indicatorDescriptionID) {
        this.indicatorDescriptionID = indicatorDescriptionID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicatorExport)) return false;
        IndicatorExport other = (IndicatorExport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.createdDate==null && other.getCreatedDate()==null) || 
             (this.createdDate!=null &&
              this.createdDate.equals(other.getCreatedDate()))) &&
            ((this.dataFile==null && other.getDataFile()==null) || 
             (this.dataFile!=null &&
              java.util.Arrays.equals(this.dataFile, other.getDataFile()))) &&
            ((this.dataFileContentType==null && other.getDataFileContentType()==null) || 
             (this.dataFileContentType!=null &&
              this.dataFileContentType.equals(other.getDataFileContentType()))) &&
            ((this.dataFileExtension==null && other.getDataFileExtension()==null) || 
             (this.dataFileExtension!=null &&
              this.dataFileExtension.equals(other.getDataFileExtension()))) &&
            ((this.dataFileGUID==null && other.getDataFileGUID()==null) || 
             (this.dataFileGUID!=null &&
              this.dataFileGUID.equals(other.getDataFileGUID()))) &&
            ((this.dataFileLength==null && other.getDataFileLength()==null) || 
             (this.dataFileLength!=null &&
              this.dataFileLength.equals(other.getDataFileLength()))) &&
            ((this.dataFileName==null && other.getDataFileName()==null) || 
             (this.dataFileName!=null &&
              this.dataFileName.equals(other.getDataFileName()))) &&
            ((this.exportFileTypeID==null && other.getExportFileTypeID()==null) || 
             (this.exportFileTypeID!=null &&
              this.exportFileTypeID.equals(other.getExportFileTypeID()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.indicatorDescriptionID==null && other.getIndicatorDescriptionID()==null) || 
             (this.indicatorDescriptionID!=null &&
              this.indicatorDescriptionID.equals(other.getIndicatorDescriptionID())));
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
        if (getCreatedDate() != null) {
            _hashCode += getCreatedDate().hashCode();
        }
        if (getDataFile() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDataFile());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDataFile(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDataFileContentType() != null) {
            _hashCode += getDataFileContentType().hashCode();
        }
        if (getDataFileExtension() != null) {
            _hashCode += getDataFileExtension().hashCode();
        }
        if (getDataFileGUID() != null) {
            _hashCode += getDataFileGUID().hashCode();
        }
        if (getDataFileLength() != null) {
            _hashCode += getDataFileLength().hashCode();
        }
        if (getDataFileName() != null) {
            _hashCode += getDataFileName().hashCode();
        }
        if (getExportFileTypeID() != null) {
            _hashCode += getExportFileTypeID().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIndicatorDescriptionID() != null) {
            _hashCode += getIndicatorDescriptionID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorExport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorExport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "CreatedDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFile");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFileContentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataFileContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFileExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataFileExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFileGUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataFileGUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFileLength");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataFileLength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataFileName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "DataFileName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportFileTypeID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ExportFileTypeID"));
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
        elemField.setFieldName("indicatorDescriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorDescriptionID"));
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
