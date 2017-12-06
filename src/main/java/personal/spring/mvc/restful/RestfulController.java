package personal.spring.mvc.restful;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class RestfulController {

    @RequestMapping(value = "person/json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person getJsonPerson(){
        Person person = new Person();
        person.setFirstName("Ethan");
        person.setLastName("Cheng");
        Address address = new Address();
        address.setCity("Toronto");
        address.setStreet("Younge");
        person.setAddress(address);
        return person;
    }

    @RequestMapping(value = "person/xml", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public Person getXmlPerson(){
        Person person = new Person();
        person.setFirstName("Ethan");
        person.setLastName("Cheng");
        Address address = new Address();
        address.setCity("Toronto");
        address.setStreet("Younge");
        person.setAddress(address);
        return person;
    }

}
