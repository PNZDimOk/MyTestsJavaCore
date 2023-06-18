package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Dmitrii");
        list.add("Tatyana");
        list.add("Alex");
        System.out.println("Pered Sort");
        System.out.println(list);
        Collections.sort(list);
        System.out.println("Posle Sort");
        System.out.println(list);
    }
}
