package designMode._01creatorType._01simpleFactory;

/**
 * @author lin
 * @create 2019-10-31-22:56
 * 简单工厂  -- 工厂类
 */
public class ChartFactory {

    public static SimpleChart getChart(String type){
        SimpleChart simpleChart = null;
        if("histogram".equalsIgnoreCase(type)){
            simpleChart = new HistogramChart();
        } else if("pie".equalsIgnoreCase(type)){
            simpleChart = new PieChart();
        }

        return simpleChart;
    }
}
