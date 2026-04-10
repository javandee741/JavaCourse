package Lesson41;

public class InnerDemo {
    static void main() {
        var outerClass=new OuterClass();
        outerClass.outerMethod();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.innerMethod();
    }
}
