package javabase.innerclass.member.extend;

import javabase.innerclass.member.Outer;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/02/26 11:28
 * Editored:
 */
public class TestExtend extends Outer {
    public void testExtend() {
        Outer outer = new Outer();

        Outer.Permission3 permission3 = outer.getPermission3();
        /*
        下句是错误的，TestExtend继承了Outer，所以可以访问Outer里的protected权限的Permission3类
        但Permission3类的默认构造方法跟类一样是protected的，即只有继承了getPermission3才可以访问构造方法
        但是成员内部类只能被相同外部类里面的内部类继承，在其他地方是不能被继承的
        有两个方法实例化permission3
        1.在Outer里实例化，对外提供获取对象的接口
        2.添加public权限的构造方法
         */
//        permission3 = outer.new Permission3();

    }
}
