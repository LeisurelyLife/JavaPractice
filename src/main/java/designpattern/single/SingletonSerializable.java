package designpattern.single;

import java.io.Serializable;

/**
 * Created by Rt on 2018/7/23.
 */
public class SingletonSerializable implements Serializable {

    public static SingletonSerializable instance = new SingletonSerializable();

    protected SingletonSerializable() {

    }

    //反序列时直接返回当前INSTANCE  ？？？？？存疑
    private Object readResolve() {
        return instance;
    }

}
