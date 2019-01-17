import interfacePag.Father;

/**
 * Created by Rt on 2018/8/8.
 */
public class TestParam {

    public static void main(String[] args) {
//        Map<String, Object> map = new HashMap<String, Object>();
//        String a = "aaaaa";
//        String b = "nbbbbbb";
//        String c = "ccccccc";
//        String d = "ddddd";
//        String e = (String) map.get("jjjj");
//        String f = "";
//        System.out.println(isEmpty(a));

//        intTest();
    }

    public static boolean isEmpty(String... values) {
        if(values.length < 1) {
            return true;
        }
        for (String value : values) {
            if(value == null || value.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public static void intTest(Father... args) {
        System.out.println(args.length);
    } 

    public static void intTest(String... args) {
        System.out.println("int float...");
    }

//    public static void intTest(Son i) {
//        System.out.println("jjj");
//    }

}
