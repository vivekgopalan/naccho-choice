/**
 * IndicatorDescriptionIntervention.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.datacontract.schemas._2004._07.NCHS_HIW_DataObjects;

public class IndicatorDescriptionIntervention  implements java.io.Serializable {
    private java.lang.String grade;

    private java.lang.Integer ID;

    private java.lang.Integer indicatorDescriptionID;

    private java.lang.String interventionSource;

    private java.lang.String proposedText;

    private java.lang.String recommendationURL;

    private java.lang.Integer sortOrder;

    private java.lang.String taskForceOnCommunityPreventiveServicesFinding;

    private java.lang.String topic;

    private java.lang.String URLTag;

    public IndicatorDescriptionIntervention() {
    }

    public IndicatorDescriptionIntervention(
           java.lang.String grade,
           java.lang.Integer ID,
           java.lang.Integer indicatorDescriptionID,
           java.lang.String interventionSource,
           java.lang.String proposedText,
           java.lang.String recommendationURL,
           java.lang.Integer sortOrder,
           java.lang.String taskForceOnCommunityPreventiveServicesFinding,
           java.lang.String topic,
           java.lang.String URLTag) {
           this.grade = grade;
           this.ID = ID;
           this.indicatorDescriptionID = indicatorDescriptionID;
           this.interventionSource = interventionSource;
           this.proposedText = proposedText;
           this.recommendationURL = recommendationURL;
           this.sortOrder = sortOrder;
           this.taskForceOnCommunityPreventiveServicesFinding = taskForceOnCommunityPreventiveServicesFinding;
           this.topic = topic;
           this.URLTag = URLTag;
    }


    /**
     * Gets the grade value for this IndicatorDescriptionIntervention.
     * 
     * @return grade
     */
    public java.lang.String getGrade() {
        return grade;
    }


    /**
     * Sets the grade value for this IndicatorDescriptionIntervention.
     * 
     * @param grade
     */
    public void setGrade(java.lang.String grade) {
        this.grade = grade;
    }


    /**
     * Gets the ID value for this IndicatorDescriptionIntervention.
     * 
     * @return ID
     */
    public java.lang.Integer getID() {
        return ID;
    }


    /**
     * Sets the ID value for this IndicatorDescriptionIntervention.
     * 
     * @param ID
     */
    public void setID(java.lang.Integer ID) {
        this.ID = ID;
    }


    /**
     * Gets the indicatorDescriptionID value for this IndicatorDescriptionIntervention.
     * 
     * @return indicatorDescriptionID
     */
    public java.lang.Integer getIndicatorDescriptionID() {
        return indicatorDescriptionID;
    }


    /**
     * Sets the indicatorDescriptionID value for this IndicatorDescriptionIntervention.
     * 
     * @param indicatorDescriptionID
     */
    public void setIndicatorDescriptionID(java.lang.Integer indicatorDescriptionID) {
        this.indicatorDescriptionID = indicatorDescriptionID;
    }


    /**
     * Gets the interventionSource value for this IndicatorDescriptionIntervention.
     * 
     * @return interventionSource
     */
    public java.lang.String getInterventionSource() {
        return interventionSource;
    }


    /**
     * Sets the interventionSource value for this IndicatorDescriptionIntervention.
     * 
     * @param interventionSource
     */
    public void setInterventionSource(java.lang.String interventionSource) {
        this.interventionSource = interventionSource;
    }


    /**
     * Gets the proposedText value for this IndicatorDescriptionIntervention.
     * 
     * @return proposedText
     */
    public java.lang.String getProposedText() {
        return proposedText;
    }


    /**
     * Sets the proposedText value for this IndicatorDescriptionIntervention.
     * 
     * @param proposedText
     */
    public void setProposedText(java.lang.String proposedText) {
        this.proposedText = proposedText;
    }


    /**
     * Gets the recommendationURL value for this IndicatorDescriptionIntervention.
     * 
     * @return recommendationURL
     */
    public java.lang.String getRecommendationURL() {
        return recommendationURL;
    }


    /**
     * Sets the recommendationURL value for this IndicatorDescriptionIntervention.
     * 
     * @param recommendationURL
     */
    public void setRecommendationURL(java.lang.String recommendationURL) {
        this.recommendationURL = recommendationURL;
    }


    /**
     * Gets the sortOrder value for this IndicatorDescriptionIntervention.
     * 
     * @return sortOrder
     */
    public java.lang.Integer getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this IndicatorDescriptionIntervention.
     * 
     * @param sortOrder
     */
    public void setSortOrder(java.lang.Integer sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the taskForceOnCommunityPreventiveServicesFinding value for this IndicatorDescriptionIntervention.
     * 
     * @return taskForceOnCommunityPreventiveServicesFinding
     */
    public java.lang.String getTaskForceOnCommunityPreventiveServicesFinding() {
        return taskForceOnCommunityPreventiveServicesFinding;
    }


    /**
     * Sets the taskForceOnCommunityPreventiveServicesFinding value for this IndicatorDescriptionIntervention.
     * 
     * @param taskForceOnCommunityPreventiveServicesFinding
     */
    public void setTaskForceOnCommunityPreventiveServicesFinding(java.lang.String taskForceOnCommunityPreventiveServicesFinding) {
        this.taskForceOnCommunityPreventiveServicesFinding = taskForceOnCommunityPreventiveServicesFinding;
    }


    /**
     * Gets the topic value for this IndicatorDescriptionIntervention.
     * 
     * @return topic
     */
    public java.lang.String getTopic() {
        return topic;
    }


    /**
     * Sets the topic value for this IndicatorDescriptionIntervention.
     * 
     * @param topic
     */
    public void setTopic(java.lang.String topic) {
        this.topic = topic;
    }


    /**
     * Gets the URLTag value for this IndicatorDescriptionIntervention.
     * 
     * @return URLTag
     */
    public java.lang.String getURLTag() {
        return URLTag;
    }


    /**
     * Sets the URLTag value for this IndicatorDescriptionIntervention.
     * 
     * @param URLTag
     */
    public void setURLTag(java.lang.String URLTag) {
        this.URLTag = URLTag;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicatorDescriptionIntervention)) return false;
        IndicatorDescriptionIntervention other = (IndicatorDescriptionIntervention) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.grade==null && other.getGrade()==null) || 
             (this.grade!=null &&
              this.grade.equals(other.getGrade()))) &&
            ((this.ID==null && other.getID()==null) || 
             (this.ID!=null &&
              this.ID.equals(other.getID()))) &&
            ((this.indicatorDescriptionID==null && other.getIndicatorDescriptionID()==null) || 
             (this.indicatorDescriptionID!=null &&
              this.indicatorDescriptionID.equals(other.getIndicatorDescriptionID()))) &&
            ((this.interventionSource==null && other.getInterventionSource()==null) || 
             (this.interventionSource!=null &&
              this.interventionSource.equals(other.getInterventionSource()))) &&
            ((this.proposedText==null && other.getProposedText()==null) || 
             (this.proposedText!=null &&
              this.proposedText.equals(other.getProposedText()))) &&
            ((this.recommendationURL==null && other.getRecommendationURL()==null) || 
             (this.recommendationURL!=null &&
              this.recommendationURL.equals(other.getRecommendationURL()))) &&
            ((this.sortOrder==null && other.getSortOrder()==null) || 
             (this.sortOrder!=null &&
              this.sortOrder.equals(other.getSortOrder()))) &&
            ((this.taskForceOnCommunityPreventiveServicesFinding==null && other.getTaskForceOnCommunityPreventiveServicesFinding()==null) || 
             (this.taskForceOnCommunityPreventiveServicesFinding!=null &&
              this.taskForceOnCommunityPreventiveServicesFinding.equals(other.getTaskForceOnCommunityPreventiveServicesFinding()))) &&
            ((this.topic==null && other.getTopic()==null) || 
             (this.topic!=null &&
              this.topic.equals(other.getTopic()))) &&
            ((this.URLTag==null && other.getURLTag()==null) || 
             (this.URLTag!=null &&
              this.URLTag.equals(other.getURLTag())));
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
        if (getGrade() != null) {
            _hashCode += getGrade().hashCode();
        }
        if (getID() != null) {
            _hashCode += getID().hashCode();
        }
        if (getIndicatorDescriptionID() != null) {
            _hashCode += getIndicatorDescriptionID().hashCode();
        }
        if (getInterventionSource() != null) {
            _hashCode += getInterventionSource().hashCode();
        }
        if (getProposedText() != null) {
            _hashCode += getProposedText().hashCode();
        }
        if (getRecommendationURL() != null) {
            _hashCode += getRecommendationURL().hashCode();
        }
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        if (getTaskForceOnCommunityPreventiveServicesFinding() != null) {
            _hashCode += getTaskForceOnCommunityPreventiveServicesFinding().hashCode();
        }
        if (getTopic() != null) {
            _hashCode += getTopic().hashCode();
        }
        if (getURLTag() != null) {
            _hashCode += getURLTag().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicatorDescriptionIntervention.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorDescriptionIntervention"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("grade");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Grade"));
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
        elemField.setFieldName("indicatorDescriptionID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "IndicatorDescriptionID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interventionSource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "InterventionSource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposedText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "ProposedText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommendationURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "RecommendationURL"));
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
        elemField.setFieldName("taskForceOnCommunityPreventiveServicesFinding");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "TaskForceOnCommunityPreventiveServicesFinding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("topic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "Topic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("URLTag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.datacontract.org/2004/07/NCHS.HIW.DataObjects", "URLTag"));
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
