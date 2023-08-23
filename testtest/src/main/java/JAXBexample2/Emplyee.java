package JAXBexample2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class Emplyee {
    private String name;
    private int number;
    private int age;
    private String mail;
    private String city;

    @XmlElement
    public void SetName(String name) {this.name = name; }
    @XmlElement
    public void setName(int number) { this.number = number; }
    @XmlElement
    public void setAge(int age) { this.age = age; }
    @XmlElement
    public void setCity(String city) { this.city = city; }

    public String getName() { return name; }
    public int getNumber() { return number; }
    public int getAge() { return age; }
    public String getCity() {return city; }


}
