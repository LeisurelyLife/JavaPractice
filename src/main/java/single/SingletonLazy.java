package single;

/**
 * Created by Rt on 2018/7/23.
 * 用于大并发但是效率低
 */
public class SingletonLazy {

    private static volatile SingletonLazy instance;

    private SingletonLazy() {

    }

    public static synchronized SingletonLazy getInstance() {
        if(instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

}
