package javabase.exception;

/**
 * 结论：try下有finally时，在执行return前，一定会执行finally中的代码，并将返回的值暂存。
 *      如果finally中有return语句，则return发生在finally中，try中的return不执行
 *      如果finally中没有return语句，则执行try中的return。此时，return后的语句都是已经被执行（见方法d）,然后将返回结果暂存，所以finally
 *      中的代码不会对try中的返回值造成影响。
 * @author ruanting
 * @date 2019/05/08
 */
public class TryAndFinally {
    String s;
    int i;
    public static void main(String[] args) {
        TryAndFinally tf = new TryAndFinally();
        System.out.println(tf.a());
        System.out.println(tf.s);
        System.out.println("---------------");
        System.out.println(tf.b());
        System.out.println(tf.i);
        System.out.println("---------------");
        System.out.println(tf.c());
        System.out.println(tf.i);
        System.out.println("---------------");
        System.out.println(tf.d());
        System.out.println(tf.i);
    }

    public String a() {
        try {
            s = new String("init");
            return s;
        } finally {
            s = new String("change");
        }
    }

    public int b() {
        try {
            i = 1;
            return i;
        } finally {
            i = 2;
        }
    }

    public int c() {
        try {
            i = 1;
            return i;
        } finally {
            i = 2;
            return i;
        }
    }

    public int d() {
        try {
            i = 1;
            return e();
        } finally {
            i = 3;
        }
    }

    public int e() {
        System.out.println("method e");
        return 88;
    }
}
