package HookTest;

/**
 * @author lin
 * @create 2019-12-10
 * @Info(继承类)
 * @Notes--()
 */
public class MyIncrement {
    public void increment(){
        System.out.println("MyIncrement increment");
    }
    static void f(MyIncrement mi){
        mi.increment();
    }
}
