package Collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodeEx1 {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Dmitrii", "Koshelev",5);
        Student st2 = new Student("Tatyana", "Kulyasova",2);
        Student st3 = new Student("Maria", "Ivanova",4);
        Student st4 = new Student("Misha", "Sidorov",3);
        Student st5 = new Student("Oleg", "Kerzhenov",1);
        Student st6 = new Student("Dmitrii", "Koshelev",5);
        map.put(st1,3.7);
        map.put(st2,4.5);
        map.put(st3,3.2);
        map.put(st4,4.1);
        map.put(st5,3.9);
        System.out.println(map);

        boolean res = map.containsValue(st6);
        System.out.println(res);

        for (Map.Entry<Student,Double> entry: map.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        Map<Integer,String> new_map = new HashMap<>(20, 0.8f);
        System.out.println(20*0.8);
    }
}

class Student implements Comparable<Student>{
    String name;
    String surName;
    int course;

    public Student(String name, String surName, int course) {
        this.name = name;
        this.surName = surName;
        this.course = course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course && Objects.equals(name, student.name) && Objects.equals(surName, student.surName);
    }



//    @Override
//    public int hashCode() {
//        return Objects.hash(name, surName, course);
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}
