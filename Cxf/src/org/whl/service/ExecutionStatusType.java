
package org.whl.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates whether the execution of a processing has been completed correctly or not and provides information to give details on the processing result (status code, status data, status message)
 * 
 * <p>ExecutionStatusType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ExecutionStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="status" type="{http://namespaces.gsma.org/esim-messaging/1}StatusType"/&gt;
 *         &lt;element name="statusCodeData" type="{http://namespaces.gsma.org/esim-messaging/1}StatusCodeDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExecutionStatusType", propOrder = {
    "status",
    "statusCodeData"
})
public class ExecutionStatusType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected StatusType status;
    protected StatusCodeDataType statusCodeData;

    /**
     * ��ȡstatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StatusType }
     *     
     */
    public StatusType getStatus() {
        return status;
    }

    /**
     * ����status���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StatusType }
     *     
     */
    public void setStatus(StatusType value) {
        this.status = value;
    }

    /**
     * ��ȡstatusCodeData���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeDataType }
     *     
     */
    public StatusCodeDataType getStatusCodeData() {
        return statusCodeData;
    }

    /**
     * ����statusCodeData���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeDataType }
     *     
     */
    public void setStatusCodeData(StatusCodeDataType value) {
        this.statusCodeData = value;
    }

}
