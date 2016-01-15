
package org.whl.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This type contains the description of a platform or profile management operations performed by SM-SR or a notification received by SM-SR from the given eUICC.
 * 
 * <p>AuditTrailRecordType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="AuditTrailRecordType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eid" type="{http://namespaces.gsma.org/esim-messaging/1}EIDType"/&gt;
 *         &lt;element name="smsrId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType"/&gt;
 *         &lt;element name="operationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="operationType"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}hexBinary"&gt;
 *               &lt;length value="2"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="requesterId" type="{http://namespaces.gsma.org/esim-messaging/1}ObjectIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="operationExecutionStatus" type="{http://namespaces.gsma.org/esim-messaging/1}ExecutionStatusType" minOccurs="0"/&gt;
 *         &lt;element name="isdpAid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType" minOccurs="0"/&gt;
 *         &lt;element name="iccid" type="{http://namespaces.gsma.org/esim-messaging/1}ICCIDType" minOccurs="0"/&gt;
 *         &lt;element name="imei" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *         &lt;element name="meId" type="{http://www.w3.org/2001/XMLSchema}hexBinary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuditTrailRecordType", propOrder = {
    "eid",
    "smsrId",
    "operationDate",
    "operationType",
    "requesterId",
    "operationExecutionStatus",
    "isdpAid",
    "iccid",
    "imei",
    "meId"
})
public class AuditTrailRecordType {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] eid;
    @XmlElement(required = true)
    protected String smsrId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar operationDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    protected byte[] operationType;
    protected String requesterId;
    protected ExecutionStatusType operationExecutionStatus;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] isdpAid;
    protected String iccid;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] imei;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] meId;

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
     * ��ȡoperationDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperationDate() {
        return operationDate;
    }

    /**
     * ����operationDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperationDate(XMLGregorianCalendar value) {
        this.operationDate = value;
    }

    /**
     * ��ȡoperationType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getOperationType() {
        return operationType;
    }

    /**
     * ����operationType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperationType(byte[] value) {
        this.operationType = value;
    }

    /**
     * ��ȡrequesterId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequesterId() {
        return requesterId;
    }

    /**
     * ����requesterId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequesterId(String value) {
        this.requesterId = value;
    }

    /**
     * ��ȡoperationExecutionStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ExecutionStatusType }
     *     
     */
    public ExecutionStatusType getOperationExecutionStatus() {
        return operationExecutionStatus;
    }

    /**
     * ����operationExecutionStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutionStatusType }
     *     
     */
    public void setOperationExecutionStatus(ExecutionStatusType value) {
        this.operationExecutionStatus = value;
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
     * ��ȡimei���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getImei() {
        return imei;
    }

    /**
     * ����imei���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImei(byte[] value) {
        this.imei = value;
    }

    /**
     * ��ȡmeId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getMeId() {
        return meId;
    }

    /**
     * ����meId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeId(byte[] value) {
        this.meId = value;
    }

}
