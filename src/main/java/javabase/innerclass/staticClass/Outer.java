package javabase.innerclass.staticClass;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/02/27 10:55
 * Editored:
 */
public class Outer {

    int i = 1;
    static int j = 2;

    static class Inner {
        public void systemout() {
            /*
            静态内部类如静态变量一般，独立于外部类，与外部类实例没有关联，所以不能访问外部类的非static变量
             */
//            System.out.println(i);
            System.out.println(j);
        }
    }

}

class Test {
    public static void main(String[] args) {
        /*
        静态内部类不用实例化外部类就可以直接实例化
         */
        Outer.Inner inner = new Outer.Inner();
    }
}
