package designMode._01creatorType._03abstractFactory;

/**
 * @author lin
 * @create 2019-11-06
 */
public class RedConcreteFactory implements AbstractFactory {
    @Override
    public AbstractProductColor getColor() {
        return new RedProduct();
    }

    @Override
    public AbstractProductAction getAction() {
        return new RedButtonProduct();
    }
}
