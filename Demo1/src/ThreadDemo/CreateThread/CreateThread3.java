package ThreadDemo.CreateThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.function.Function;

/**
 * @author lin
 * @create 2019-12-04
 * @Info(实现Callable接口和Future创建线程)
 * @Notes--(Callable不能直接获取返回值，需要用FutureTask<V>在外部封装一下再获取返回值)
 */
class ThreadDemo3 implements Callable<String>{

    @Override
    public String call() throws Exception {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+":i="+i);
        }
        return "返回的值";
    }
}

public class CreateThread3 {
    public static void main(String[] args) throws InterruptedException {
        Callable<String> callable = new ThreadDemo3();
        FutureTask<String> futureTask = new FutureTask<String>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        for (int i = 0; i < 100; i++) {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName()+":i="+i);
        }
        try {
            String s = futureTask.get();//获取线程的返回值
            System.out.println(s);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
