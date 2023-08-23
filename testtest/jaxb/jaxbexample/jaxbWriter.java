package jaxbexample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;

public class jaxbWriter {
    public static void main(String[] args) throws JAXBException {
        var customer = new Customer();
        customer.setId(1);
        customer.setName("Max");
        customer.setAge(25);
        var file = new File( "/Users/flame/IdeaProjects/testtest/file.xml");
        var context = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = context.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);

        marshaller.marshal(customer, file);
        marshaller.marshal(customer, System.out);

    }
}
