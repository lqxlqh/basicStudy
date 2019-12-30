package designMode._01creatorType._04singletonPattem;

/**
 * @author lin
 * @create 2019-12-30
 * @Info(单例模式)
 * @Notes--(饿汉式单例)
 */
//饿汉式单例
public class EagerSingleton {
    //类加载时就创建对象
    private static EagerSingleton eagerSingleton = new EagerSingleton();
    private EagerSingleton(){
        //初始化
    }
    public static EagerSingleton getEagerSingleton(){
        return eagerSingleton;
    }
}
