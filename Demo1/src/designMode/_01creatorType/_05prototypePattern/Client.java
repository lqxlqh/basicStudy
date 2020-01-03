package designMode._01creatorType._05prototypePattern;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(原型模式-快速创建周报)
 * @Notes--(客户端测试代码--地址复制)
 */
public class Client {
    public static void main(String[] args) {
        //创建原型对象
        WeeklyLog wl = new WeeklyLog();
        wl.setName("小明");
        wl.setData("第一周");
        wl.setContent("加班");

        System.out.println("---------------周报1-----------");
        System.out.println(wl);

        //调用克隆方法创建克隆对象
        WeeklyLog wlClone = wl.clone();
        wlClone.setData("第二周");

        System.out.println("---------------周报2-----------");
        System.out.println(wlClone);

        System.out.println("---------------周报1-----------");
        System.out.println(wl);

        //克隆对象与原型对象不是同一个对象
        System.out.println(wl == wlClone);
    }
}
