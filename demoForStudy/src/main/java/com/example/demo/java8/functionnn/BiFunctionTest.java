package com.example.demo.java8.functionnn;

import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionTest {

    public static void main(String[] args)
    {
        List<Employee> employeeList=Employee.employeeDetails();

        //1. FISRT And Second PARAMETER IS FOR DATATYPES OF INPUT AND THIRD IS FOR RETURNTYPE
        BiFunction<Integer,String,Employee> f1 = (id,name)-> new Employee(id,name,1000);
        Employee e = f1.apply(12,"Raj");
        System.out.println("result is :"+e);


    }
}
