package Lesson51;

public class CustomExceptionDemo {
    static void main() throws StudentException{

        try {
            var student1 = new Student(48,"John",-3);
            if (student1.getCourse()<1){
                throw new StudentException("Course must be greater or equal 1");
            } else {
                student1.sayHello();
            }
        } catch (StudentException exception){
            System.out.println(exception);
        }


    }
}
