package designMode._02singletonPattem;

/**
 * @author lin
 * @create 2019-12-30
 * @Info(单例模式)
 * @Notes--(将饿汉式单例和懒汉式单例优点结合，Initialization Demand Holder(loDH)技术)
 */
public class Singleton {
    private Singleton(){
        //初始化
    }

    //在内部类中创建单例对象
    private static class HodlerClass{
        private static Singleton singleton = new Singleton();
    }

    //将单例对象返回给外部对象使用
    public static Singleton getSingleton(){
        return HodlerClass.singleton;
    }
}
