package Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);
//        System.out.println(list.parallelStream().count());

        long m = System.currentTimeMillis();
        double sumResult=list.stream()
                .reduce((accumulator, el)->accumulator+el).get();
        System.out.println((double) (System.currentTimeMillis() - m));
        System.out.println(sumResult);
        System.out.println("-----------");
        long m1 = System.currentTimeMillis();
        double sumResultPar = list.parallelStream()
                .reduce((accumulator, el)->accumulator+el).get();
        System.out.println((double) (System.currentTimeMillis() - m1));
        System.out.println(sumResultPar);
        System.out.println("-----------");
        double divisionResult = list.stream()
                .reduce((accum, el)->accum/el).get();
        System.out.println("divisRes= "+divisionResult);
        double divisionResult1 = list.parallelStream()
                .reduce((accum, el)->accum/el).get();
        System.out.println("divisRes1= "+divisionResult1);
    }
}
