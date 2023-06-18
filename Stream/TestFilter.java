package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm',23,4,8.3);
        Student st2 = new Student("Nikolay", 'm',28,5,7.7);
        Student st3 = new Student("Maria", 'f',22,3,8.9);
        Student st4 = new Student("Oleg", 'm',21,2,9.1);
        Student st5 = new Student("Daria", 'f',23,3,6.8);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        System.out.println(students);
        students = students.stream().sorted((x,y)->
                x.getName().compareTo(y.getName())).collect(Collectors.toList());
        System.out.println("отсортирован по имени");
        System.out.println(students);

        System.out.println("============================");
        students=students.stream().filter(element->
                element.getAge()>22 && element.getAvgGrade()<8.2).collect(Collectors.toList());
        System.out.println(students);

        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        List<Student> fList = myStream.filter(el->el.getSex()=='f').collect(Collectors.toList());
        System.out.println(fList);
    }
}

class Student{
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }
}