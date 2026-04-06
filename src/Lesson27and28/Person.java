package Lesson27and28;

public class Person {
    private String name;
    private int age;

    public static String KIND = "Human";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void sayHello(){
        System.out.println("Hello my name is " + name + " my age is " + age + ".");
    }
}
