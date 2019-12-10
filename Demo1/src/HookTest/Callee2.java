package HookTest;

/**
 * @author lin
 * @create 2019-12-10
 * @Info(继承MyIncrement，内部实现Incrementable)
 * @Notes--()
 */
public class Callee2 extends MyIncrement{
    private int i= 0;

    public void increment(){
        super.increment();
        i++;
        System.out.println("Callee2: i="+i);
    }

    private class Closure implements Incrementable{
        @Override
        public void incremnet() {
            Callee2.this.increment();
        }
    }

    Incrementable getIncrementable(){
        return new Closure();
    }
}
