package com.example.demo.java8.constructorReferenceUsingThread;
interface io{
    //public Sample get();
    public Sample get(String s);
}

public class ConstructorReferenceTest {
    public static void main(String[] args)
    {
       /*
        //invoking sample class no arg constructor
        io ob=Sample::new;
        Sample ob1= ob.get();

        */
        //invoking sample class arg constructor
        io ob=Sample::new;
        Sample ob1= ob.get("Ram");
    }
}
