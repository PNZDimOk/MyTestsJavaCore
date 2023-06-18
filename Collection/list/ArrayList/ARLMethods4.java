package Collection.list.ArrayList;

import java.util.Arrays;
import java.util.List;

public class ARLMethods4 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");
        StringBuilder sb5 = new StringBuilder("E");
        StringBuilder sb6 = new StringBuilder("F");

        StringBuilder [] array = {sb1,sb2,sb3,sb4,sb5,sb6};
        List<StringBuilder> stringBuilderList = Arrays.asList(array);
        array[0].append("post");
        System.out.println(stringBuilderList );

    }
}
