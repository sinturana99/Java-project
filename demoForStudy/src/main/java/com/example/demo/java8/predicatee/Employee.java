package com.example.demo.java8.predicatee;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Employee {
    private int id;
    private String name;
    private int salary;
  static  List<Employee> employeeDetails(){
     List<Employee > employeeList =new ArrayList<>();
     employeeList.add(Employee.builder().id(1).name("Ram").salary(1300000).build());
     employeeList.add(Employee.builder().id(2).name("Sam").salary(900000).build());
     employeeList.add(Employee.builder().id(3).name("Jam").salary(1000000).build());
     employeeList.add(Employee.builder().id(4).name("Tam").salary(200000).build());
     employeeList.add(Employee.builder().id(5).name("Dam").salary(800000).build());
     employeeList.add(Employee.builder().id(6).name("Cam").salary(700000).build());
     return employeeList;
 }
}

