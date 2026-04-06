package Lesson25and26;

public class OOPDemo {
    static void main() {
        Person myName = new Person();

        myName.name = "Evgeny";
        myName.age = 48;

        myName.sayHello();

        Person constructorName = new Person();
        constructorName.sayHello();

        PersonKotlin personKotlin = new PersonKotlin();
        personKotlin.setName("Evgeny Markin");
        personKotlin.setAge(48);

        personKotlin.sayHello();

    }
}
