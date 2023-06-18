package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class TestMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("bye");
        list.add("Ok");
        list.add("Java");

        List<Integer> list2 = list.stream().map(s->s.length())
                .collect(Collectors.toList());
        System.out.println(list2);

        int[] array = {5,8,3,1,9};
        array = Arrays.stream(array).map(el -> { if(el%3==0)
                                            {
                                                el=el/3;
                                            } return el;
                                            }).toArray();
        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();
        set.add("Hello");
        set.add("bye");
        set.add("Ok");
        set.add("Java");

        Set<Integer>set2 = set.stream().map(e->e.length()).collect(Collectors.toSet());
        System.out.println(set2);

    }
}
