package designMode._01creatorType._03abstractFactory;

/**
 * @author lin
 * @create 2019-11-06
 * 抽象工厂模式 -- 抽象工厂：声明了创建一族产品的方法，每一个方法对应一类产品
 */
  interface AbstractFactory {
     AbstractProductColor getColor();
     AbstractProductAction getAction();
}
