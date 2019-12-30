package designMode._01creatorType._04singletonPattem;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author lin
 * @create 2019-12-30
 * @Info(单例模式)
 * @Notes--(负载均衡器的设计与实现)
 */
//负载均衡器LoadBalancer：单例类
public class LoadBalancer {
    //私有静态成员变量，存储唯一实例
    private static LoadBalancer loadBalancer = null;
    //服务器集合
    private List<String> serviceList = null;

    //私有构造函数
    private LoadBalancer(){
        serviceList = new ArrayList<String>();
    }

    //公有静态成员方法，返回唯一实例
    public static LoadBalancer getLoadBalancer(){
        if(loadBalancer == null){
            loadBalancer = new LoadBalancer();
        }
        return  loadBalancer;
    }

    //添加服务器
    public void addService(String service){
        serviceList.add(service);
    }

    //删除服务器
    public void removeService(String service){
        if (serviceList.contains(service)){
            serviceList.remove(service);
        }
    }

    //获取服务器服务
    public String getService(){
        Random random = new Random();
        int i = random.nextInt(serviceList.size());
        return serviceList.get(i);
    }
}
