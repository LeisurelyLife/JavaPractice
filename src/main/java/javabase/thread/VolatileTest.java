package javabase.thread;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/03 15:44
 * Editored:
 */
public class VolatileTest {
    private static class RunThread extends Thread {
        private boolean isRunning = true;
        int i = 0;

        public boolean isRunning() {
            return isRunning;
        }

        public void setRunning(boolean running) {
            isRunning = running;
        }

        @Override
        public void run() {
            System.out.println("into run");
            while (isRunning) {
                int a = 2;
                int b = 3;
                int c = a + b;
                i = c;
                System.out.println(i);
            }
            System.out.println(i);
            System.out.println("Thread will stop!");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        RunThread runThread = new RunThread();

        runThread.start();
        Thread.sleep(1000);
        runThread.setRunning(false);
        System.out.println("update isRunning to false");
        System.out.println(runThread.isRunning());
    }
}
