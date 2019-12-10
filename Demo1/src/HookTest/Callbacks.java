package HookTest;

/**
 * @author lin
 * @create 2019-12-10
 * @Info()
 * @Notes--()
 */
public class Callbacks {
    public static void main(String[] args) {
        Callee1 c1 = new Callee1();
        Callee2 c2 = new Callee2();
        MyIncrement.f(c2);

        Caller caller1 = new Caller(c1);
        Caller caller2 = new Caller(c2.getIncrementable());

        System.out.println("///////////////////////////////");
        caller1.go();
        System.out.println("///////////////////////////////");
        caller1.go();
        System.out.println("///////////////////////////////");
        caller2.go();
        System.out.println("///////////////////////////////");
        caller2.go();
    }
}
