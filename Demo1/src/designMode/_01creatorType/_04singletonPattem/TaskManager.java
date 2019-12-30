package designMode._01creatorType._04singletonPattem;

/**
 * @author lin
 * @create 2019-12-30
 * @Info(单例模式)
 * @Notes--(最简单的单例类设计
 *          -- 注意：getTaskManaget方法的修饰符，它是一个公共方法，方便其他对象调用，其次它是一个静
 *             态方法，在使用中直接通过类名访问，因为构造函数是私有的，外部无法创建TaskManager对象)
 */
public class TaskManager {
    //私有化对象
    private static TaskManager taskManager = null;
    private TaskManager(){
        //初始化
    }

    //公共静态方法调用，返回对象实例，保证唯一。
    public static TaskManager getTaskManaget(){
        if(taskManager == null){
            taskManager = new TaskManager();
        }
        return taskManager;
    }
}
