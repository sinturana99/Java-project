package com.example.demo.java8.functionnn;

import java.util.List;
import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args)
    {
        List<Employee> employeeList=Employee.employeeDetails();

        //1. FISRT PARAMETER IS FOR DATATYPES OF INPUT AND SECOND IS FOR RETURNTYPE
        Function<Integer,Integer> f1= i-> i*10;
        System.out.println(f1.apply(5));

        Function<String,Integer> f2= s-> s.length();
        System.out.println(f2.apply("Shyam"));

        //2 using two function
        Function<Integer,Integer> f3= i->2*i;
        Function<Integer,Integer> f4= i->i*i;
        System.out.println("result: "+ f3.andThen(f4).apply(3)); // f3 will execute first then f4 will execute with the result of f3


        // using compose()
        System.out.println("result: " + f3.compose(f4).apply(3));// f4 will execute first then f3 will execute  with the result of f4

    }
}
