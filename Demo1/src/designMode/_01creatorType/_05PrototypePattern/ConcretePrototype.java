package designMode._01creatorType._05PrototypePattern;

import jdk.nashorn.internal.runtime.PrototypeObject;

/**
 * @author lin
 * @create 2019-12-30
 * @Info(原型模式)
 * @Notes--(具体原型类)
 */
public class ConcretePrototype implements Prototype {
    //成员属性
    private String arr;

    public String getArr() {
        return this.arr;
    }

    public void setArr(String arr) {
        this.arr = arr;
    }

    @Override
    //克隆方法
    public Prototype clone() {
        //创建新的对象
        Prototype prototype  = new ConcretePrototype();
        prototype.setArr(this.arr);
        return prototype;
    }
}
