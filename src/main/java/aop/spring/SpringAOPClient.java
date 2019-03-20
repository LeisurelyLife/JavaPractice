package aop.spring;

import aop.Greeting;
import aop.GreetingImpl;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/05 11:13
 * Editored:
 */
public class SpringAOPClient {
    public static void main(String[] args) {
//        do1();
//        do2();
        doByXML();
    }

    public static void do1() {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingBeforeAdvice());
        proxyFactory.addAdvice(new GreetingAfterAdvice());

        Greeting proxy = (Greeting) proxyFactory.getProxy();
        proxy.sayHello("ruanting");
        proxy.sayGoodby("ruanting");
    }

    public static void do2() {
        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(new GreetingImpl());
        proxyFactory.addAdvice(new GreetingAroundAdvice());

        Greeting proxy = (Greeting) proxyFactory.getProxy();
        proxy.sayHello("ruanting");
        proxy.sayGoodby("ruanting");
    }

    public static void doByXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring/spring.xml"); // 获取 Spring Context
        Greeting greeting = (Greeting) context.getBean("greetingProxy");// 从 Context 中根据 id 获取 Bean 对象（其实就是一个代理）
        greeting.sayHello("Jack");
    }
}
