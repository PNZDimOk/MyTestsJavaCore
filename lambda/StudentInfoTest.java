package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.*;

public class StudentInfoTest {
    void testStud(ArrayList<Student> al, Predicate<Student> pr){
        for (Student s:al){
            if(pr.test(s)){
                System.out.println(s);
            }
        }
    }
}

class TestFunction {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm',23,4,8.3);
        Student st2 = new Student("Nikolay", 'm',28,5,7.7);
        Student st3 = new Student("Maria", 'f',22,3,8.9);
        Student st4 = new Student("Oleg", 'm',21,2,9.1);
        Student st5 = new Student("Daria", 'f',23,3,6.8);

        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        StudentInfoTest info = new StudentInfoTest();

        Collections.sort(students, (stud1, stud2) -> stud1.course-stud2.course);
        System.out.println(students);

        info.testStud(students,(Student s)->{
            System.out.println("hello");
            return s.avgGrade>8.2;});
        System.out.println("---------------------");
        info.testStud(students, s->s.avgGrade>8.2);
        System.out.println("---------------------");
        info.testStud(students,(Student s)->{return s.age<23;});
        System.out.println("---------------------");
        info.testStud(students,(Student s)->{
            return s.age<23 && s.sex=='f';
        });

    }
}
