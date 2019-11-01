package designMode._01creatorType._02factoryMethod;

/**
 * @author lin
 * @create 2019-11-01-22:53
 */
public class ComputerFactory implements Factory {
    @Override
    public Product factoryMethod() {
        return new ComputerProduct();
    }
}
