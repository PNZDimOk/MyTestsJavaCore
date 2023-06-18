package Collection.list.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ARLMethods5 {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Dmitrii");
        list1.add("Ivan");
        list1.add("Maria");
        list1.add(0, "Vasya");
        System.out.println("list1     "+list1);

        List<Integer> listInt = List.of(3,8,13);
        System.out.println(listInt);

        List<String> stringList = List.copyOf(list1);
        System.out.println(stringList);



//        Object[] arrayO = list1.toArray();
//        System.out.println(arrayO);
//        for (Object s:
//                arrayO) {
//            System.out.println(s);
//
//        }
//
//        String[] arrayS = list1.toArray(new String[0]);
//        for (String s:
//             arrayS) {
//            System.out.println(s);
//
//        }





//        List<String> myList = list1.subList(1,4); //не отдельная сущность просто его представление view
//        System.out.println("myList    "+myList);
//        myList.add("Fedor");
//        System.out.println("l1 posle dobavl    "+list1);
//        System.out.println("myList posle dob   " + myList);



//        ArrayList<String> list2 = new ArrayList<>();
//        list2.add("Dmitrii2");
//        list2.add("Ivan2");
//        list2.add("Maria");
//
////        list1.removeAll(list2);
////        list1.retainAll(list2);
//        boolean bol=list1.containsAll(list2);
//        System.out.println(bol);
//        System.out.println(list1);



    }
}
