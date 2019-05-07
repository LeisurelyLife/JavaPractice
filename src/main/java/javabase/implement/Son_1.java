package javabase.implement;

/**
 * Created by hoval on 2019/04/08.
 */
public class Son_1 implements FInterface_1, FInterface_2 {
    @Override
    public void defaultImpl() {
        //接口冲突，用户可选择重新自己实现，或者再调用父类的实现
        FInterface_1.super.defaultImpl();
    }

    /**
     * 首先接口是不能被实例化的，所以拥有的 常量 应该是static，应该通过接口名来访问
     * 其次接口作为一种模板实现，就应该是作为一个标准，所以应该是一个final
     */
//    void changeFVaule() {
//        FInterface_1.value = 3;
//    }

    public static void main(String[] args) {
        Son_1 son_1 = new Son_1();
        son_1.defaultImpl();
    }
}
