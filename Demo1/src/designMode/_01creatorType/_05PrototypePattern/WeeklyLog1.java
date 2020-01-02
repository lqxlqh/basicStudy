package designMode._01creatorType._05PrototypePattern;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(原型模式--浅复制)
 * @Notes--(对象本身和值复制，引用类型不复制)
 */
public class WeeklyLog1 implements Cloneable{
    private Attachment attachment;
    private String name;
    private String data;
    private String content;

    public WeeklyLog1 clone(){
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("对象不可复制");
            e.printStackTrace();
        }
        return (WeeklyLog1) obj;
    }

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
