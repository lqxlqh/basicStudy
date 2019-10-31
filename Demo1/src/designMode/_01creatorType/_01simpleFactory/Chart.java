package designMode._01creatorType._01simpleFactory;

/**
 * @author lin
 * @create 2019-10-31-22:24
 * 简单工厂模式例子原形
 */

/*
 *缺点：
 *  1.大量使用if-else
 *  2.更改需要加代码，违背开闭原则
 *  3.Chart负责初始化和显示，违背单一原则
 *  4.客户端只能通过new创建，与客户耦合度高
 *
 * */
public class Chart {
    private String type;   //传入类型

    public Chart(String type){
        this.type = type;
        if("histogram".equalsIgnoreCase(type)){
            System.out.println("圆柱");
        }
        if("pie".equalsIgnoreCase(type)){
            System.out.println("饼状");
        }
    }

    public String initChart(){
        if("histogram".equalsIgnoreCase(this.type)){
            return "初始化圆柱";
        }
        if("pie".equalsIgnoreCase(this.type)){
            return "初始化饼状";
        }
        return "初始化其他";
    }
}
