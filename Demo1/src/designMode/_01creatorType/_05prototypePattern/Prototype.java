package designMode._01creatorType._05prototypePattern;

/**
 * @author lin
 * @create 2019-12-30
 * @Info(原型模式)
 * @Notes--(抽象原型类)
 */
interface Prototype {
    String getArr();
    void setArr(String arr);
    Prototype clone();
}
