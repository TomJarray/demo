package org.whl.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Java2XML {

    /**
     * @param args
     * @throws JAXBException
     */
    public static void main(String[] args) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(People.class);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "gb2312");// �����ʽ
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);// �Ƿ��ʽ�����ɵ�xml��
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);// �Ƿ�ʡ��xmlͷ��Ϣ��<?xml version="1.0"
                                                                // encoding="gb2312"
                                                                // standalone="yes"?>��

        People people = new People();
        marshaller.marshal(people, System.out);
    }
}
