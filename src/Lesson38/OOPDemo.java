package Lesson38;

public class OOPDemo {
    static void main() {

        //with classes which implements Greeteng interface
        Greeteng englishGreeteng=new EnglishGreeteng();
        englishGreeteng.sayHello();

        Greeteng frenchGreeteng=new FrenchGreeteng();
        frenchGreeteng.sayHello();

        //with lambda
        Greeteng englishGreetengLambda=() -> {
            System.out.println("Hello Lambda");
        };
        englishGreetengLambda.sayHello();

        GreetingKotlin frenchGreetengLambda=() ->{
            System.out.println("Bonjour Lambda");
            return "";
        };
        frenchGreetengLambda.sayHello();
    }
}
