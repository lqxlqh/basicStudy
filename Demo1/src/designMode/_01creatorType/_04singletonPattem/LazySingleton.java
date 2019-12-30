package designMode._01creatorType._04singletonPattem;

/**
 * @author lin
 * @create 2019-12-30
 * @Info(单例模式)
 * @Notes--(懒汉式单例--（延迟加载(LazyLoad)技术）
 *          注意：getLazySingleton1()方法可用，但在高并发中影响性能
 *               getLazySingleton2()方法使得对象创建不唯一，不使用
 *               getLazySingleton3()方法使用双重检查锁定，最优的懒汉式单例对象创建模式)
 */
//懒汉式单例
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){
        //初始化
    }
    //加synchronized线程锁，防止多线程同时访问问题
    /*注意：由于在方法上加线程锁，使得每次使用的时候都会进行线程锁判定，在多线程高并发访问环境中，将导致
    *系统性能大大降低，所以一般不采用
    * */
    synchronized public static LazySingleton getLazySingleton1(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //这种使用synchronized锁定代码块方法，在实际使用中还是会存在单例对象不唯一
    //注意：会使对象不唯一，不使用
    public static LazySingleton getLazySingleton2(){
        if(lazySingleton == null){
            //当多个线程同时进入到这里，会使得对象不唯一
            synchronized (LazySingleton.class){
                lazySingleton = new LazySingleton();
            }
        }
        return lazySingleton;
    }

    //双重检查锁定（Double-Check Locking）
    public static LazySingleton getLazySingleton3(){
        //第一重判定进入线程锁
        if(lazySingleton == null){
            //线程锁定代码块
            synchronized (LazySingleton.class){
                //第二重判定，在线程锁代码块中判定，防止多个创建
               if(lazySingleton == null){
                   lazySingleton = new LazySingleton();
               }
            }
        }
        return lazySingleton;
    }
}
