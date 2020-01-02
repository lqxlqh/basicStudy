package designMode._01creatorType._05PrototypePattern.OfficeManager;


import java.util.Hashtable;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(带原型管理器的原型模式)
 * @Notes--(原型管理器)
 */
//原型管理器(使用饿汉式单例)
public class PrototypeManager {
    //定义一个Hashtable,用于存储对象
    private Hashtable ht = new Hashtable();
    //加载即初始化(饿汉式单例)
    private static PrototypeManager pm = new PrototypeManager();

    //初始化添加公文对象
    private PrototypeManager(){
        ht.put("far",new FAR());
        ht.put("srs",new SRS());
    }
    //添加新的公文对象
    public void addOfficialDocument(String key,OfficialDocument officialDocument){
        ht.put(key,officialDocument);
    }
    //通过浅克隆获取新的公文对象
    public OfficialDocument getOfficialDocument(String key){
        return ((OfficialDocument)ht.get(key)).clone();
    }
    public static PrototypeManager getprototypeManger(){
        return pm;
    }
}
