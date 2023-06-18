package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCollect {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm',27,3,9.1);
        Student st2 = new Student("Maria", 'f',21,2,8.2);
        Student st3 = new Student("Oleg", 'm',22,1,7.5);
        Student st4 = new Student("Nastya", 'f',28,5,6.8);
        Student st5 = new Student("Dariya", 'f',25,3,8.9);
        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        Map<Integer,List<Student>> listMap= students.stream().map(el->{el.setName(el.getName().toUpperCase());return el;})
                .collect(Collectors.groupingBy(el->el.getCourse()));
        System.out.println(listMap);
        System.out.println("==================");

        for (Map.Entry<Integer, List<Student>> entry: listMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println("-=/-=/-=/-=/-=/-=/-=/-=/-=/-=/");
        System.out.println();

        Map<Boolean, List<Student>> mapBool = students.stream().collect(Collectors.partitioningBy(el->el.getAvgGrade()>8));

        for (Map.Entry<Boolean, List<Student>> entry: mapBool.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }
}
