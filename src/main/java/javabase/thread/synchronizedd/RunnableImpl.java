package javabase.thread.synchronizedd;

/**
 * @author ruanting
 * @date 2019/05/29
 */
public class RunnableImpl {
}

/**
 * synchronized(this)修饰代码块，锁住了当前对象的当前代码块
 */
class SyncThis implements Runnable {
    private static int count;

    public SyncThis() {
        count = 0;
    }

    public  void run() {
        synchronized(this) {
            for (int i = 0; i < 5; i++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        method2();
    }

    public static void method1() {
        SyncThis syncThis = new SyncThis();
        //同一个对象中的代码块被锁住了
        Thread thread1 = new Thread(syncThis, "SyncThread1");
        Thread thread2 = new Thread(syncThis, "SyncThread2");
        thread1.start();
        thread2.start();
    }

    public static void method2() {
        SyncThis syncThis1 = new SyncThis();
        SyncThis syncThis2 = new SyncThis();
        //因为是不同对象的代码块，所以并发执行
        Thread thread1 = new Thread(syncThis1, "SyncThread1");
        Thread thread2 = new Thread(syncThis2, "SyncThread2");
        thread1.start();
        thread2.start();
    }
}

/**
 *
 */
class Counter implements Runnable{
    private int count;
    private int[] arr1 = {1, 3, 4, 5, 6, 7, 8, 9};
    private int[] arr2 = {10, 30, 40, 50, 60, 70, 80, 90};

    public Counter() {
        count = 0;
    }

    public void countAdd() {
        synchronized(this) {
            for (int i = 0; i < 10; i ++) {
                try {
                    System.out.println(Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //非synchronized代码块，未对count进行读写操作，所以可以不用synchronized
    //此方法和方法一结合起来可以看出synchronized(this)不会对为加锁代码段产生影响
    public void printCount() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + " count:" + count);
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    //此方法与方法一结合，可以看出synchronized(this)会锁住同一对象内的所有用synchronized(this)修饰的代码段
    public void opeArrLockThis() {
        synchronized (this) {
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(Thread.currentThread().getName() + " val:" + arr1[i]);
            }
        }
    }

    //此方法与方法一结合起来看，synchronized(this)修饰代码段不会对synchronized修饰对象产生影响
    public void opeArrLockArr1() {
        synchronized (arr1) {
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(Thread.currentThread().getName() + " val:" + arr1[i]);
            }
        }
    }

    //此方法与上一个方法结合起来判断，通过锁住对象来锁住代码块，不影响其他锁住对象的代码块，运用起来更灵活
    public void opeArrLockArr2() {
        synchronized (arr2) {
            for (int i = 0; i < arr2.length; i++) {
                System.out.println(Thread.currentThread().getName() + " val:" + arr2[i]);
            }
        }
    }

    public void run() {
        //由此可以看到，synchronized修饰的代码块只影响到当前修饰符
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("A")) {
            countAdd();
        } else if (threadName.equals("B")) {
            printCount();
        } else if (threadName.equals("C")) {
            opeArrLockThis();
        } else if (threadName.equals("D")) {
            opeArrLockArr1();
        } else {
            opeArrLockArr2();
        }
    }

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        Counter counter = new Counter();
        Thread thread1 = new Thread(counter, "A");
        Thread thread2 = new Thread(counter, "B");
        Thread thread3 = new Thread(counter, "C");
        Thread thread4 = new Thread(counter, "D");
        Thread thread5 = new Thread(counter, "E");
        thread1.start();
//        thread2.start();
//        thread3.start();
        thread4.start();
        thread5.start();
    }
}

/**
 * synchronized修饰对象方法跟synchronized(this)的效果是一样的
 * 注意：
 * synchronized修饰方法效果是不能被子类继承的
 * 构造方法不能用synchronized修饰，但是可以使用synchronized(this)
 */
class SyncMethod implements Runnable {
    private static int count;

    public SyncMethod() {
        count = 0;
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("A")) {
            syncMehtod1();
        } else if (threadName.equals("B")) {
            syncMehtod2();
        }
    }

    public synchronized void syncMehtod1() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void syncMehtod2() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        method2();
    }

    public static void method1() {
        SyncThis syncThis = new SyncThis();
        //同一个对象中的代码块被锁住了
        Thread thread1 = new Thread(syncThis, "A");
        Thread thread2 = new Thread(syncThis, "B");
        thread1.start();
        thread2.start();
    }

    public static void method2() {
        SyncThis syncThis1 = new SyncThis();
        SyncThis syncThis2 = new SyncThis();
        //因为是不同对象的代码块，所以并发执行
        Thread thread1 = new Thread(syncThis1, "A");
        Thread thread2 = new Thread(syncThis2, "B");
        thread1.start();
        thread2.start();
    }
}

class SyncStaticMethod implements Runnable {
    private static int count;

    public SyncStaticMethod() {
        count = 0;
    }

    public synchronized static void method() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        method();
    }

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        SyncStaticMethod syncStaticMethod1 = new SyncStaticMethod();
        SyncStaticMethod syncStaticMethod2 = new SyncStaticMethod();
        //如果是修饰静态方法，则线程是锁住了这个类，包括这个类的所有实例的这个静态方法区
        Thread thread1 = new Thread(syncStaticMethod1, "A");
        Thread thread2 = new Thread(syncStaticMethod2, "B");
        thread1.start();
        thread2.start();
    }
}

class SyncStaticMethod2 implements Runnable {
    private static int count;

    public SyncStaticMethod2() {
        count = 0;
    }

    public synchronized static void syncMethod() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void notSyncMethod() {
        for (int i = 0; i < 5; i ++) {
            try {
                System.out.println(Thread.currentThread().getName() + ":" + (count++));
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("A")) {
            syncMethod();
        } else if (threadName.equals("B")) {
            notSyncMethod();
        }
    }

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        SyncStaticMethod2 syncStaticMethod1 = new SyncStaticMethod2();
        SyncStaticMethod2 syncStaticMethod2 = new SyncStaticMethod2();
        //可以看到，锁住了静态方法，但是不影响其他对象的非静态方法区
        Thread thread1 = new Thread(syncStaticMethod1, "A");
        Thread thread2 = new Thread(syncStaticMethod2, "B");
        thread1.start();
        thread2.start();
    }
}

/**
 * 跟synchronized(this)是一样的，但是范围更广，是类的所有对象
 */
class SyncClass implements Runnable {
    private static int count;

    public SyncClass() {
        count = 0;
    }

    public void lockClassMethod() {
        synchronized(SyncClass.class) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println("lock" + Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //看到没有影响，如果改为synchronized(SyncClass.class)则两个方法要排队执行
    public void notLockClassMethod() {
        synchronized (this) {
            for (int i = 0; i < 5; i ++) {
                try {
                    System.out.println("notLock" + Thread.currentThread().getName() + ":" + (count++));
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void run() {
        String threadName = Thread.currentThread().getName();
        if (threadName.equals("A")) {
            System.out.println("do a");
            lockClassMethod();
        } else if (threadName.equals("B")) {
            System.out.println("do b");
            notLockClassMethod();
        }
    }

    public static void main(String[] args) {
        method1();
    }

    public static void method1() {
        SyncClass syncClass1 = new SyncClass();
        SyncClass syncClass2 = new SyncClass();
        //可以看到，锁住了静态方法，但是不影响其他对象的非静态方法区
        Thread thread1 = new Thread(syncClass1, "A");
        Thread thread2 = new Thread(syncClass2, "B");
        thread1.start();
        thread2.start();
    }
}
