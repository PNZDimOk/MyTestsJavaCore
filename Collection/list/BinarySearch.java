package Collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        Employee employee1 = new Employee(7,"Vasya", 23500);
        Employee employee2 = new Employee(3,"Katya", 21500);
        Employee employee3 = new Employee(9,"Nikita", 20500);
        Employee employee4 = new Employee(5,"Maria", 18500);
        Employee employee5 = new Employee(1,"Igor", 2000);
        Employee employee6 = new Employee(2,"Oleg", 33500);

        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        System.out.println(employees);
        Collections.sort(employees);
        System.out.println(employees);

        System.out.println(Collections.binarySearch(employees, new Employee(7,"asdasd", 1)));

        Collections.reverse(employees);
        System.out.println(employees);

        Collections.shuffle(employees);
        System.out.println(employees);
    }
}

class Employee implements Comparable<Employee>{

    private int id;
    private String name;
    private int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        return this.id-anotherEmp.id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}