package Lesson33;

public class Student extends Person{
    String course;

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Student(){}

    public Student(String name){ super(name);}

    public Student(String name, int age){ super(name,age); }

    @Override
    public void sayHello(){
        System.out.println("Hello my name is " + getName() + " . And I'm student.");
    }
}
