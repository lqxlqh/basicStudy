package designMode._01creatorType._01simpleFactory;

/**
 * @author lin
 * @create 2019-10-31-22:51
 */
public class PieChart implements SimpleChart {

    PieChart(){
        System.out.println("饼状");
    }

    @Override
    public String initChart() {
        return "初始化饼状";
    }
}
