package Collection.list.ArrayList;

import java.util.ArrayList;

public class ARLMethods2 {
    public static void main(String[] args) {
        ArrayList<Student> list_students = new ArrayList<>();
        Student student1 = new Student("Vasya", "m", 22, 1, 3.75);
        Student student2 = new Student("Kolya", "m", 23, 2, 3.15);
        Student student3 = new Student("Igor", "m", 21, 1, 4.95);
        Student student4 = new Student("Marya", "f", 25, 4, 3.5);
        Student student5 = new Student("Oleg", "m", 24, 3, 4.85);
        Student student6 = new Student("Tatiana", "f", 26, 5, 3.05);

        list_students.add(student1);
        list_students.add(student2);
        list_students.add(student3);
        list_students.add(student4);
        list_students.add(student5);
        list_students.add(student6);
        System.out.println(list_students);
        Student student7 = new Student("Tatiana", "f", 26, 5, 3.05);
        list_students.remove(student7);
        System.out.println(list_students);


    }
}


class Student{
    private String name;
    private String sex;
    private int age;
    private int course;
    private double avgGrade;

    public Student(String name, String sex, int age, int course, double avgGrade) {
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
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (course != student.course) return false;
        if (Double.compare(student.avgGrade, avgGrade) != 0) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return sex != null ? sex.equals(student.sex) : student.sex == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + course;
        temp = Double.doubleToLongBits(avgGrade);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
