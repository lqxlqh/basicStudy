package designMode._01creatorType._05PrototypePattern;

import java.io.IOException;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(原型模式-快速创建周报--深复制)
 * @Notes--(客户端测试代码--通过序列化技术实现深克隆)
 */
public class Client2 {
    public static void main(String[] args) {
        //创建原型对象
        WeeklyLog2 wl = new WeeklyLog2();
        Attachment1 attachment1 = new Attachment1();
        wl.setAttachment(attachment1);

        //创建克隆对象
        WeeklyLog2 wlClone = null;
        try {
            wlClone = wl.deepClone();
        } catch (Exception e) {
           System.err.println("克隆失败！");
        }

        //周报比较
        System.out.println("周报比较："+(wl == wlClone));
        //附件比较--引用类型
        System.out.println("附件比较："+(wl.getAttachment() == wlClone.getAttachment()));
    }
}
