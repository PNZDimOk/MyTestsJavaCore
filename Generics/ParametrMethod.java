package Generics;

import java.util.ArrayList;
import java.util.List;

public class ParametrMethod {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(10);
        arrayList1.add(50);
        arrayList1.add(40);
        arrayList1.add(57);
        arrayList1.add(1060);

        int a = GenMethod.getSecondElement(arrayList1);
        System.out.println(a);

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Hello1");
        arrayList2.add("Hello2");
        arrayList2.add("asdad");
        arrayList2.add("222asdasdas");
        arrayList2.add("zxczxc");

        String s = GenMethod.getSecondElement(arrayList2);
        System.out.println(s);

    }
}

class GenMethod{
    public static <T> T getSecondElement (ArrayList<T> a1){
        return a1.get(1);
    }
}