package Collection.Map;

import java.util.TreeMap;

public class TreeMapEx1 {
    public static void main(String[] args) {
        TreeMap<Double,Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Dmitrii", "Koshelev",5);
        Student st2 = new Student("Tatyana", "Kulyasova",2);
        Student st3 = new Student("Maria", "Ivanova",4);
        Student st4 = new Student("Misha", "Sidorov",3);
        Student st5 = new Student("Oleg", "Kerzhenov",1);
        Student st6 = new Student("Dmitrii", "Koshelev",5);

        treeMap.put(5.8,st1);
        treeMap.put(9.1,st2);
        treeMap.put(5.1,st3);
        treeMap.put(8.3,st4);
        treeMap.put(6.4,st5);
        treeMap.put(7.2,st6);

        System.out.println(treeMap);
        System.out.println(treeMap.descendingMap());
        System.out.println(treeMap.tailMap(7.3));
        System.out.println(treeMap.headMap(7.3));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());

        System.out.println(treeMap);

    }
}
