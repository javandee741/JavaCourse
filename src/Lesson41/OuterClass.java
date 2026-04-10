package Lesson41;

public class OuterClass {
    private int outerField;

    public void outerMethod(){
        System.out.println("Outer method");
    }

    public class InnerClass{
        private int innerField;

        public void innerMethod(){
            outerField=12;
            System.out.println("Inner method, outerField = " + outerField);
        }
    }
}
