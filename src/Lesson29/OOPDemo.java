package Lesson29;

public class OOPDemo {
    static void main() {
        Person person=Person.getInstance("Evgeny Markin",48);
        person.sayHello();

        Person john=Person.getInstance("Ivan");
        john.setAge(33);
        john.sayHello();
    }
}
