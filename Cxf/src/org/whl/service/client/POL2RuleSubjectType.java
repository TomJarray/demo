
package org.whl.service.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>POL2RuleSubjectType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="POL2RuleSubjectType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="PROFILE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "POL2RuleSubjectType")
@XmlEnum
public enum POL2RuleSubjectType {

    PROFILE;

    public String value() {
        return name();
    }

    public static POL2RuleSubjectType fromValue(String v) {
        return valueOf(v);
    }

}
