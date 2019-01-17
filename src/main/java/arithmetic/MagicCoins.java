package arithmetic;

import java.util.ArrayList;
import java.util.List;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/08 9:55
 * Editored:
 */
public class MagicCoins {

    public static List calc(int count) {
        ArrayList<Integer> index = new ArrayList<>();
        while (count > 0) {
            int m = count % 2;
            if (m > 0) {
                index.add(1);
                count = (count - 1) / 2;
            } else {
                index.add(2);
                count = (count - 2) / 2;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int count = 11;
        List calc = calc(count);
        for (int i = calc.size() - 1; i >= 0; i--) {
            System.out.println(calc.get(i));
        }
    }
}
