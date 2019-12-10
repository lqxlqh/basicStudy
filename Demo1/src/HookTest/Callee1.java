package HookTest;

/**
 * @author lin
 * @create 2019-12-10
 * @Info(外部类实现接口)
 * @Notes--()
 */
public class Callee1 implements Incrementable{
    private int i = 0;
    @Override
    public void incremnet() {
        i++;
        System.out.println("Callee1: i="+i);
    }
}
