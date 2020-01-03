package designMode._01creatorType._05prototypePattern.OfficeManager;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(带原型管理器的原型模式)
 * @Notes--(客户端)
 */
public class Client {
    public static void main(String[] args) {
        //获取原型管理器对象
        PrototypeManager pm = PrototypeManager.getprototypeManger();
        OfficialDocument od1,od2,od3,od4;
        od1 = pm.getOfficialDocument("far");
        od1.display();
        od2 = pm.getOfficialDocument("far");
        od2.display();
        System.out.println("od1==od2：" + (od1 == od2));

        od3 = pm.getOfficialDocument("srs");
        od3.display();
        od4 = pm.getOfficialDocument("srs");
        od4.display();
        System.out.println("od3==od4：" + (od3 == od4));
    }
}
