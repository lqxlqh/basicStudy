package designMode._01creatorType._03abstractFactory;

/**
 * @author lin
 * @create 2019-11-06
 */
public class SpringConcreteFactory implements AbstractFactory {
    @Override
    public AbstractProductColor getColor() {
        return new SpringProduct();
    }

    @Override
    public AbstractProductAction getAction() {
        return new SpringButtonProduct();
    }
}
