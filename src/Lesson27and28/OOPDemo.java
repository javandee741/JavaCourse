package Lesson27and28;

import java.text.ParseException;

public class OOPDemo {
    static void main() throws ParseException {
        Person person = new Person();

        person.setName("Evgeny");
        person.setAge(48);

        System.out.println(Person.KIND);

        person.sayHello();

        PersonKotlin newPerson = new PersonKotlin("Evgeny Markin",48);
        System.out.println(newPerson.getName());
    }
}
