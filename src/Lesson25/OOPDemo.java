package Lesson25;

public class OOPDemo {
    static void main() {
        Person myName = new Person();

        myName.name = "Evgeny";
        myName.age = 48;

        myName.sayHello();

        PersonKotlin personKotlin = new PersonKotlin();
        personKotlin.setName("Evgeny Markin");
        personKotlin.setAge(48);

        personKotlin.sayHello();

    }
}
