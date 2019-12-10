package HookTest;

/**
 * @author lin
 * @create 2019-12-10
 * @Info()
 * @Notes--()
 */
public class Caller {
    private Incrementable callIncrementable;

    Caller(Incrementable cbn){
        callIncrementable = cbn;
    }

    void go(){
        callIncrementable.incremnet();
    };

}
