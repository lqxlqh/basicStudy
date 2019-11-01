package designMode._01creatorType._02factoryMethod;

/**
 * @author lin
 * @create 2019-11-01-22:50
 * 工厂方法模式  --具体工厂：是抽象工厂的子类，由客户端调用，返回一个具体产品类的实例
 */
public class PhoneFatory implements Factory {
    @Override
    public Product factoryMethod() {
        //可用配置文件的方式实现
        return new PhoneProduct();
    }
}
