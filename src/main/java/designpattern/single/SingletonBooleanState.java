package designpattern.single;

/**
 * Created by Rt on 2018/7/23.
 * 通过构造器防止反射强行调用私有构造器
 */
public class SingletonBooleanState {

    private static SingletonBooleanState instance = new SingletonBooleanState();

    private static volatile boolean flag = true;

    private SingletonBooleanState() {
        if(flag) {
            flag = false;
        } else {
            throw new RuntimeException("the instance already exit!");
        }
    }

}
