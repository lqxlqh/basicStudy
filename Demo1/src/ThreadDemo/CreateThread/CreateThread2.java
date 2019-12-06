package ThreadDemo.CreateThread;

/**
 * @author lin
 * @create 2019-12-04
 * @Info(实现Runnable接口)
 */
class ThreadDemo2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":i="+i);
        }
    }
}

public class CreateThread2 {
    public static void main(String[] args) {
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        Thread thread = new Thread(threadDemo2);
        thread.start();
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(100);;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":i="+i);
        }
    }
}
