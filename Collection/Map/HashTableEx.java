package Collection.Map;

import java.util.Hashtable;

public class HashTableEx {
    public static void main(String[] args) {
        Hashtable<Double, Student> hashtable = new Hashtable<>();
        Student st1 = new Student("Dmitrii", "Koshelev",5);
        Student st2 = new Student("Tatyana", "Kulyasova",2);
        Student st3 = new Student("Maria", "Ivanova",4);
        Student st4 = new Student("Misha", "Sidorov",3);
        Student st5 = new Student("Oleg", "Kerzhenov",1);
        Student st6 = new Student("Dmitrii", "Koshelev",5);

        hashtable.put(7.8, st1);
        hashtable.put(7.3, st2);
        hashtable.put(5.8, st3);
        hashtable.put(9.2, st4);
        hashtable.put(7.1, st5);
        hashtable.put(6.4, st6);

        System.out.println(hashtable);
    }
}
