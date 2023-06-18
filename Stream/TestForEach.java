package Stream;

import java.util.Arrays;

public class TestForEach {
    public static void main(String[] args) {
        int[] array = {5,9,3,8,1};
        Arrays.stream(array).forEach(el->
            System.out.println(el*=2));
        Arrays.stream(array).forEach(System.out::print);
        System.out.println();
        System.out.println("=-=-=-=-=-=-=-=-=");
        Arrays.stream(array).forEach(Utils::myMethod);
    }
}

class Utils{
    public static void myMethod(int a){
        a=a+5;
        System.out.println("el="+a);
    }
}
