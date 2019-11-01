package designMode._01creatorType._02factoryMethod;

/**
 * @author lin
 * @create 2019-11-01-22:43
 * 工厂方法模式  --具体产品：实现了抽象产品，某种具体产品与工厂一一对应
 */
public class PhoneProduct implements Product {
    @Override
    public void descrip() {
        System.out.println("我是手机");
    }
}
