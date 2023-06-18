package Collection.list;

import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Dmitrii");
        vector.add("Oleg");
        vector.add("Katya");
        vector.add("Misha");
        System.out.println(vector);
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        System.out.println(vector.remove(2));
        System.out.println(vector);
    }
}
