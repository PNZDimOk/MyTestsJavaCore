package multithreading;

import java.util.concurrent.*;

public class RunnableFactorial {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial factorial = new Factorial(5);
//        executorService.execute(factorial);
        Future future = executorService.submit(factorial);
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);
        System.out.println(future.get());
        System.out.println(future.isDone());

    }
}

class Factorial implements Runnable{
    int f;

    public Factorial(int f){
        this.f=f;
    }

    public void run(){
        if(f<=0){
            System.out.println("Nevernoe chislo");
            return;
        }
        int result = 1;
        for (int i = 1; i<=f; i++){
            result*=i;
        }
        RunnableFactorial.factorialResult=result;
    }
}
