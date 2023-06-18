package Collection.list;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExmpl {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dmitrii");
        list1.add("Ivan");
        list1.add("Maria");

        Iterator<String> stringIterator = list1.iterator();
        while (stringIterator.hasNext()){
            System.out.println(stringIterator.next());
            stringIterator.remove();
        }
        System.out.println(list1.isEmpty() +" "+list1);
    }
}
