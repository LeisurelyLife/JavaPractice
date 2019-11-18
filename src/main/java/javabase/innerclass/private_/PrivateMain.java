package javabase.innerclass.private_;

/**
 * @author ruanting
 * @date 2019/11/18
 */
public class PrivateMain {

    public static void main(String[] args) {
        Outer outer = new Outer();
//        Outer.Pri pri = outer.getPri();  私有内部类外部无法获取其类型
        Object pri = outer.getPri();
    }

}
