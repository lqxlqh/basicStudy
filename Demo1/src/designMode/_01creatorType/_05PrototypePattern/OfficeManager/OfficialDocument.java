package designMode._01creatorType._05PrototypePattern.OfficeManager;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(带原型管理器的原型模式)
 * @Notes--(注意，克隆对象的工厂接口需要继承Cloneable接口)
 */
//抽象公文接口，也可以定义为抽象类，提供clone()方法的实现，将业务方法声明为抽象方法
interface OfficialDocument extends Cloneable{
    public OfficialDocument clone();
    public void display();
}
