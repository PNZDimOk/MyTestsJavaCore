package Collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapEx {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> linkedHashMap = new LinkedHashMap(16,0.75f, true);
        Student st1 = new Student("Dmitrii", "Koshelev",5);
        Student st2 = new Student("Tatyana", "Kulyasova",2);
        Student st3 = new Student("Maria", "Ivanova",4);
        Student st4 = new Student("Misha", "Sidorov",3);

        linkedHashMap.put(4.2,st1);
        linkedHashMap.put(3.7,st2);
        linkedHashMap.put(4.8,st3);
        linkedHashMap.put(3.9,st4);

        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.get(3.7));
        System.out.println(linkedHashMap.get(4.2));
        System.out.println(linkedHashMap);
    }
}
