package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMinMax {
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

        Student min = students.stream().min((x,y)-> x.getAge()- y.getAge()).get();
        Student max = students.stream().max((x,y)-> x.getAge()- y.getAge()).get();
        System.out.println("Младший: "+min+"\n"+"Cтарший: "+max );
        System.out.println();

        students.stream().filter(el->el.getAge()>23).forEach(System.out::println);
        System.out.println("--------------------------");
        students.stream().filter(el->el.getAge()>23).limit(1).forEach(System.out::println);
        System.out.println("-------------------------");
        students.stream().filter(el->el.getAge()>23).skip(2).forEach(System.out::println);
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.println();
        List<Integer> courses = students.stream().mapToInt(el->el.getCourse()).boxed()
                .collect(Collectors.toList());
        System.out.println(courses);
    }
}
