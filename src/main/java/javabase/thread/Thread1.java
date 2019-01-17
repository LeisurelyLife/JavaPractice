package javabase.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/03 9:38
 * Editored:
 */
public class Thread1 implements Runnable {

    private CyclicBarrier cyclicBarrier;

//    public Thread1(CyclicBarrier cyclicBarrier) {
//        this.cyclicBarrier = cyclicBarrier;
//    }

    @Override
    public void run() {
        try {
            FinalTest instance = FinalTest.getInstance();
            Thread.sleep(5000);
            System.out.println(instance.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
