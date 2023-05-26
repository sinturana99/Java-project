package com.example.demo.java8.supplierr;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args)
    {
        //1 given args is for returning data types
        Supplier<Date> s1= ()-> new Date();
        System.out.println(s1.get());

        //2
        Supplier<String> s2=()->{
            String otp="";
            for(int i=0;i<6;i++) {
                otp+=(int)(Math.random()*10);
            }
            return otp;
        };
        System.out.println("result is: "+s2.get());
    }
}
