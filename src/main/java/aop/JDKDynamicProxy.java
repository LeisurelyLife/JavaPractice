package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/05 9:38
 * Editored:
 */
public class JDKDynamicProxy implements InvocationHandler {

    private Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //动态代理后，实际执行方法的地方，切入了增强的代码
        //可以选择性的对某些方法进行增强
        if (method.getName().equals("sayHello")) {
            before();
            Object result = method.invoke(target, args);
            after();
            return result;
        } else {
            Object result = method.invoke(target, args);
            return result;
        }
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    private void before() {
        System.out.println("before");
    }

    private void after() {
        System.out.println("after");
    }
}
