
package org.whl.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://namespaces.gsma.org/esim-messaging/1}BaseResponseType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="eis" type="{http://namespaces.gsma.org/esim-messaging/1}EISType" minOccurs="0"/&gt;
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
    "eis"
})
@XmlRootElement(name = "ES4-AuditEISResponse")
public class ES4AuditEISResponse
    extends BaseResponseType
{

    protected EISType eis;

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

}
