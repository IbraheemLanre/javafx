package com.ibraheem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Cain Abel", 21);
        Employee snow = new Employee("Snow White", 22);
        Employee red = new Employee("Red RidingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

       printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
       printEmployeesByAge(employees, "\nEmployees 30 and under", employee -> employee.getAge() <= 30);
       printEmployeesByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() {
           @Override
           public boolean test(Employee employee) {
               return employee.getAge() < 25;
           }
       });
    }

    private static void printEmployeesByAge(List<Employee> employees, String ageText, Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("==============");
        for(Employee employee:employees){
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}
