package designMode._01creatorType._01simpleFactory;

/**
 * @author lin
 * @create 2019-10-31-22:32
 * 调用图表
 */
/*
 *当你需要什么，只需要传入一个正确的参数，就可以获取你所需要的对象，
 *而无须知道其创建细节。简单工厂模式结构比较简单，其核心是工厂类的设计*/
public class InvockChart {

    //简单工厂原例调用
    public void invock(){
        Chart chart1 = new Chart("histogram");
        chart1.initChart();
        Chart chart2 = new Chart("");
        chart2.initChart();
    }

    //简单工厂调用
    public void simpleInvock(){
        SimpleChart histogramChart = ChartFactory.getChart("histogram");
        histogramChart.initChart();
    }
}
