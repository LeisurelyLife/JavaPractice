package designpattern.single;

/**
 * Created by Rt on 2018/7/23.
 * 避免静态实例在类加载阶段就创建对象
 */
public class SingletonInner {

    private static class Holder {
        private static SingletonInner instance = new SingletonInner();
    }

    private SingletonInner(){}

    public static SingletonInner getInstance() {
        return Holder.instance;
    }

}
