
package org.whl.service.client;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This Type provides the description of a Security Domain.
 * 
 * <p>SecurityDomainType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SecurityDomainType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="aid" type="{http://namespaces.gsma.org/esim-messaging/1}AIDType"/&gt;
 *         &lt;element name="tar" type="{http://namespaces.gsma.org/esim-messaging/1}TARType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="sin" type="{http://namespaces.gsma.org/esim-messaging/1}hexBinary16"/&gt;
 *         &lt;element name="sdin" type="{http://namespaces.gsma.org/esim-messaging/1}hexBinary16"/&gt;
 *         &lt;element name="role" type="{http://namespaces.gsma.org/esim-messaging/1}SDRoleType"/&gt;
 *         &lt;element name="keyset" maxOccurs="127"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="version" type="{http://namespaces.gsma.org/esim-messaging/1}KeysetVersionType"/&gt;
 *                   &lt;element name="type" type="{http://namespaces.gsma.org/esim-messaging/1}KeysetUsageType" minOccurs="0"/&gt;
 *                   &lt;element name="cntr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *                   &lt;choice maxOccurs="128"&gt;
 *                     &lt;element name="key" type="{http://namespaces.gsma.org/esim-messaging/1}KeyType"/&gt;
 *                     &lt;element name="certificate" type="{http://namespaces.gsma.org/esim-messaging/1}GPCertificateType"/&gt;
 *                   &lt;/choice&gt;
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
@XmlType(name = "SecurityDomainType", propOrder = {
    "aid",
    "tar",
    "sin",
    "sdin",
    "role",
    "keyset"
})
public class SecurityDomainType {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] aid;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected List<byte[]> tar;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] sin;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(HexBinaryAdapter.class)
    @XmlSchemaType(name = "hexBinary")
    protected byte[] sdin;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected SDRoleType role;
    @XmlElement(required = true)
    protected List<SecurityDomainType.Keyset> keyset;

    /**
     * ��ȡaid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getAid() {
        return aid;
    }

    /**
     * ����aid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAid(byte[] value) {
        this.aid = value;
    }

    /**
     * Gets the value of the tar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<byte[]> getTar() {
        if (tar == null) {
            tar = new ArrayList<byte[]>();
        }
        return this.tar;
    }

    /**
     * ��ȡsin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSin() {
        return sin;
    }

    /**
     * ����sin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSin(byte[] value) {
        this.sin = value;
    }

    /**
     * ��ȡsdin���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public byte[] getSdin() {
        return sdin;
    }

    /**
     * ����sdin���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSdin(byte[] value) {
        this.sdin = value;
    }

    /**
     * ��ȡrole���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SDRoleType }
     *     
     */
    public SDRoleType getRole() {
        return role;
    }

    /**
     * ����role���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SDRoleType }
     *     
     */
    public void setRole(SDRoleType value) {
        this.role = value;
    }

    /**
     * Gets the value of the keyset property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyset property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyset().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityDomainType.Keyset }
     * 
     * 
     */
    public List<SecurityDomainType.Keyset> getKeyset() {
        if (keyset == null) {
            keyset = new ArrayList<SecurityDomainType.Keyset>();
        }
        return this.keyset;
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
     *         &lt;element name="version" type="{http://namespaces.gsma.org/esim-messaging/1}KeysetVersionType"/&gt;
     *         &lt;element name="type" type="{http://namespaces.gsma.org/esim-messaging/1}KeysetUsageType" minOccurs="0"/&gt;
     *         &lt;element name="cntr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
     *         &lt;choice maxOccurs="128"&gt;
     *           &lt;element name="key" type="{http://namespaces.gsma.org/esim-messaging/1}KeyType"/&gt;
     *           &lt;element name="certificate" type="{http://namespaces.gsma.org/esim-messaging/1}GPCertificateType"/&gt;
     *         &lt;/choice&gt;
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
        "version",
        "type",
        "cntr",
        "keyOrCertificate"
    })
    public static class Keyset {

        @XmlSchemaType(name = "integer")
        protected int version;
        @XmlSchemaType(name = "string")
        protected KeysetUsageType type;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger cntr;
        @XmlElements({
            @XmlElement(name = "key", type = KeyType.class),
            @XmlElement(name = "certificate", type = GPCertificateType.class)
        })
        protected List<Object> keyOrCertificate;

        /**
         * ��ȡversion���Ե�ֵ��
         * 
         */
        public int getVersion() {
            return version;
        }

        /**
         * ����version���Ե�ֵ��
         * 
         */
        public void setVersion(int value) {
            this.version = value;
        }

        /**
         * ��ȡtype���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link KeysetUsageType }
         *     
         */
        public KeysetUsageType getType() {
            return type;
        }

        /**
         * ����type���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link KeysetUsageType }
         *     
         */
        public void setType(KeysetUsageType value) {
            this.type = value;
        }

        /**
         * ��ȡcntr���Ե�ֵ��
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getCntr() {
            return cntr;
        }

        /**
         * ����cntr���Ե�ֵ��
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setCntr(BigInteger value) {
            this.cntr = value;
        }

        /**
         * Gets the value of the keyOrCertificate property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyOrCertificate property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyOrCertificate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KeyType }
         * {@link GPCertificateType }
         * 
         * 
         */
        public List<Object> getKeyOrCertificate() {
            if (keyOrCertificate == null) {
                keyOrCertificate = new ArrayList<Object>();
            }
            return this.keyOrCertificate;
        }

    }

}
