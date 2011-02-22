/**
 * IndicatorExport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class IndicatorExport  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.IndicatorExport  implements java.io.Serializable {
    private java.lang.String exportFileType;

    private java.lang.String indicatorDescription;

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
           java.lang.Integer indicatorDescriptionID,
           java.lang.String exportFileType,
           java.lang.String indicatorDescription) {
        super(
            createdDate,
            dataFile,
            dataFileContentType,
            dataFileExtension,
            dataFileGUID,
            dataFileLength,
            dataFileName,
            exportFileTypeID,
            ID,
            indicatorDescriptionID);
        this.exportFileType = exportFileType;
        this.indicatorDescription = indicatorDescription;
    }


    /**
     * Gets the exportFileType value for this IndicatorExport.
     * 
     * @return exportFileType
     */
    public java.lang.String getExportFileType() {
        return exportFileType;
    }


    /**
     * Sets the exportFileType value for this IndicatorExport.
     * 
     * @param exportFileType
     */
    public void setExportFileType(java.lang.String exportFileType) {
        this.exportFileType = exportFileType;
    }


    /**
     * Gets the indicatorDescription value for this IndicatorExport.
     * 
     * @return indicatorDescription
     */
    public java.lang.String getIndicatorDescription() {
        return indicatorDescription;
    }


    /**
     * Sets the indicatorDescription value for this IndicatorExport.
     * 
     * @param indicatorDescription
     */
    public void setIndicatorDescription(java.lang.String indicatorDescription) {
        this.indicatorDescription = indicatorDescription;
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
        _equals = super.equals(obj) && 
            ((this.exportFileType==null && other.getExportFileType()==null) || 
             (this.exportFileType!=null &&
              this.exportFileType.equals(other.getExportFileType()))) &&
            ((this.indicatorDescription==null && other.getIndicatorDescription()==null) || 
             (this.indicatorDescription!=null &&
              this.indicatorDescription.equals(other.getIndicatorDescription())));
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
        if (getExportFileType() != null) {
            _hashCode += getExportFileType().hashCode();
        }
        if (getIndicatorDescription() != null) {
            _hashCode += getIndicatorDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorExport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorExport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exportFileType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "ExportFileType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicatorDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "IndicatorDescription"));
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
