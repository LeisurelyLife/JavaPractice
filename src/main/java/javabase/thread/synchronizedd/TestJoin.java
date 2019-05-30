package javabase.thread.synchronizedd;

/**
 * @author ruanting
 * @date 2019/05/30
 */
public class TestJoin implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }

    public static void main(String[] args) throws Exception {
        method1();
    }

    public static void method1() throws InterruptedException {
        TestJoin testJoin = new TestJoin();
        Thread thread1 = new Thread(testJoin, "A");
        Thread thread2 = new Thread(testJoin, "B");
        thread1.start();
        thread2.start();
//        thread1.join();
        System.out.println("im main thread");
    }
}
