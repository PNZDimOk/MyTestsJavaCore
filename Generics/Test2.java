package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        List<Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(3.15);
        list1.add(3.123);
        list1.add(3.0007);
        showList(list1);

        List<String> stringList = new ArrayList<>();
        stringList.add("123"); stringList.add("dsdsds");
        stringList.add("xx1");  stringList.add("ewe2");
        showList(stringList);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(4);  integerArrayList.add(1);  integerArrayList.add(5);  integerArrayList.add(2);
        System.out.println(summArrList(integerArrayList));

        ArrayList<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(1.25);  doubleArrayList.add(2.75); doubleArrayList.add(3.5); doubleArrayList.add(5.5);
        System.out.println(summArrList(doubleArrayList));

    }
    static void showList(List<?> list){
        System.out.println("Eleventi lista "+list);
    }

    static double summArrList(ArrayList<? extends Number> al){
        double summ = 0;
        for (Number n: al) {
            summ+=n.doubleValue();
        }
        return summ;
    }
}
