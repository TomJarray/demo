
package org.whl.service.client;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ECCKeyLengthType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="ECCKeyLengthType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ECC-256"/&gt;
 *     &lt;enumeration value="ECC-384"/&gt;
 *     &lt;enumeration value="ECC-512"/&gt;
 *     &lt;enumeration value="ECC-521"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ECCKeyLengthType")
@XmlEnum
public enum ECCKeyLengthType {

    @XmlEnumValue("ECC-256")
    ECC_256("ECC-256"),
    @XmlEnumValue("ECC-384")
    ECC_384("ECC-384"),
    @XmlEnumValue("ECC-512")
    ECC_512("ECC-512"),
    @XmlEnumValue("ECC-521")
    ECC_521("ECC-521");
    private final String value;

    ECCKeyLengthType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ECCKeyLengthType fromValue(String v) {
        for (ECCKeyLengthType c: ECCKeyLengthType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
