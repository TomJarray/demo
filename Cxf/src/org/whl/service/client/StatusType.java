
package org.whl.service.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>StatusType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="StatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EXECUTED_SUCCESS"/&gt;
 *     &lt;enumeration value="EXECUTED_WITHWARNING"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *     &lt;enumeration value="EXPIRED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatusType")
@XmlEnum
public enum StatusType {

    EXECUTED_SUCCESS,
    EXECUTED_WITHWARNING,
    FAILED,
    EXPIRED;

    public String value() {
        return name();
    }

    public static StatusType fromValue(String v) {
        return valueOf(v);
    }

}
