package designMode._01creatorType._05PrototypePattern;

/**
 * @author lin
 * @create 2019-12-31
 * @Info(原型模式)
 * @Notes--(具体原型类--Java语言提供的clone()方法，注意:必须要实现一个标识接口Cloneable)
 */
public class ConcretePrototype1 implements Cloneable {
    public Prototype clone(){
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Prototype) object;
    }
}
