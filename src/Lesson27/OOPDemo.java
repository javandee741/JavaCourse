package Lesson27;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OOPDemo {
    static void main() throws ParseException {
        Person person = new Person();

        person.setName("Evgeny");
        person.setAge(48);

        person.sayHello();

        PersonKotlin newPerson = new PersonKotlin("Evgeny Markin",48);
        System.out.println(newPerson.getName());
    }
}
