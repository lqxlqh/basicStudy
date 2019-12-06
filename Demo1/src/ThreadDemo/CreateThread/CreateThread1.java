package ThreadDemo.CreateThread;

/**
 * @author lin
 * @create 2019-12-03
 * @Info(使用继承Thread类)
 */
class ThreadDemo1 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(getName()+":i="+i);
        }
    }
}
public class CreateThread1 {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        threadDemo1.start();
        for (int i = 0; i <100 ; i++) {
            Thread.currentThread().sleep(100);
            System.out.println(Thread.currentThread().getName()+":i="+i);
        }

    }
}
