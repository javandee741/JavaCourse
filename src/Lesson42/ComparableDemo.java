package Lesson42;

public class ComparableDemo {
    static void main() {
        Integer a = 12;
        Integer b =16;
        Integer c =12;

        System.out.println(a.compareTo(b));
        System.out.println(b.compareTo(c));
        System.out.println(a.compareTo(c));

        Person person1 = new Person();
        person1.setName("Evgeny");
        person1.setAge(48);

        Person person2 = new Person();
        person2.setName("John");
        person2.setAge(33);

        System.out.println(person1.compareTo(person2));
    }
}
