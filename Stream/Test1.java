package Stream;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        stream1.filter(el->{
            System.out.println("!!!!!!!");
            return el%2==0;
        });

        Stream<Integer> stream2 = Stream.of(1,2,3,4,5,1,2,3);
        stream2.filter(el->{
            System.out.println("!!!!!!!");
            return el%2==0;
        }).collect(Collectors.toList());

        Stream<Integer> stream_1 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream_2 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream_12_concat= Stream.concat(stream_1,stream_2);
        stream_12_concat.forEach(System.out::println);

        Stream<Integer> stream_11 = Stream.of(1,2,3,4,5,1,2,3);
//        stream_11.distinct().forEach(System.out::println);
//
//        System.out.println(stream_11.count());
//        System.out.println(stream_11.distinct().count());
//        System.out.println(stream_11.distinct().peek(System.out::println).count());


    }
}
