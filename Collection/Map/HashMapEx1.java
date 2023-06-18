package Collection.Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(1000,"Dmitrii Koshelev");
        map1.put(1009,"Tatyana Kulyasova");
        map1.put(3729,"Maria Ivanova");
        map1.put(9800,"Ivan Sidorov");
        map1.putIfAbsent(1000,"Dadid kage");

        System.out.println(map1);
        System.out.println(map1.get(1009));
        map1.remove(9800);
        System.out.println(map1);
        System.out.println(map1.containsValue("Maria Ivanova"));
        System.out.println(map1.containsKey(3729));
        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
