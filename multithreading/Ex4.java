package multithreading;

public class Ex4 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        MyThread5 myThread51 = new MyThread5();
        myThread5.setName("My Thread");
        myThread5.setPriority(10);
        System.out.println("name  "+myThread5.getName()+
                "   priority  "+myThread5.getPriority());
        System.out.println("name  "+myThread51.getName()+
                "   priority  "+myThread51.getPriority());
        System.out.println("v potoke "+Thread.currentThread().getName());

    }
}
class MyThread5 extends Thread{
    @Override
    public void run() {
        System.out.println("Hi!!");
    }
}