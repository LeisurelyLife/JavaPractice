package aop;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/05 10:01
 * Editored:
 */
public class CGLibDynamicProxy implements MethodInterceptor {

    private static CGLibDynamicProxy instance = new CGLibDynamicProxy();

    private CGLibDynamicProxy() {

    }

    public static CGLibDynamicProxy getInstance() {
        return instance;
    }

    public <T> T getProxy(Class<T> cls) {
        return (T) Enhancer.create(cls, this);
    }

    @Override
    public Object intercept(Object target, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if (method.getName().equals("sayHello")) {
            before();
//            Object result = method.invoke(target, args);//暂不知是否可以通过method参数来调用
            Object result = methodProxy.invokeSuper(target, args);
            after();
            return result;
        } else {
//            Object result = method.invoke(target, args);//暂不知是否可以通过method参数来调用
            Object result = methodProxy.invokeSuper(target, args);
            return result;
        }
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}