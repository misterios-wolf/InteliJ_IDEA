package jaxbexample;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class jaxbReader {
    public static void main(String[] args) throws JAXBException {
        var file = new File("/Users/flame/IdeaProjects/testtest/file.xml");
        var context = JAXBContext.newInstance(Customer.class);

        var unmarshaller = context.createUnmarshaller();
        var customer = unmarshaller.unmarshal(file);
        //System.out.println(customer.id);
        //System.out.println(customer.name);
        //System.out.println(customer.age);
    }
}
