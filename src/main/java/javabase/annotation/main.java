package javabase.annotation;

import java.lang.reflect.Method;

/**
 * Created by Rt on 2018/8/3.
 */
public class main {

    public static void main(String[] args) throws Throwable {
        UseAnnotation ua = new UseAnnotation();
        run(ua);
    }

    public static void run(Object object) throws Throwable {
        Method[] methods = object.getClass().getMethods();
        for (Method method : methods) {
            Test t = method.getDeclaredAnnotation(Test.class);
            if(t != null && t.ignore()) {
                method.invoke(object);
            }
        }
    }

}
