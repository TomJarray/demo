
package org.whl.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * eUICC Information Set. The content may be only partial information depending of the function where it is used. 
 * 
 * <p>EISType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="EISType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eumSignedInfo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="eid" type="{http://namespaces.gsma.org/esim-messaging/1}EIDType"/&gt;
 *                   &lt;element name="eumId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
 *                   &lt;element name="productionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *                   &lt;element name="platformType" type="{http://namespaces.gsma.org/esim-messaging/1}String100"/&gt;
 *                   &lt;element name="platformVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
 *                   &lt;element name="isdpLoadFileAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
 *                   &lt;element name="isdpModuleAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
 *                   &lt;element name="ecasd" type="{http://namespaces.gsma.org/esim-messaging/1}SecurityDomainType"/&gt;
 *                   &lt;element name="euiccCapabilities"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="catTpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="catTpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
 *                             &lt;element name="httpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="httpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
 *                             &lt;element name="securePacketVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
 *                             &lt;element name="remoteProvisioningVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="eumSignature" type="{http://www.w3.org/2000/09/xmldsig#}SignatureType"/&gt;
 *         &lt;element name="remainingMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="availableMemoryForProfiles" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="lastAuditDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="smsrId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
 *         &lt;element name="profileInfo" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="iccid" type="{http://namespaces.gsma.org/esim-messaging/1}ICCIDType"/&gt;
 *                   &lt;element name="isdpAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
 *                   &lt;element name="mnoId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
 *                   &lt;element name="fallbackAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                   &lt;element name="subscriptionAddress" type="{http://namespaces.gsma.org/esim-messaging/1}SubscriptionAddressType"/&gt;
 *                   &lt;element name="state" type="{http://namespaces.gsma.org/esim-messaging/1}ProfileStateType"/&gt;
 *                   &lt;element name="smdpId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType" minOccurs="0"/&gt;
 *                   &lt;element name="profileType" type="{http://namespaces.gsma.org/esim-messaging/1}String100" minOccurs="0"/&gt;
 *                   &lt;element name="allocatedMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *                   &lt;element name="freeMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *                   &lt;element name="pol2" type="{http://namespaces.gsma.org/esim-messaging/1}POL2Type"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="isdr" type="{http://namespaces.gsma.org/esim-messaging/1}SecurityDomainType"/&gt;
 *         &lt;element name="auditTrail" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="record" type="{http://namespaces.gsma.org/esim-messaging/1}AuditTrailRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="additionalProperties" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="property" type="{http://namespaces.gsma.org/esim-messaging/1}PropertyType" maxOccurs="unbounded"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EISType", propOrder = {
    "eumSignedInfo",
    "eumSignature",
    "remainingMemory",
    "availableMemoryForProfiles",
    "lastAuditDate",
    "smsrId",
    "profileInfo",
    "isdr",
    "auditTrail",
    "additionalProperties"
})
public class EISType {

    @XmlElement(required = true)
    protected EISType.EumSignedInfo eumSignedInfo;
    @XmlElement(required = true)
    protected SignatureType eumSignature;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger remainingMemory;
    @XmlElement(required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger availableMemoryForProfiles;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastAuditDate;
    @XmlElement(required = true)
    protected String smsrId;
    @XmlElement(required = true)
    protected List<EISType.ProfileInfo> profileInfo;
    @XmlElement(required = true)
    protected SecurityDomainType isdr;
    protected EISType.AuditTrail auditTrail;
    protected EISType.AdditionalProperties additionalProperties;

    /**
     * ��ȡeumSignedInfo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EISType.EumSignedInfo }
     *     
     */
    public EISType.EumSignedInfo getEumSignedInfo() {
        return eumSignedInfo;
    }

    /**
     * ����eumSignedInfo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EISType.EumSignedInfo }
     *     
     */
    public void setEumSignedInfo(EISType.EumSignedInfo value) {
        this.eumSignedInfo = value;
    }

    /**
     * ��ȡeumSignature���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getEumSignature() {
        return eumSignature;
    }

    /**
     * ����eumSignature���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setEumSignature(SignatureType value) {
        this.eumSignature = value;
    }

    /**
     * ��ȡremainingMemory���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRemainingMemory() {
        return remainingMemory;
    }

    /**
     * ����remainingMemory���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRemainingMemory(BigInteger value) {
        this.remainingMemory = value;
    }

    /**
     * ��ȡavailableMemoryForProfiles���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAvailableMemoryForProfiles() {
        return availableMemoryForProfiles;
    }

    /**
     * ����availableMemoryForProfiles���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAvailableMemoryForProfiles(BigInteger value) {
        this.availableMemoryForProfiles = value;
    }

    /**
     * ��ȡlastAuditDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastAuditDate() {
        return lastAuditDate;
    }

    /**
     * ����lastAuditDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastAuditDate(XMLGregorianCalendar value) {
        this.lastAuditDate = value;
    }

    /**
     * ��ȡsmsrId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSmsrId() {
        return smsrId;
    }

    /**
     * ����smsrId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSmsrId(String value) {
        this.smsrId = value;
    }

    /**
     * Gets the value of the profileInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profileInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfileInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EISType.ProfileInfo }
     * 
     * 
     */
    public List<EISType.ProfileInfo> getProfileInfo() {
        if (profileInfo == null) {
            profileInfo = new ArrayList<EISType.ProfileInfo>();
        }
        return this.profileInfo;
    }

    /**
     * ��ȡisdr���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SecurityDomainType }
     *     
     */
    public SecurityDomainType getIsdr() {
        return isdr;
    }

    /**
     * ����isdr���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityDomainType }
     *     
     */
    public void setIsdr(SecurityDomainType value) {
        this.isdr = value;
    }

    /**
     * ��ȡauditTrail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EISType.AuditTrail }
     *     
     */
    public EISType.AuditTrail getAuditTrail() {
        return auditTrail;
    }

    /**
     * ����auditTrail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EISType.AuditTrail }
     *     
     */
    public void setAuditTrail(EISType.AuditTrail value) {
        this.auditTrail = value;
    }

    /**
     * ��ȡadditionalProperties���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EISType.AdditionalProperties }
     *     
     */
    public EISType.AdditionalProperties getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * ����additionalProperties���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EISType.AdditionalProperties }
     *     
     */
    public void setAdditionalProperties(EISType.AdditionalProperties value) {
        this.additionalProperties = value;
    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="property" type="{http://namespaces.gsma.org/esim-messaging/1}PropertyType" maxOccurs="unbounded"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "property"
    })
    public static class AdditionalProperties {

        @XmlElement(required = true)
        protected List<PropertyType> property;

        /**
         * Gets the value of the property property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the property property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProperty().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PropertyType }
         * 
         * 
         */
        public List<PropertyType> getProperty() {
            if (property == null) {
                property = new ArrayList<PropertyType>();
            }
            return this.property;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="record" type="{http://namespaces.gsma.org/esim-messaging/1}AuditTrailRecordType" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "record"
    })
    public static class AuditTrail {

        protected List<AuditTrailRecordType> record;

        /**
         * Gets the value of the record property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the record property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AuditTrailRecordType }
         * 
         * 
         */
        public List<AuditTrailRecordType> getRecord() {
            if (record == null) {
                record = new ArrayList<AuditTrailRecordType>();
            }
            return this.record;
        }

    }


    /**
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="eid" type="{http://namespaces.gsma.org/esim-messaging/1}EIDType"/&gt;
     *         &lt;element name="eumId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
     *         &lt;element name="productionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
     *         &lt;element name="platformType" type="{http://namespaces.gsma.org/esim-messaging/1}String100"/&gt;
     *         &lt;element name="platformVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
     *         &lt;element name="isdpLoadFileAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
     *         &lt;element name="isdpModuleAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
     *         &lt;element name="ecasd" type="{http://namespaces.gsma.org/esim-messaging/1}SecurityDomainType"/&gt;
     *         &lt;element name="euiccCapabilities"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="catTpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="catTpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
     *                   &lt;element name="httpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="httpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
     *                   &lt;element name="securePacketVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
     *                   &lt;element name="remoteProvisioningVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "eid",
        "eumId",
        "productionDate",
        "platformType",
        "platformVersion",
        "isdpLoadFileAid",
        "isdpModuleAid",
        "ecasd",
        "euiccCapabilities"
    })
    public static class EumSignedInfo {

        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] eid;
        @XmlElement(required = true)
        protected String eumId;
        @XmlElement(required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar productionDate;
        @XmlElement(required = true)
        protected String platformType;
        @XmlElement(required = true)
        protected String platformVersion;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] isdpLoadFileAid;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] isdpModuleAid;
        @XmlElement(required = true)
        protected SecurityDomainType ecasd;
        @XmlElement(required = true)
        protected EISType.EumSignedInfo.EuiccCapabilities euiccCapabilities;

        /**
         * ��ȡeid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getEid() {
            return eid;
        }

        /**
         * ����eid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEid(byte[] value) {
            this.eid = value;
        }

        /**
         * ��ȡeumId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEumId() {
            return eumId;
        }

        /**
         * ����eumId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEumId(String value) {
            this.eumId = value;
        }

        /**
         * ��ȡproductionDate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getProductionDate() {
            return productionDate;
        }

        /**
         * ����productionDate���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setProductionDate(XMLGregorianCalendar value) {
            this.productionDate = value;
        }

        /**
         * ��ȡplatformType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatformType() {
            return platformType;
        }

        /**
         * ����platformType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatformType(String value) {
            this.platformType = value;
        }

        /**
         * ��ȡplatformVersion���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlatformVersion() {
            return platformVersion;
        }

        /**
         * ����platformVersion���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlatformVersion(String value) {
            this.platformVersion = value;
        }

        /**
         * ��ȡisdpLoadFileAid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getIsdpLoadFileAid() {
            return isdpLoadFileAid;
        }

        /**
         * ����isdpLoadFileAid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsdpLoadFileAid(byte[] value) {
            this.isdpLoadFileAid = value;
        }

        /**
         * ��ȡisdpModuleAid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getIsdpModuleAid() {
            return isdpModuleAid;
        }

        /**
         * ����isdpModuleAid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsdpModuleAid(byte[] value) {
            this.isdpModuleAid = value;
        }

        /**
         * ��ȡecasd���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link SecurityDomainType }
         *     
         */
        public SecurityDomainType getEcasd() {
            return ecasd;
        }

        /**
         * ����ecasd���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link SecurityDomainType }
         *     
         */
        public void setEcasd(SecurityDomainType value) {
            this.ecasd = value;
        }

        /**
         * ��ȡeuiccCapabilities���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link EISType.EumSignedInfo.EuiccCapabilities }
         *     
         */
        public EISType.EumSignedInfo.EuiccCapabilities getEuiccCapabilities() {
            return euiccCapabilities;
        }

        /**
         * ����euiccCapabilities���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link EISType.EumSignedInfo.EuiccCapabilities }
         *     
         */
        public void setEuiccCapabilities(EISType.EumSignedInfo.EuiccCapabilities value) {
            this.euiccCapabilities = value;
        }


        /**
         * <p>anonymous complex type�� Java �ࡣ
         * 
         * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="catTpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="catTpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
         *         &lt;element name="httpSupport" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="httpVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion" minOccurs="0"/&gt;
         *         &lt;element name="securePacketVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
         *         &lt;element name="remoteProvisioningVersion" type="{http://namespaces.gsma.org/esim-messaging/1}ThreeDigitVersion"/&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "catTpSupport",
            "catTpVersion",
            "httpSupport",
            "httpVersion",
            "securePacketVersion",
            "remoteProvisioningVersion"
        })
        public static class EuiccCapabilities {

            protected boolean catTpSupport;
            protected String catTpVersion;
            protected boolean httpSupport;
            protected String httpVersion;
            @XmlElement(required = true)
            protected String securePacketVersion;
            @XmlElement(required = true)
            protected String remoteProvisioningVersion;

            /**
             * ��ȡcatTpSupport���Ե�ֵ��
             * 
             */
            public boolean isCatTpSupport() {
                return catTpSupport;
            }

            /**
             * ����catTpSupport���Ե�ֵ��
             * 
             */
            public void setCatTpSupport(boolean value) {
                this.catTpSupport = value;
            }

            /**
             * ��ȡcatTpVersion���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCatTpVersion() {
                return catTpVersion;
            }

            /**
             * ����catTpVersion���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCatTpVersion(String value) {
                this.catTpVersion = value;
            }

            /**
             * ��ȡhttpSupport���Ե�ֵ��
             * 
             */
            public boolean isHttpSupport() {
                return httpSupport;
            }

            /**
             * ����httpSupport���Ե�ֵ��
             * 
             */
            public void setHttpSupport(boolean value) {
                this.httpSupport = value;
            }

            /**
             * ��ȡhttpVersion���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHttpVersion() {
                return httpVersion;
            }

            /**
             * ����httpVersion���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHttpVersion(String value) {
                this.httpVersion = value;
            }

            /**
             * ��ȡsecurePacketVersion���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecurePacketVersion() {
                return securePacketVersion;
            }

            /**
             * ����securePacketVersion���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecurePacketVersion(String value) {
                this.securePacketVersion = value;
            }

            /**
             * ��ȡremoteProvisioningVersion���Ե�ֵ��
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRemoteProvisioningVersion() {
                return remoteProvisioningVersion;
            }

            /**
             * ����remoteProvisioningVersion���Ե�ֵ��
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRemoteProvisioningVersion(String value) {
                this.remoteProvisioningVersion = value;
            }

        }

    }


    /**
     * Type for a Profile in the EIS as the representation a profile loaded on the eUICC
     * 
     * <p>anonymous complex type�� Java �ࡣ
     * 
     * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="iccid" type="{http://namespaces.gsma.org/esim-messaging/1}ICCIDType"/&gt;
     *         &lt;element name="isdpAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
     *         &lt;element name="mnoId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
     *         &lt;element name="fallbackAttribute" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *         &lt;element name="subscriptionAddress" type="{http://namespaces.gsma.org/esim-messaging/1}SubscriptionAddressType"/&gt;
     *         &lt;element name="state" type="{http://namespaces.gsma.org/esim-messaging/1}ProfileStateType"/&gt;
     *         &lt;element name="smdpId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType" minOccurs="0"/&gt;
     *         &lt;element name="profileType" type="{http://namespaces.gsma.org/esim-messaging/1}String100" minOccurs="0"/&gt;
     *         &lt;element name="allocatedMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
     *         &lt;element name="freeMemory" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
     *         &lt;element name="pol2" type="{http://namespaces.gsma.org/esim-messaging/1}POL2Type"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "iccid",
        "isdpAid",
        "mnoId",
        "fallbackAttribute",
        "subscriptionAddress",
        "state",
        "smdpId",
        "profileType",
        "allocatedMemory",
        "freeMemory",
        "pol2"
    })
    public static class ProfileInfo {

        @XmlElement(required = true)
        protected String iccid;
        @XmlElement(required = true, type = String.class)
        @XmlJavaTypeAdapter(HexBinaryAdapter.class)
        @XmlSchemaType(name = "hexBinary")
        protected byte[] isdpAid;
        @XmlElement(required = true)
        protected String mnoId;
        protected boolean fallbackAttribute;
        @XmlElement(required = true)
        protected SubscriptionAddressType subscriptionAddress;
        @XmlElement(required = true)
        @XmlSchemaType(name = "string")
        protected ProfileStateType state;
        protected String smdpId;
        protected String profileType;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger allocatedMemory;
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger freeMemory;
        @XmlElement(required = true)
        protected POL2Type pol2;

        /**
         * ��ȡiccid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIccid() {
            return iccid;
        }

        /**
         * ����iccid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIccid(String value) {
            this.iccid = value;
        }

        /**
         * ��ȡisdpAid���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public byte[] getIsdpAid() {
            return isdpAid;
        }

        /**
         * ����isdpAid���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsdpAid(byte[] value) {
            this.isdpAid = value;
        }

        /**
         * ��ȡmnoId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMnoId() {
            return mnoId;
        }

        /**
         * ����mnoId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMnoId(String value) {
            this.mnoId = value;
        }

        /**
         * ��ȡfallbackAttribute���Ե�ֵ��
         * 
         */
        public boolean isFallbackAttribute() {
            return fallbackAttribute;
        }

        /**
         * ����fallbackAttribute���Ե�ֵ��
         * 
         */
        public void setFallbackAttribute(boolean value) {
            this.fallbackAttribute = value;
        }

        /**
         * ��ȡsubscriptionAddress���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link SubscriptionAddressType }
         *     
         */
        public SubscriptionAddressType getSubscriptionAddress() {
            return subscriptionAddress;
        }

        /**
         * ����subscriptionAddress���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link SubscriptionAddressType }
         *     
         */
        public void setSubscriptionAddress(SubscriptionAddressType value) {
            this.subscriptionAddress = value;
        }

        /**
         * ��ȡstate���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link ProfileStateType }
         *     
         */
        public ProfileStateType getState() {
            return state;
        }

        /**
         * ����state���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileStateType }
         *     
         */
        public void setState(ProfileStateType value) {
            this.state = value;
        }

        /**
         * ��ȡsmdpId���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSmdpId() {
            return smdpId;
        }

        /**
         * ����smdpId���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSmdpId(String value) {
            this.smdpId = value;
        }

        /**
         * ��ȡprofileType���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProfileType() {
            return profileType;
        }

        /**
         * ����profileType���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProfileType(String value) {
            this.profileType = value;
        }

        /**
         * ��ȡallocatedMemory���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAllocatedMemory() {
            return allocatedMemory;
        }

        /**
         * ����allocatedMemory���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAllocatedMemory(BigInteger value) {
            this.allocatedMemory = value;
        }

        /**
         * ��ȡfreeMemory���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getFreeMemory() {
            return freeMemory;
        }

        /**
         * ����freeMemory���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setFreeMemory(BigInteger value) {
            this.freeMemory = value;
        }

        /**
         * ��ȡpol2���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link POL2Type }
         *     
         */
        public POL2Type getPol2() {
            return pol2;
        }

        /**
         * ����pol2���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link POL2Type }
         *     
         */
        public void setPol2(POL2Type value) {
            this.pol2 = value;
        }

    }

}
