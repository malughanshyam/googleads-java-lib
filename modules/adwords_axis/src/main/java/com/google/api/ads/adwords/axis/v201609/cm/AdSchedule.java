// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

/**
 * AdSchedule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201609.cm;


/**
 * Represents an AdSchedule Criterion.
 *             AdSchedule is specified as day and time of the week criteria
 * to target
 *             the Ads.
 *             <p><b>Note:</b> An AdSchedule may not have more than <b>six</b>
 * intervals
 *             in a day.</p>
 *             <span class="constraint AdxEnabled">This is enabled for
 * AdX.</span>
 */
public class AdSchedule  extends com.google.api.ads.adwords.axis.v201609.cm.Criterion  implements java.io.Serializable {
    /* Day of the week the schedule applies to.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201609.cm.DayOfWeek dayOfWeek;

    /* Starting hour in 24 hour time.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 23, inclusive.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Integer startHour;

    /* Interval starts these minutes after the starting hour.
     *                     The value can be 0, 15, 30, and 45.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201609.cm.MinuteOfHour startMinute;

    /* Ending hour in 24 hour time; <code>24</code> signifies end
     * of the day.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 24, inclusive.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private java.lang.Integer endHour;

    /* Interval ends these minutes after the ending hour.
     *                     The value can be 0, 15, 30, and 45.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span> */
    private com.google.api.ads.adwords.axis.v201609.cm.MinuteOfHour endMinute;

    public AdSchedule() {
    }

    public AdSchedule(
           java.lang.Long id,
           com.google.api.ads.adwords.axis.v201609.cm.CriterionType type,
           java.lang.String criterionType,
           com.google.api.ads.adwords.axis.v201609.cm.DayOfWeek dayOfWeek,
           java.lang.Integer startHour,
           com.google.api.ads.adwords.axis.v201609.cm.MinuteOfHour startMinute,
           java.lang.Integer endHour,
           com.google.api.ads.adwords.axis.v201609.cm.MinuteOfHour endMinute) {
        super(
            id,
            type,
            criterionType);
        this.dayOfWeek = dayOfWeek;
        this.startHour = startHour;
        this.startMinute = startMinute;
        this.endHour = endHour;
        this.endMinute = endMinute;
    }


    /**
     * Gets the dayOfWeek value for this AdSchedule.
     * 
     * @return dayOfWeek   * Day of the week the schedule applies to.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201609.cm.DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }


    /**
     * Sets the dayOfWeek value for this AdSchedule.
     * 
     * @param dayOfWeek   * Day of the week the schedule applies to.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setDayOfWeek(com.google.api.ads.adwords.axis.v201609.cm.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }


    /**
     * Gets the startHour value for this AdSchedule.
     * 
     * @return startHour   * Starting hour in 24 hour time.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 23, inclusive.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Integer getStartHour() {
        return startHour;
    }


    /**
     * Sets the startHour value for this AdSchedule.
     * 
     * @param startHour   * Starting hour in 24 hour time.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 23, inclusive.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setStartHour(java.lang.Integer startHour) {
        this.startHour = startHour;
    }


    /**
     * Gets the startMinute value for this AdSchedule.
     * 
     * @return startMinute   * Interval starts these minutes after the starting hour.
     *                     The value can be 0, 15, 30, and 45.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201609.cm.MinuteOfHour getStartMinute() {
        return startMinute;
    }


    /**
     * Sets the startMinute value for this AdSchedule.
     * 
     * @param startMinute   * Interval starts these minutes after the starting hour.
     *                     The value can be 0, 15, 30, and 45.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setStartMinute(com.google.api.ads.adwords.axis.v201609.cm.MinuteOfHour startMinute) {
        this.startMinute = startMinute;
    }


    /**
     * Gets the endHour value for this AdSchedule.
     * 
     * @return endHour   * Ending hour in 24 hour time; <code>24</code> signifies end
     * of the day.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 24, inclusive.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public java.lang.Integer getEndHour() {
        return endHour;
    }


    /**
     * Sets the endHour value for this AdSchedule.
     * 
     * @param endHour   * Ending hour in 24 hour time; <code>24</code> signifies end
     * of the day.
     *                     <span class="constraint InRange">This field must
     * be between 0 and 24, inclusive.</span>
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setEndHour(java.lang.Integer endHour) {
        this.endHour = endHour;
    }


    /**
     * Gets the endMinute value for this AdSchedule.
     * 
     * @return endMinute   * Interval ends these minutes after the ending hour.
     *                     The value can be 0, 15, 30, and 45.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public com.google.api.ads.adwords.axis.v201609.cm.MinuteOfHour getEndMinute() {
        return endMinute;
    }


    /**
     * Sets the endMinute value for this AdSchedule.
     * 
     * @param endMinute   * Interval ends these minutes after the ending hour.
     *                     The value can be 0, 15, 30, and 45.
     *                     <span class="constraint ReadOnly">This field is
     * read only and will be ignored when sent to the API for the following
     * {@link Operator}s: REMOVE and SET.</span>
     *                     <span class="constraint Required">This field is
     * required and should not be {@code null} when it is contained within
     * {@link Operator}s : ADD.</span>
     */
    public void setEndMinute(com.google.api.ads.adwords.axis.v201609.cm.MinuteOfHour endMinute) {
        this.endMinute = endMinute;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdSchedule)) return false;
        AdSchedule other = (AdSchedule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.dayOfWeek==null && other.getDayOfWeek()==null) || 
             (this.dayOfWeek!=null &&
              this.dayOfWeek.equals(other.getDayOfWeek()))) &&
            ((this.startHour==null && other.getStartHour()==null) || 
             (this.startHour!=null &&
              this.startHour.equals(other.getStartHour()))) &&
            ((this.startMinute==null && other.getStartMinute()==null) || 
             (this.startMinute!=null &&
              this.startMinute.equals(other.getStartMinute()))) &&
            ((this.endHour==null && other.getEndHour()==null) || 
             (this.endHour!=null &&
              this.endHour.equals(other.getEndHour()))) &&
            ((this.endMinute==null && other.getEndMinute()==null) || 
             (this.endMinute!=null &&
              this.endMinute.equals(other.getEndMinute())));
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
        if (getDayOfWeek() != null) {
            _hashCode += getDayOfWeek().hashCode();
        }
        if (getStartHour() != null) {
            _hashCode += getStartHour().hashCode();
        }
        if (getStartMinute() != null) {
            _hashCode += getStartMinute().hashCode();
        }
        if (getEndHour() != null) {
            _hashCode += getEndHour().hashCode();
        }
        if (getEndMinute() != null) {
            _hashCode += getEndMinute().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdSchedule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "AdSchedule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dayOfWeek");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "dayOfWeek"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "DayOfWeek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "startHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "startMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "MinuteOfHour"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endHour");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "endHour"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endMinute");
        elemField.setXmlName(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "endMinute"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://adwords.google.com/api/adwords/cm/v201609", "MinuteOfHour"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
