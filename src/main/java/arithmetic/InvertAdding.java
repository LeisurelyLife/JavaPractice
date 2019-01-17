package arithmetic;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/08 10:17
 * Editored:
 */
public class InvertAdding {

    public static int count(int i) {
        String s = String.valueOf(i);
        StringBuffer buffer = new StringBuffer(s);
        StringBuffer reverse = buffer.reverse();
        int invert = Integer.parseInt(reverse.toString());

        return invert + i;
    }

    public static void main(String[] args) {
        int i = 100;
        int count = count(i);
        System.out.println(count);
    }

}
