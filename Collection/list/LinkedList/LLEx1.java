package Collection.list.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class LLEx1 {
    public static void main(String[] args) {
        List<Student> studentList = new LinkedList<>();
        Student student1 = new Student("Vasya",1);
        Student student2 = new Student("Katya",5);
        Student student3 = new Student("Dasha",2);
        Student student4 = new Student("Misha",3);
        Student student5 = new Student("Igor",4);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        System.out.println(studentList);

    }
}


class Student{
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
