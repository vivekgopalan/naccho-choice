/**
 * DimensionGraph.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_Service_ServiceObjects;

public class DimensionGraph  extends org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects.DimensionGraph  implements java.io.Serializable {
    public DimensionGraph() {
    }

    public DimensionGraph(
           java.lang.String adjustment,
           java.lang.Integer adjustmentID,
           java.lang.Integer adjustmentSortOrder,
           java.lang.String ageAdjustment,
           java.lang.Integer ageAdjustmentID,
           java.lang.Integer ageAdjustmentSortOrder,
           java.lang.String ageRange,
           java.lang.Integer ageRangeID,
           java.lang.Integer ageRangeSortOrder,
           java.lang.String chronicCondition,
           java.lang.Integer chronicConditionID,
           java.lang.Integer chronicConditionSortOrder,
           java.lang.String disabilityStatus,
           java.lang.Integer disabilityStatusID,
           java.lang.Integer disabilityStatusSortOrder,
           java.lang.String educationLevel,
           java.lang.Integer educationLevelID,
           java.lang.Integer educationLevelSortOrder,
           java.lang.String ethnicity,
           java.lang.Integer ethnicityID,
           java.lang.Integer ethnicitySortOrder,
           java.lang.String familyIncomeLevel,
           java.lang.Integer familyIncomeLevelID,
           java.lang.Integer familyIncomeLevelSortOrder,
           java.lang.String familyType,
           java.lang.Integer familyTypeID,
           java.lang.Integer familyTypeSortOrder,
           java.lang.String gender,
           java.lang.Integer genderID,
           java.lang.Integer genderSortOrder,
           java.lang.String header,
           java.lang.String healthInsuranceStatus,
           java.lang.Integer healthInsuranceStatusID,
           java.lang.Integer healthInsuranceStatuseSortOrder,
           java.lang.Integer ID,
           java.lang.String label,
           java.lang.String maritalStatus,
           java.lang.Integer maritalStatusID,
           java.lang.Integer maritalStatuseSortOrder,
           java.lang.String metroLocation,
           java.lang.Integer metroLocationID,
           java.lang.Integer metroLocationSortOrder,
           java.lang.String other,
           java.lang.Integer otherID,
           java.lang.Integer otherSortOrder,
           java.lang.String schoolGradeLevel,
           java.lang.Integer schoolGradeLevelID,
           java.lang.Integer schoolGradeLevelSortOrder,
           java.lang.String sexualOrientation,
           java.lang.Integer sexualOrientationID,
           java.lang.Integer sexualOrientationSortOrder,
           java.lang.String total,
           java.lang.Integer totalID,
           java.lang.Integer totalSortOrder) {
        super(
            adjustment,
            adjustmentID,
            adjustmentSortOrder,
            ageAdjustment,
            ageAdjustmentID,
            ageAdjustmentSortOrder,
            ageRange,
            ageRangeID,
            ageRangeSortOrder,
            chronicCondition,
            chronicConditionID,
            chronicConditionSortOrder,
            disabilityStatus,
            disabilityStatusID,
            disabilityStatusSortOrder,
            educationLevel,
            educationLevelID,
            educationLevelSortOrder,
            ethnicity,
            ethnicityID,
            ethnicitySortOrder,
            familyIncomeLevel,
            familyIncomeLevelID,
            familyIncomeLevelSortOrder,
            familyType,
            familyTypeID,
            familyTypeSortOrder,
            gender,
            genderID,
            genderSortOrder,
            header,
            healthInsuranceStatus,
            healthInsuranceStatusID,
            healthInsuranceStatuseSortOrder,
            ID,
            label,
            maritalStatus,
            maritalStatusID,
            maritalStatuseSortOrder,
            metroLocation,
            metroLocationID,
            metroLocationSortOrder,
            other,
            otherID,
            otherSortOrder,
            schoolGradeLevel,
            schoolGradeLevelID,
            schoolGradeLevelSortOrder,
            sexualOrientation,
            sexualOrientationID,
            sexualOrientationSortOrder,
            total,
            totalID,
            totalSortOrder);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DimensionGraph)) return false;
        DimensionGraph other = (DimensionGraph) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DimensionGraph.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.Service.ServiceObjects", "DimensionGraph"));
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
