package extend;

/**
 * Created by Rt on 2018/7/31.
 */
public class Son extends Father {
    public Son(int i) {
        super(i);
    }

    @Override
    public void showInt() {
        super.showInt();
    }

    @Override
    protected void showSelf() {
        System.out.println("i'm son");
    }

    public static void main(String[] args) {
        Father son = new Son(1);
        son.showSelf();
    }
}
