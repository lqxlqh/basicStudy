package designMode._01creatorType._05PrototypePattern;

import java.io.*;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(原型模式--深复制)
 * @Notes--(使用序列化技术实现深克隆)
 */
public class WeeklyLog2 implements Serializable{
    private Attachment1 attachment;
    private String name;
    private String data;
    private String content;

    //重写clone方法
    public WeeklyLog2 deepClone() throws IOException, ClassNotFoundException {
        //将对象写入流中
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bao);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bao.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (WeeklyLog2) ois.readObject();
    }

    public Attachment1 getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment1 attachment) {
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
