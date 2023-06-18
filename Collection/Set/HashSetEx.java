package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Dmitrii");
        set.add("Oleg");
        set.add("Maria");
        set.add("Igor");
        set.add(null);
        set.remove(null);

        System.out.println(set);
        set.add("Maria");
        for (String s: set){
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.contains("Oleg"));





    }
}
