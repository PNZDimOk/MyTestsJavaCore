package Generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
//        list.add("ok");
//        list.add(123);
//        list.add(new StringBuilder("asdasdasd"));
//        list.add(new Car());
    list.add("Privet");
    list.add("Poka");
    list.add("tri");
    list.add("chetire");

    for (Object o :list){
        System.out.println(o+" dlina:"+((String)o).length());
    }
    }
}

class  Car{}
