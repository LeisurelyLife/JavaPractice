package arithmetic;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/08 16:23
 * Editored:
 * Description: 每次往上跳一阶或者两阶台阶，跳n阶台阶有几种跳法
 */
public class JumpFloor {

    public static int recursive(int count) {
        if (count == 1) {
            return 1;
        }
        if (count == 2) {
            return 2;
        }
        return recursive(count - 2) + recursive(count - 1);
    }

    public static int iterator(int count) {
        if (count == 1) {
            return 1;
        }
        if (count == 2) {
            return 2;
        }

        int time = 0;
        int pre = 1;
        int next = 2;
        for (int i = 3; i <= count; i++) {
            time = pre + next;
            pre = next;
            next = time;
        }
        return time;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int fibonacci = iterator(40);
//        int fibonacci = recursive(40);
        long end = System.currentTimeMillis();
        System.out.println(fibonacci);
        System.out.println(end - start);
    }

}
