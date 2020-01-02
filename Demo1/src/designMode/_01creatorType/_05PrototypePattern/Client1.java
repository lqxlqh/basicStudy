package designMode._01creatorType._05PrototypePattern;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(原型模式-快速创建周报--浅复制)
 * @Notes--(客户端测试代码--地址复制)
 */
public class Client1 {
    public static void main(String[] args) {
        //创建原型对象
        WeeklyLog1 wl = new WeeklyLog1();
        Attachment attachment = new Attachment();
        wl.setAttachment(attachment);

        //创建克隆对象
        WeeklyLog1 wlClone = wl.clone();

        //周报比较
        System.out.println("周报比较："+(wl == wlClone));
        //附件比较--引用类型
        System.out.println("附件比较："+(wl.getAttachment() == wlClone.getAttachment()));
    }
}
