package Collection.list.ArrayList;

import java.util.ArrayList;

public class ARLMethods {
        public static void main(String[] args) {
            ArrayList<String> list1 = new ArrayList<>();
            list1.add("Dmitrii");
            list1.add("Ivan");
            list1.add("Maria");
            list1.add(0, "Vasya");
            System.out.println(list1);

            ArrayList<String> copy_list = new ArrayList<>(list1);
            System.out.println(copy_list);
            for ( String s: list1) {
                System.out.print(s+"  ");
            }
            System.out.println();

            System.out.println(list1.get(2));

            for (int i = 0; i < list1.size(); i++) {
                System.out.println(list1.get(i));
            }

            list1.set(2,"Igor");
            System.out.println(list1);

    }
}


