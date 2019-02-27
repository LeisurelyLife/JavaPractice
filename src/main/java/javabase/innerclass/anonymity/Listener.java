package javabase.innerclass.anonymity;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/02/27 10:29
 * Editored:
 */
public interface Listener {
    void onclick();
}

class ExtendListener implements Listener {

    @Override
    public void onclick() {
        System.out.println("ExtendListener onClick");
    }
}
