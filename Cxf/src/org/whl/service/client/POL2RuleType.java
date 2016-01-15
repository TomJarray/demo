
package org.whl.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines the POL2 rule for a Profile
 * 
 * <p>POL2RuleType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="POL2RuleType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subject" type="{http://namespaces.gsma.org/esim-messaging/1}POL2RuleSubjectType"/&gt;
 *         &lt;element name="action" type="{http://namespaces.gsma.org/esim-messaging/1}POL2RuleActionType"/&gt;
 *         &lt;element name="qualification" type="{http://namespaces.gsma.org/esim-messaging/1}POL2RuleQualificationType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "POL2RuleType", propOrder = {
    "subject",
    "action",
    "qualification"
})
public class POL2RuleType {

    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected POL2RuleSubjectType subject;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected POL2RuleActionType action;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected POL2RuleQualificationType qualification;

    /**
     * ��ȡsubject���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link POL2RuleSubjectType }
     *     
     */
    public POL2RuleSubjectType getSubject() {
        return subject;
    }

    /**
     * ����subject���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link POL2RuleSubjectType }
     *     
     */
    public void setSubject(POL2RuleSubjectType value) {
        this.subject = value;
    }

    /**
     * ��ȡaction���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link POL2RuleActionType }
     *     
     */
    public POL2RuleActionType getAction() {
        return action;
    }

    /**
     * ����action���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link POL2RuleActionType }
     *     
     */
    public void setAction(POL2RuleActionType value) {
        this.action = value;
    }

    /**
     * ��ȡqualification���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link POL2RuleQualificationType }
     *     
     */
    public POL2RuleQualificationType getQualification() {
        return qualification;
    }

    /**
     * ����qualification���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link POL2RuleQualificationType }
     *     
     */
    public void setQualification(POL2RuleQualificationType value) {
        this.qualification = value;
    }

}
