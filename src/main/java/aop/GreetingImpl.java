package aop;

import org.springframework.stereotype.Component;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/05 9:37
 * Editored:
 */
@Component
public class GreetingImpl implements Greeting {
    @Override
    public void sayHello(String name) {
        System.out.println("hello " + name);
    }

    @Override
    public void sayGoodby(String name) {
        System.out.println("goodby " + name);
    }

    @Override
    public void throwException() {
        System.out.println("throw exception");

        throw new RuntimeException("Error");
    }
}
