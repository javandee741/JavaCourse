package Lesson25and26;

public class Person {
    public String name;
    public int age;

    public Person(){
        name="-";
        age=0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello(){
        System.out.println("Hello my name is " + name + " my age is " + age + ".");

    }
}
