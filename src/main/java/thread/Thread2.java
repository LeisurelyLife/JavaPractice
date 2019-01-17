package thread;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/03 10:16
 * Editored:
 */
public class Thread2 implements Runnable {
    @Override
    public void run() {
        FinalTest instance = FinalTest.getInstance();
        instance.setName("two");
    }
}
