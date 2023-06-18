package Collection.Map;

import java.util.TreeMap;

public class TreeMapEx2 {
    public static void main(String[] args) {
        TreeMap<Student,Double> treeMap = new TreeMap<>();
        Student st1 = new Student("Dmitrii", "Koshelev",5);
        Student st2 = new Student("Tatyana", "Kulyasova",2);
        Student st3 = new Student("Maria", "Ivanova",4);
        Student st4 = new Student("Misha", "Sidorov",3);
        Student st5 = new Student("Oleg", "Kerzhenov",1);
        Student st6 = new Student("Dmitrii", "Koshelev",5);

        treeMap.put(st1,5.8);
        treeMap.put(st2,9.1);
        treeMap.put(st3,5.1);
        treeMap.put(st4,8.3);
        treeMap.put(st5,6.4);
        treeMap.put(st6,7.2);

        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());
//        System.out.println(treeMap.tailMap(7.3));
//        System.out.println(treeMap.headMap(7.3));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
        
        System.out.println(treeMap);

    }
}
