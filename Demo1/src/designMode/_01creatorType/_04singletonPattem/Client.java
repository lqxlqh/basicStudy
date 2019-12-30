package designMode._01creatorType._04singletonPattem;

/**
 * @author lin
 * @create 2019-12-30
 * @Info(单例模式)
 * @Notes--(负载均衡器：测试类)
 */
public class Client {
    public static void main(String[] args) {
        //创建四个LoadBalancer对象，验证单例
        LoadBalancer loadBalancer1,loadBalancer2,loadBalancer3,loadBalancer4;
        loadBalancer1 = LoadBalancer.getLoadBalancer();
        loadBalancer2 = LoadBalancer.getLoadBalancer();
        loadBalancer3 = LoadBalancer.getLoadBalancer();
        loadBalancer4 = LoadBalancer.getLoadBalancer();
        //判断对象唯一
        if(loadBalancer1 == loadBalancer2 && loadBalancer2 == loadBalancer3 && loadBalancer3 ==loadBalancer4){
            System.out.println("服务器负载均衡器具有唯一性");
        }

        //添加服务器
        loadBalancer1.addService("service 1");
        loadBalancer2.addService("service 2");
        loadBalancer3.addService("service 3");
        loadBalancer4.addService("service 4");

        //模拟客户端请求分发
        for (int i = 0; i < 10; i++) {
            String service = loadBalancer1.getService();
            System.out.println("分发请求至服务器："+service);
        }
    }
}
