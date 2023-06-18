package Collection.Set;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(8); lhs.add(10); lhs.add(2); lhs.add(3); lhs.add(27);

        System.out.println(lhs);
    }
}
