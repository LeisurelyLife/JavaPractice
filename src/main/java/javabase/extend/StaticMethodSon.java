package javabase.extend;

/**
 * @author ruanting
 * @date 2019/05/07
 */
public class StaticMethodSon extends StaticMethodFather {
    public static void say() {
        System.out.println("I am son");
    }

    public static void main(String[] args) {
        StaticMethodFather smt = new StaticMethodSon();
        smt.say();
    }
}
