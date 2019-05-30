package javabase.thread.wait;

/**
 * @author ruanting
 * @date 2019/05/29
 */
public class Lock {
    public static boolean flag = true;
    public static void whileMethod() {
        while (flag) {

        }
    }
    public static void saySomething(String name) {
        System.out.println("hey" + name);
    }
}
