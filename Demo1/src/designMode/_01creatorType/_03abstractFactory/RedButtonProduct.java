package designMode._01creatorType._03abstractFactory;

/**
 * @author lin
 * @create 2019-11-06
 * 抽象工厂模式 -- 具体产品：定义了具体工厂产生的具体产品对象，实现了抽象产品中声明的业务方法
 */
public class RedButtonProduct implements AbstractProductAction {
    @Override
    public void button() {
        System.out.println("红色按钮");
    }
}
