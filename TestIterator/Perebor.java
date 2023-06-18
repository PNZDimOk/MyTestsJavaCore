package TestIterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Perebor {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<> ();
        for (int i = 0; i < 10; i++) {
            array.add(i);
        }

        Iterator<Integer> integerIterator = array.iterator();
        int x;
        while (integerIterator.hasNext()) {
            x = integerIterator.next();
            System.out.println(x);
        }
    }
}
