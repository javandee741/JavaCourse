package Lesson57;

public class Student {
    Integer age;
    String name;
    int course;

    public Student() {
    }

    public Student(String name) {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Student(String name, int age, int course) {
        this.age = age;
        this.name = name;
        this.course = course;
    }

    public Integer getAge() {
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

    public static Student getInstance(String name){
        return new Student(name);
    }

    public static Student getInstance(String name, int age){
        return new Student(age, name);
    }

    public static Student getInstance(String name, int age, int course){
        return new Student(name,age,course);
    }
}
