package ThreadDemo.CreateThread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author lin
 * @create 2019-12-05
 * @Info()
 * @Notes--()
 */
class ThreadDemao5{
    int count = 100;
    public void subtract(){
        while(count >0){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"--出售第："+ (100 - count +1)+"张票");
            count --;
        }
    }
}

public class CreateThread5 {
    public static void main(String[] args) {
        ThreadDemao5 threadDemao5 = new ThreadDemao5();
        new Thread(()->{
            threadDemao5.subtract();
        },"线程1").start();

        FutureTask<String> futureTask = new FutureTask<>((Callable<String>) () -> {
            threadDemao5.subtract();
            return "线程2结束";
        });
        new Thread(futureTask,"线程2").start();
    }
}
