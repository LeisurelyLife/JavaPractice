package aop;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/05 9:42
 * Editored:
 */
public class Client {

    public static void main(String[] args) {
//        doJDKDynamicProxy();
        doCGLibDynamicProxy();
    }

    public static void doJDKDynamicProxy() {
//        GreetingImpl greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();//被赋值的类型只能是对应类实现的接口类型，getProxy()方法里产生代理类时也需要类的实现接口的参数
        Greeting greeting = new JDKDynamicProxy(new GreetingImpl()).getProxy();
        greeting.sayHello("ruanting");
        greeting.sayGoodby("ruanting");
    }

    public static void doCGLibDynamicProxy() {
        //不论是未实现接口类还是实现接口类都可以
        GreetingImpl proxy = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
        proxy.sayHello("ruanting");
        proxy.sayGoodby("ruanting");

        Greeting proxy2 = CGLibDynamicProxy.getInstance().getProxy(GreetingImpl.class);
        proxy2.sayHello("ruanting");
        proxy2.sayGoodby("ruanting");
    }


}
