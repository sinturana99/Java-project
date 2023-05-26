package com.example.demo.MultiThreading.basicOperationInThread;

public class ThreadPracticeUsingThread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++) {
            System.out.println("Thread  is running by extending Thread class");
            try {
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

        ThreadPracticeUsingThread t = new ThreadPracticeUsingThread();
        t.start();


    }
}
