package thread;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/03 9:48
 * Editored:
 */
public class SynchronizedTest {

    private static SynchronizedTest synchronizedTest;

    public static SynchronizedTest synchronizedTestPublic = new SynchronizedTest();

    private SynchronizedTest() {
    }

    public static  SynchronizedTest GetInstance(){
        if(synchronizedTest == null) {
            synchronized (SynchronizedTest.class) {
                if(synchronizedTest == null) {
                    synchronizedTest = new SynchronizedTest();
                }
            }
        }
        return synchronizedTest;
    }

    public synchronized void method1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("method1 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public synchronized void method2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("method2 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void method3() {
        for (int i = 0; i < 5; i++) {
            System.out.println("method3 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void staticMethod1() {
        for (int i = 0; i < 5; i++) {
            System.out.println("staticMethod1 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static synchronized void staticMethod2() {
        for (int i = 0; i < 5; i++) {
            System.out.println("staticMethod1 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void staticMethod3() {
        for (int i = 0; i < 5; i++) {
            System.out.println("staticMethod3 is running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {

    }
}
