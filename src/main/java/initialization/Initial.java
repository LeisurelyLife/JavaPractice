package initialization;

/**
 * Created by Rt on 2018/8/12.
 */
public class Initial {

    public static void main(String[] args) {
        B b = new B();
    }

}

class A {
    A(int con) {
        System.out.println("A initailed" + con);
    }
}

class B {
    B() {
        System.out.println("B constract");
    }
    A a = new A(1);
    static A a2 = new A(2);
    {
        a = new A(4);
    }
    static {
        a2 = new A(3);
    }
}