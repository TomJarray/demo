
package org.whl.service.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://namespaces.gsma.org/esim-messaging/1}BaseNotificationType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eis" type="{http://namespaces.gsma.org/esim-messaging/1}EISType"/&gt;
 *         &lt;element name="completionTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "eis",
    "completionTimestamp"
})
@XmlRootElement(name = "ES4-HandleSMSRChangeNotification")
public class ES4HandleSMSRChangeNotification
    extends BaseNotificationType
{

    @XmlElement(required = true)
    protected EISType eis;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar completionTimestamp;

    /**
     * ��ȡeis���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link EISType }
     *     
     */
    public EISType getEis() {
        return eis;
    }

    /**
     * ����eis���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link EISType }
     *     
     */
    public void setEis(EISType value) {
        this.eis = value;
    }

    /**
     * ��ȡcompletionTimestamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompletionTimestamp() {
        return completionTimestamp;
    }

    /**
     * ����completionTimestamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompletionTimestamp(XMLGregorianCalendar value) {
        this.completionTimestamp = value;
    }

}
