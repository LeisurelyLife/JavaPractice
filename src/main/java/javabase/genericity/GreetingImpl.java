package javabase.genericity;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/03/04 15:41
 * Editored:
 */
public class GreetingImpl implements Greeting {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello! " + name);
    }

}
