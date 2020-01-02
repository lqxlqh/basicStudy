package designMode._01creatorType._05PrototypePattern;

/**
 * @author lin
 * @create 2020-01-02
 * @Info(原型模式--浅克隆)
 * @Notes--(附件类--区分浅克隆和深克隆)
 */
public class Attachment {
    //附件名
    private String name;

    public void download(){
        System.out.println("下载附件，文件名为："+ name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
