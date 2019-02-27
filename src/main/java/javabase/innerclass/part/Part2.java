package javabase.innerclass.part;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/02/27 14:46
 * Editored:
 */
public class Part2 {
    public static void main(String[] args) {
        Count count = new Count();
        People people = new People();
        People.Men men = people.new Men();
        men.say(count);
        count.i = 2;
    }
}

class People {
    public class Men {
        public void say(Count c) {
            System.out.println(c.i);
            new Thread() {
                public void run() {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    c = new Count();
                    c.i = 3;
                    System.out.println(c.i);//引用类型与基本数据类型的值都是是不允许修改的，但是可以对引用的对象进行修改操作
                };
            }.start();
        }
    }
}

class Count {
    public int i;
}
