package javabase.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/03 14:33
 * Editored:
 */
public class FinalTest {

    private static FinalTest finalTest;

    private String name = "one";

    public FinalTest() {
    }

    public static FinalTest getInstance() {
        if (finalTest == null) {
            synchronized (FinalTest.class) {
                if (finalTest == null) {
                    finalTest = new FinalTest();
                }
            }
        }
        return finalTest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) throws Exception {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Thread t1 = new Thread(new Thread1());
        Thread t2 = new Thread(new Thread2());
        executorService.execute(t1);
        Thread.sleep(1000);
        executorService.execute(t2);

        executorService.shutdown();
    }

    private static class Thread1 implements Runnable {
        @Override
        public void run() {
            try {
                final FinalTest instance = FinalTest.getInstance();
                Thread.sleep(5000);
                System.out.println(instance.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Thread2 implements Runnable {
        @Override
        public void run() {
            FinalTest instance = FinalTest.getInstance();
            instance.setName("two");
        }
    }
}

