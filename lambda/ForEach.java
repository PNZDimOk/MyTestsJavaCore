package lambda;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> list = List.of("Privet", "kak dela","poka");
        for (String s: list){
            System.out.println(s);
        }
        System.out.println("-----------------");
        list.forEach(str-> System.out.println(str));
        System.out.println("//////////////////");
        System.out.println("//////////////////");
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        integers.add(5);
        integers.forEach(n-> {System.out.println(n);
                        n*=2;
                        System.out.println(n);});
    }
}
