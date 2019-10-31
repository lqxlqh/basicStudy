package designMode._01creatorType._01simpleFactory;

/**
 * @author lin
 * @create 2019-10-31-22:48
 * 具体产品角色  --是简单工厂模式的创建目标，都继承了抽象类
 */
public class HistogramChart implements SimpleChart {

    HistogramChart(){
        System.out.println("圆柱");
    }
    @Override
    public String initChart() {
        return "初始化圆柱";
    }
}
