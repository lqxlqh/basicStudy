package ThreadDemo.CreateThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author lin
 * @create 2019-12-04
 * @Info(使用Lambda创建线程)
 * @Notes--()
 */
public class CreateThread4 {
    public static void main(String[] args) {

        new Thread(() ->{
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(40);;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+":i="+i);
            }
        },"线程1").start();

        FutureTask<String> futureTask = new FutureTask<String>((Callable<String>) () -> {
            for (int i = 0; i < 38; i++) {
                try {
                    Thread.sleep(40);
                    ;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ":i=" + i);
            }
            return "返回的值1";
        });

        new Thread(futureTask,"线程2").start();



        FutureTask<String> futureTask1 = new FutureTask<>((Callable<String>) CreateThread4::call);
        Thread thread2 = new Thread(futureTask1,"线程3");
        thread2.start();



        try {
            String s1 = futureTask.get();
            String s2 = futureTask1.get();

            System.out.println(s1);
            System.out.println(s2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 80; i++) {
            try {
                Thread.sleep(40);;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":i="+i);
        }

    }

    public static String call(){
        for (int i = 0; i < 27; i++) {
            try {
                Thread.sleep(40);
                ;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":i=" + i);
        }
        return "返回的值2";
    }
}
