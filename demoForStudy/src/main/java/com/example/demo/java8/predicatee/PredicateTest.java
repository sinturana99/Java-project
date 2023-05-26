package com.example.demo.java8.predicatee;

import com.example.demo.DemoApplication;
import org.springframework.boot.SpringApplication;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args)
    {
        SpringApplication.run(DemoApplication.class, args);
        System.out.println("Hii ..Runing");
        List<Employee> employeeList= Employee.employeeDetails();
        // 1.a
       Predicate<Integer> p1= i-> i>9000;
         employeeList.forEach(employee -> {
             if(p1.test(employee.getSalary())){
                 System.out.println("Employee Details: "+ employee);
             }
         });

         //1.b
        Predicate<Employee> p2= employee-> employee.getSalary()>9000;
        employeeList.forEach(employee -> {
            if(p2.test(employee)){
                System.out.println("Employee Details: "+ employee);
            }
        });

        //2.a-using two predicates And operation

        Predicate<Employee> p3= employee -> employee.getName().startsWith("Ra");
        employeeList.forEach(employee -> {
            if(p2.and(p3).test(employee)){
                System.out.println("Employee Details: "+ employee);
            }
        });

        //2.b -using two predicates 'or' operation

        Predicate<Employee> p4= employee -> employee.getName().startsWith("Ra");
        employeeList.forEach(employee -> {
            if(p2.or(p4).test(employee)){
                System.out.println("Employee Details: "+ employee);
            }
        });


        //3 using negate()-It will return oposite result of given condition
        int[] x={0,5,10,12,15};
        Predicate<Integer> p5 = i->i%2==0;
        Arrays.stream(x).filter(i -> p5.negate().test(i)).forEach(i -> System.out.println(i));
        //It will return odd numbers.
    }
}
