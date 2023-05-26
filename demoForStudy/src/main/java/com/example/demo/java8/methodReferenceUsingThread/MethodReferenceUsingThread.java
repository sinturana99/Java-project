package com.example.demo.java8.methodReferenceUsingThread;
interface test{
     void add(int a,int b);
}

public class MethodReferenceUsingThread {
    public static void sum(int a,int b){
        System.out.println("Sum is: "+(a+b));
    }
    public static void m1(){
        for (int i=0;i< 2;i++){
            System.out.println("Child Thread- using static method reference");
        }
    }
    public  void m2(){
        for (int i=0;i< 2;i++){
            System.out.println("Child Thread- using non-static method reference");
        }
    }

    public static void main(String[] args)
    {
        //Calling interface's method
        test ob=(a,b)->System.out.println("Result: "+(a+b));
        ob.add(5,10);


        //overriding interface's add()
        test ob1= MethodReferenceUsingThread::sum;
        ob1.add(8,9);


        //Simple way for method reference of static method
        Runnable r= MethodReferenceUsingThread :: m1;
        Thread t= new Thread(r);
        t.start();

        // non-static method reference using object refference
        Runnable r1= new MethodReferenceUsingThread() :: m2;
        Thread t1= new Thread(r1);
        t1.start();

        //Main Thread
        for (int i=0;i< 2;i++){
            System.out.println("Main Thread");
        }
    }
}
