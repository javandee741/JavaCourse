package Lesson57;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {
    static void main() {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student("Alice",21,4));
        students.add(new Student("Bob",23,3));
        students.add(new Student("Charlie",18,2));
        students.add(new Student("Daniel",20,3));
        students.add(new Student("Emma",16,4));
        students.add(new Student("Frank",20,2));
        students.add(new Student("George",15,3));
        students.add(new Student("Inna",12,3));
        students.add(new Student("Jack",24,1));
        students.add(new Student("Kolin",19,3));
        students.add(new Student("Li",20,3));
        students.add(new Student("Mice",20,3));
        students.add(new Student("Nick",25,3));
        students.add(new Student("Opra",13,5));
        students.add(new Student("Paul",19,3));
        students.add(new Student("Rachel",20,3));
        students.add(new Student("Susane",20,3));
        students.add(new Student("Tanya",21,1));
        students.add(new Student("Uma",25,5));
        students.add(new Student("Victor",20,2));
        students.add(new Student("William",18,3));

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

        List<Student> studentOlder20 = students.stream()
                .filter(student -> student.getAge()>20)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(studentOlder20.getFirst().name);

        List<String> studentNames = students.stream()
                .map(student -> student.getName())
                .toList();

        System.out.println(studentNames);

        List<Student> sortedByName = students.stream()
                .sorted((student1,student2) -> student1.getAge().compareTo(student2.getAge()))
                .filter(student -> student.getCourse()==5)
                .toList();

        System.out.println(sortedByName.getFirst().name);
    }
}

