package Lesson57;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
    static void main() {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Alice",20,4));
        students.add(new Student("Bob",20,3));
        students.add(new Student("Charlie",20,2));
        students.add(new Student("Daniel",20,3));
        students.add(new Student("Emma",20,4));
        students.add(new Student("Frank",20,2));
        students.add(new Student("George",20,3));
        students.add(new Student("Inna",20,3));
        students.add(new Student("Jack",20,1));
        students.add(new Student("Kolin",20,3));
        students.add(new Student("Li",20,3));
        students.add(new Student("Mice",20,3));
        students.add(new Student("Nick",20,3));
        students.add(new Student("Opra",20,5));
        students.add(new Student("Paul",20,3));
        students.add(new Student("Rachel",20,3));
        students.add(new Student("Susane",20,3));
        students.add(new Student("Tanya",20,1));
        students.add(new Student("Uma",20,5));
        students.add(new Student("Victor",20,2));
        students.add(new Student("William",20,3));

        //without streams

        int cnt = 0;
        for (Student student:students)

            if (student.getCourse()==3){
                cnt++;
            }
        System.out.println(cnt);

        //streams
        int cntStudents = Math.toIntExact(students.stream().filter(student -> student.getCourse()==2).count());
        System.out.println(cntStudents);

        students.stream().filter(student -> student.getCourse()==2).forEach(student -> System.out.println(student.getName()));
    }
}

