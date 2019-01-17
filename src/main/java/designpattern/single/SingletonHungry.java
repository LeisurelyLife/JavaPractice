package designpattern.single;

/**
 * Created by Rt on 2018/7/23.
 * 如果内容大加载慢耗时间
 */
public class SingletonHungry {

    private static SingletonHungry instance = new SingletonHungry();

    private SingletonHungry() {

    }

    public static SingletonHungry getInstance() {
        return instance;
    }

}
