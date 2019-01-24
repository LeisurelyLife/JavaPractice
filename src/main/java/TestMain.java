/**
 * Created by Rt on 2018/7/23.
 */
public class TestMain {

//    private static final Logger logger = LoggerFactory.getLogger(TestMain.class);

    public static void main(String[] args) throws Exception {
        String hello = new String("hello");
        System.out.println(System.identityHashCode(hello));
    }

    public static void method(int a, int b) {

    }

    public static String reverseByRecursive(String str) {
        if(str == null || str.length() == 0) {
            return str;  }
        int len = str.length();
        if(len == 1) {
            return str;
        } else {
            return reverseByRecursive(str.substring(1))+ str.charAt(0);
        }
    }

}
