package javabase.innerclass.part;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/02/27 10:12
 * Editored:
 */
public class Part {

}

class Animal {

}

class AnimalShop {
    int j;

    public Animal getDag() {
        int i = 0;
        final class Dog extends Animal {
            /*
            局部内部类，跟局部变量一样，不能有public、protected、private以及static修饰符。
            只在作用域里面有效
            可用final修饰，同样代表不可被继承
             */
            public void eat() {
                /*
                局部类和匿名类使用到局部变量时，因为方法栈的生命周期与实例对象不同，所以实际上确定的值如int i = 0；会在编译器就写入
                对象的常量池中，而不确定的值如方法的形参，就在创建对象的时候传入，最后局部类和匿名类对象使用的都是对局部变量的拷贝

                因为是数据的拷贝所以存在数据一致性问题，所以要求局部类和匿名类使用的局部变量必须用final修饰
                java8 没有了关键字的修饰，但实际上编译期还是加上了final的修饰，并且虽然没有final的修饰，但是在局部类和匿名类内部是不允许
                改变局部变量的值的，即保证变量的effectively final
                 */
//                i++;
                System.out.println(i);
            }
        }
        return new Dog();
    }
}