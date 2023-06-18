package Collection.list.ArrayList;

import java.util.ArrayList;

public class ARLMethods3 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dmitrii");
        list1.add("Ivan");
        list1.add("Maria");
        list1.add(0, "Vasya");
        System.out.println(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");
        list2.add("###");
        list1.addAll(1, list2);
//        list1.clear();
        System.out.println(list1);
        System.out.println(list1.indexOf("!!!"));
        System.out.println(list1.contains(list1));
    }
}
