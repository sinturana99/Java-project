package com.example.demo.java8.consumerr;


import com.example.demo.java8.functionnn.Employee;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerTest {

    public static void main(String[] args) {
        List<Employee> employeeList= Employee.employeeDetails();

        //1 Two datatypes for input only
        BiConsumer<Integer,String> c1 = (id,name) -> System.out.println("id is: " +id+ " name: "+name);
        employeeList.forEach(employee -> {
            c1.accept(employee.getId(),employee.getName());
        });
    }
}
