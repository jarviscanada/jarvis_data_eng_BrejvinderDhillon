package ca.jrvs.practice.dataStructure.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {

  public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();
    employees.add(new Employee(4, "Bob", 20, 1000));
    employees.add(new Employee(2, "Alice", 30, 2000));
    employees.add(new Employee(3, "Jim", 40, 3000));
    employees.add(new Employee(1, "Jam", 50, 4000));

    //Natural ordering by id
    Collections.sort(employees);
    System.out.println(employees);

    //Sorting by age
    Comparator<Employee> employeeComparator = Comparator.comparingInt(Employee::getAge);
    Collections.sort(employees, employeeComparator);
    System.out.println(employees);
  }

}
