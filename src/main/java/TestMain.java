import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * Created by Rt on 2018/7/23.
 */
public class TestMain {

//    private static final Logger logger = LoggerFactory.getLogger(TestMain.class);

    public static void main(String[] args) throws Exception {
        Method[] methods = TestMain.class.getMethods();
        Method test = null;
        for (Method method : methods) {
            if (method.getName().equals("test")) {
                test = method;
            }
        }

        Parameter[] parameters = test.getParameters();
        for (Parameter parameter : parameters) {
            System.out.println(parameter);
        }
        System.out.println("------------------");
        Class<?>[] parameterTypes = test.getParameterTypes();
        for (Class<?> parameterType : parameterTypes) {
            System.out.println(parameters);
        }
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

    public void test(String s, int i) {

    }
}
