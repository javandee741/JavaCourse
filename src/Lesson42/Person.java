package Lesson42;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person>{
    private int age;
    private String name;

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

    public void sayHello(){
        System.out.println("My name is " + name + ", and age is " + age +".");
    }

    @Override
    public int compareTo(@NotNull Person o) {
        if (this.getAge() > o.getAge()){
            return 1;
        } else if (this.getAge() < o.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
