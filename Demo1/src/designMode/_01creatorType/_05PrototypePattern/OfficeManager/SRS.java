package designMode._01creatorType._05PrototypePattern.OfficeManager;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(带原型管理器的原型模式)
 * @Notes--(某个对象的原型对象，实现克隆对象工厂)
 */
public class SRS implements OfficialDocument{
    @Override
    public OfficialDocument clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (OfficialDocument) obj;
    }

    @Override
    public void display() {
        System.out.println("SRS");
    }
}
