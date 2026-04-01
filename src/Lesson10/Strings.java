package Lesson10;

public class Strings {
    static void main() {
        String strName = "Evgeny";
        String strLastName = new String("Markin");

        System.out.println(strName + " " + strLastName);

        //equals
        System.out.println(strName.equals(strLastName));

        //Substrings
        String greeting = "Hello world!";
        String substring = greeting.substring(greeting.indexOf('w'),greeting.indexOf('!'));
        System.out.println(substring);

        //toUpper
        System.out.println(greeting.toUpperCase());

        //toLower
        System.out.println(greeting.toLowerCase());

        //trim
        System.out.println(greeting.trim());

        //replace
        System.out.println(greeting.replace('!','?'));

        //String builder
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" Evgeny");
        System.out.println(sb);



    }
}
