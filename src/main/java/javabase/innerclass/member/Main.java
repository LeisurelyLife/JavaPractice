package javabase.innerclass.member;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/02/26 10:36
 * Editored:
 */
public class Main {

    public static void main(String[] args) {
        test2();
    }

    static void test1() {
        Outer outer = new Outer(1);
        Outer.Draw draw = outer.new Draw();
        draw.drawSahpe();
        draw.setRadius(2);
        System.out.println(draw.getRadius());
        draw.drawSahpe();
    }

    static void test2() {
        Outer outer = new Outer();
        Outer.Param param = outer.new Param();
        param.sout();
    }

    public void test3() {
        Outer outer = new Outer();
//        outer.permission1 = outer.new permission1(); //私有成员不可以访问
        Outer.Permission2 permission2 = outer.new Permission2();//在其他包下不可访问，此句出错
        Outer.Permission3 permission3 = outer.new Permission3();
        Outer.Permission4 permission4 = outer.new Permission4();
    }

}
