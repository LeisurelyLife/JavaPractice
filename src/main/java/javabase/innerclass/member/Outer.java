package javabase.innerclass.member;

/**
 * About:
 * Other: 探查成员内部类
 * Created: ruanting on 2019/02/26 10:33
 * Editored:
 */
public class Outer {

    private int radius = 1;
    public static int a = 1;

    public Outer(int radius) {
        this.radius = radius;
    }

    public Outer() {

    }

    /*
    成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）
     */
    class Draw {     //内部类
        public void drawSahpe() {
            System.out.println(radius);
            System.out.println(a);
        }

        public int getRadius() {
            return radius;
        }

        public void setRadius(int r) {
            radius = r;
        }
    }

    class Param {
        private int radius = 2;

        public void sout() {
            int radius = 3;
            System.out.println("方法局部" + radius);
            System.out.println("成员类的成员变量" + this.radius);
            System.out.println("外部类的成员变量" + Outer.this.radius);
        }
    }

    private class Permission1 {

    }

    class Permission2 {

    }

    protected class Permission3 {

    }

    public Permission3 getPermission3() {
        return new Permission3();
    }

    public class Permission4 {

    }
}
