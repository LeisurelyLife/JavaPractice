package single;

/**
 * Created by Rt on 2018/7/23.
 * 通过双重检查锁提高效率
 * 重点是volatile关键字，1表示该变量发生变化马上从工作内存写入到主存，2表示禁止指令重排序优化
 */
public class SingletonCheckDoubleLock {

    private static volatile SingletonCheckDoubleLock instance = null;

    private SingletonCheckDoubleLock() {

    }

    public static SingletonCheckDoubleLock getInstance() {
        if(instance == null) {
            synchronized(SingletonCheckDoubleLock.class) {
                if(instance == null) {
                    instance = new SingletonCheckDoubleLock();
                }
            }
        }
        return instance;
    }

}
