package JAXBexample2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class jaxbReader2 {

    public static void main(String[] args) {
        String fileurl = "/Users/flame/InteliJ_IDEA/testtest/Emplyee.xml";
        File file = new File(fileurl);

        try {
            JAXBContext context = JAXBContext.newInstance(Emplyee.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Emplyee emplyee = (Emplyee)unmarshaller.unmarshal(file);
            System.out.println(emplyee.getName());
            System.out.println(emplyee.getNumber());
            System.out.println(emplyee.getAge());
            System.out.println(emplyee.getCity());
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
