package arithmetic;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/08 14:21
 * Editored:
 */
public class Fibonacci {

    public static int getFibonacciByIndex(int i) {
        if (i <= 0) {
            return 0;
        }
        if (i == 1 || i == 2) {
            return 1;
        }
        return getFibonacciByIndex(i - 2) + getFibonacciByIndex(i - 1);
    }

    public static int easyMethod(int index) {
        int i = index - 1;
        if (i == 0) {
            return 1;
        }
        int pre = 0;
        int next = 1;
        int fibonacci = 0;
        for (int j = 0; j < i; j++) {
            fibonacci = pre + next;
            pre = next;
            next = fibonacci;
        }

        return fibonacci;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        int fibonacci = getFibonacciByIndex(40);
        int fibonacci = easyMethod(40);
        long end = System.currentTimeMillis();
        System.out.println(fibonacci);
        System.out.println(end - start);
    }

}
