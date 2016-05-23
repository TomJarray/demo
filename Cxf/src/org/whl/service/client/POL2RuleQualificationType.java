
package org.whl.service.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>POL2RuleQualificationType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="POL2RuleQualificationType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Not-Allowed"/&gt;
 *     &lt;enumeration value="Auto-Delete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "POL2RuleQualificationType")
@XmlEnum
public enum POL2RuleQualificationType {

    @XmlEnumValue("Not-Allowed")
    NOT_ALLOWED("Not-Allowed"),
    @XmlEnumValue("Auto-Delete")
    AUTO_DELETE("Auto-Delete");
    private final String value;

    POL2RuleQualificationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static POL2RuleQualificationType fromValue(String v) {
        for (POL2RuleQualificationType c: POL2RuleQualificationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
