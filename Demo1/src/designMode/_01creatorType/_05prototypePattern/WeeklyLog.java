package designMode._01creatorType._05prototypePattern;

/**
 * @author lin
 * @create 2019-12-31
 * @Info(原型模式--快速创建工作周报)
 * @Notes--(Object充当抽象原型类，WeeklyLog相当于具体原型类)
 */
//具体原型类
public class WeeklyLog implements Cloneable{
    private String name;
    private String data;
    private String content;

    public WeeklyLog clone(){
        Object object = null;
        try {
            object=super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制！");
            e.printStackTrace();
        }
        return (WeeklyLog) object;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "周报{" +
                "姓名='" + name + '\'' +
                ", 周次='" + data + '\'' +
                ", 内容='" + content + '\'' +
                '}';
    }
}
