package Collection.list.ArrayList;

import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dmitrii");
        list1.add("Ivan");
        list1.add("Maria");
        System.out.println(list1);

        ArrayList<String> copy_list = new ArrayList<>(list1);
        System.out.println(copy_list);

    }
}
