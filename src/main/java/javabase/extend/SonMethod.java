package javabase.extend;

/**
 * @author ruanting
 * @date 2020/04/01
 */
public class SonMethod extends FathMethod {
    @Override
    public void showStr() {
        System.out.println("son");
    }

    public static void main(String[] args) {
        SonMethod sonMethod = new SonMethod();
        sonMethod.doShow();
    }
}
