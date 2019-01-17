package extend;

/**
 * Created by Rt on 2018/7/31.
 */
public class Father {

    private int i;

    public Father(int i) {
        this.i = i;
    }

    public void showInt() {
        System.out.println(i);
    }

    protected void showSelf() {
        System.out.println("i'm father");
    }

    public void doPrivate(Father f) {
        f.i = 3;
    }

    public Father() {
    }
}
