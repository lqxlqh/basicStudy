package designMode._01creatorType._03abstractFactory;

/**
 * @author lin
 * @create 2019-11-06
 */
public class SpringButtonProduct implements AbstractProductAction{
    @Override
    public void button() {
        System.out.println("绿色按钮");
    }
}
