package lambda;

import java.util.ArrayList;

public class RemoceIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Hello");
        al.add("Bye");
        al.add("Ok");
        al.add("Lambdas");
        al.add("Java");

        al.removeIf(element -> element.length()<5);
        System.out.println(al);
    }
}
