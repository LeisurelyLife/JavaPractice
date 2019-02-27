package javabase.innerclass.anonymity;

/**
 * About:
 * Other: 如果写的是一个个性化定制的，只在一个场景下使用的，功能限制非常大的，其他地方用不到的
 *  那就可以用匿名类，不需要增加多余的类文件，而且只要在使用类的地方维护代码即可
 * Created: ruanting on 2019/02/27 10:29
 * Editored:
 */
public class Anonymity {

    public static void initListener(Listener listener) {
        listener.onclick();
    }

    public static void main(String[] args) {
        initListener(new Listener() {
            @Override
            public void onclick() {
                System.out.println("Listener Anonymity onClick");
            }
        });

        initListener(new ExtendListener());
        initListener(new ExtendListener() {

        });
        initListener(new ExtendListener() {
            @Override
            public void onclick() {
                System.out.println("ExtendListener Anonymity onClick");
            }
        });
    }

}
