package work_with_files.prog1;

import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String surname;
    String department;
//    int age;
    transient double salary;
    Car car;

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +" surname='"+surname+'\'' +
                ", deoartment='" + department + '\'' +
                ", salary=" + salary +" Car "+car+
                '}';
    }

    public Employee(String name,String surname, String deoartment, double salary, Car car) {
        this.name = name;
        this.surname=surname;
        this.department = deoartment;
        this.salary = salary;
        this.car=car;
    }
}
