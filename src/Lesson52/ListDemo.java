package Lesson52;

import java.util.*;

public class ListDemo {
    static void main() {
        String[] strings = {"Evgeny","John","Vladimir"};
        for(String name:strings){
            System.out.println(name);
        }

        System.out.println("--------------------------------");

        List<String> list = new ArrayList<>();
        list.add("Evgeny");
        list.add("John");
        list.add("Vladimir");
        list.add("Suzane");
        for (String name:list){
            System.out.println(name);
        }

        System.out.println("--------------------------------");

        System.out.println(list.get(3));
        System.out.println(list.size());
        list.set(2,"Ivan");
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);

        System.out.println("--------------------------------");

        Set<String> stringSet = new HashSet<>();
        stringSet.add("Ivan");
        stringSet.add("Ivan");
        stringSet.add("John");
        System.out.println(stringSet);

        System.out.println("--------------------------------");

        Map<String, Integer> map = new HashMap<>();
        map.put("John", 24);
        map.put("Ivan",33);
        map.put("Evgeny",48);

        System.out.println(map.get("John"));
        System.out.println(map);
    }
}
