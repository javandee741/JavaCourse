package Lesson51;

public class Student {
    private int age;
    private String name;
    private int course;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student() {
    }

    public Student(int age, String name, int course) {
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public void sayHello(){
        System.out.println("My name is " + name + ". I'm " + age + " years old, and I study " + course + " course.");
    }
}
