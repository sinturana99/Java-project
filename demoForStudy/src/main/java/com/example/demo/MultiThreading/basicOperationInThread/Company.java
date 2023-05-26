package com.example.demo.MultiThreading.basicOperationInThread;

public class Company {
    int n;
    boolean f =false;
    //If f=false means this is the chance for producer
    //If f=true means this is the chance for consumer

    synchronized public void produce_item(int n)  {
        if(f){
            try {
                wait();
            }catch (Exception e){}
        }
        this.n=n;
        System.out.println("Produced : "+this.n);
        f=true;
        notify();
    }

    synchronized public int consume_item() {
        if(!f){
            try {
                wait();
            }catch (Exception e){}
        }
        System.out.println("Consumed : "+this.n);
        f=false;
        notify();
        return this.n;
    }
}


class Producer extends Thread {
    Company c;
    //Initializing company object into Producer constructor
    Producer(Company c){
        this.c=c;
    }
    public void run(){
        int i=1;
        while (true){
            this.c.produce_item(i);
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
            i++;
        }

    }
}

class Consumer extends Thread{
    Company c;
    Consumer(Company c){
        this.c=c;
    }
    public void run(){
        while (true){
            this.c.consume_item();
            try {
                Thread.sleep(1000);
            }catch (Exception e){}
        }
    }
}

class Main{
    public static void main(String[] args)
    {
        Company c=new Company();
        Producer p=new Producer(c);
        Consumer c1=new Consumer(c);
        p.start();
        c1.start();

    }
}
