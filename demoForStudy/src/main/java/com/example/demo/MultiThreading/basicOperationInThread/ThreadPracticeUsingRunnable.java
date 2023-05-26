package com.example.demo.MultiThreading.basicOperationInThread;

public class ThreadPracticeUsingRunnable implements  Runnable{
    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println("Thread  is running by implementing Runnable interface");
            try{
                Thread.sleep(2000); //Thread will sleep for given ms
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args)
    {
        // A Thread is a lightweight sub-process,the smallest unit of processing.
        // MultiThreading is a process of executing multiple Threads simultaneously.
        //Creating Thread:- a)Extending Thread class,  b)Implementing Runnable interface.

        ThreadPracticeUsingRunnable t = new ThreadPracticeUsingRunnable();
        Thread t1= new Thread(t);
        //setting name and getting the id of the thread t1
        t1.setName("Runnable Thread");
        System.out.println("Name of the Thread is: "+t1.getName()+" and id is: "+t1.getId());
        t1.start();

      /*  //invoking another class's thread
        ThreadPracticeUsingThread t2=new ThreadPracticeUsingThread();
        t2.start();*/

    }
}
