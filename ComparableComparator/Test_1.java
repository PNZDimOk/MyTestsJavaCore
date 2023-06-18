package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_1 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee emp1 = new Employee(100,"Dmitrii", "Koshelev", 3500);
        Employee emp2 = new Employee(15, "Tatyana", "Kulyasova", 2000);
        Employee emp3 = new Employee(23,"Alexei", "Gruzinov", 4700);
        Employee emp4 = new Employee(155, "Tatyana", "Kulyasova", 7000);
        Employee emp5 = new Employee(156, "Tatyana", "Kulyasova", 2001);
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);
        employees.add(emp5);

        System.out.println("Pered sort");
        System.out.println(employees);
        Collections.sort(employees, new NameComparator());
        System.out.println("posle sort");
        System.out.println(employees);

    }
}

    class Employee implements Comparable<Employee>{
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee another_emp) {
        if (this.id==another_emp.id) {
            return 0;
        }
        else if (this.id<another_emp.id) {
            return -1;
        } else{
            return 1;
        }

//        int result = this.name.compareTo(another_emp.name);
//        if (result ==0){
//            result = this.surname.compareTo(another_emp.surname);
//            if (result==0){
//                result=this.salary-another_emp.salary;
//            }
//        }
//        return result;


    }
}
    class NameComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2){
            int result = emp1.name.compareTo(emp2.name);
            if (result ==0){
                result = emp1.surname.compareTo(emp2.surname);
                if (result==0){
                    result=emp1.salary-emp2.salary;
                }
            }  return result;
        }
    }

//    class IdComparator implements Comparator<Employee> {
//        @Override
//        public int compare(Employee emp1, Employee emp2) {
//            if (emp1.id==emp2.id) {
//                return 0;
//            }
//            else if (emp1.id<emp2.id) {
//                return -1;
//            } else{
//                return 1;
//            }
//        }
//    }

