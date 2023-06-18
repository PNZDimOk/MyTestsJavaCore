package multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        Person person1 = new Person("dima", callBox);
        Person person2 = new Person("Oleg", callBox);
        Person person3 = new Person("Victor", callBox);
        Person person4 = new Person("Maria", callBox);
        Person person5 = new Person("daria", callBox);
        person1.start();
        person2.start();
        person3.start();
        person4.start();
        person5.start();

    }
}
class Person extends Thread{
    String name;
    private Semaphore callBox;
    public Person(String name, Semaphore callBox){
        this.name=name;
        this.callBox=callBox;
    }
    public void run(){
        System.out.println(name+" wait...");
        try {
            callBox.acquire();
            System.out.println(name+" using callBox");
            sleep(2000);
            System.out.println(name+" ends call");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callBox.release();
        }
    }
}
