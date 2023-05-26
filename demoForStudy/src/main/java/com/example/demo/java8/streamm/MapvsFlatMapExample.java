package com.example.demo.java8.streamm;

import com.example.demo.java8.functionnn.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class MapvsFlatMapExample {
    public static void main(String[] args)
    {
        List<Customer> customers = Customer.getAll();


        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> customer.getEmail()
        //customer -> customer.getEmail()  one to one mapping
        List<String> emails = customers.stream()
                .map(customer -> customer.getEmail())
                .collect(Collectors.toList());
        System.out.println(emails);



        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        System.out.println("Using map------------");
        List<List<String>> phoneNumbers = customers.
                stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);




        //List<Customer>  convert List<String> -> Data Transformation
        //mapping : customer -> phone Numbers
        //customer -> customer.getPhoneNumbers()  ->> one to many mapping
        System.out.println("Using flatMap------------");

        List<String> phones = customers.stream()
                .flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);

       //fetching average salary using mapToDouble()
        List<Employee> employeeList = Employee.employeeDetails();
        double sal= employeeList.parallelStream().map(Employee::getSalary).mapToDouble(i -> i).average().getAsDouble();
        System.out.println("average salary is "+sal);
    }
}
