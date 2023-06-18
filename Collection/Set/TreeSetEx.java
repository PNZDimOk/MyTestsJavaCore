package Collection.Set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(2);
        set.add(7);
        set.add(10);
        set.add(1);
//        set.add(null);

        System.out.println(set);
        System.out.println(set.contains(1));

        TreeSet<Student> studentTreeSet = new TreeSet<>();
        Student student1 = new Student("Dmitrii", 4);
        Student student5 = new Student("Tatyana", 4);
        Student student2 = new Student("Oleg", 2);
        Student student3 = new Student("Maria", 1);
        Student student4 = new Student("Daria", 5);
        studentTreeSet.add(student1);
        studentTreeSet.add(student2);
        studentTreeSet.add(student3);
        studentTreeSet.add(student4);
        studentTreeSet.add(student5);

        System.out.println(studentTreeSet);
        System.out.println(studentTreeSet.first());
        System.out.println(studentTreeSet.headSet(student3));



    }
}

class Student implements Comparable<Student>{
    String name;
    int course;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student o) {
        int res;
        res=this.course-o.course;
        if (res==0){
            res=this.name.compareTo(o.name);
        }
        return res;
    }
}
