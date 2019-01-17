package arithmetic;

import java.text.DecimalFormat;
import java.util.HashSet;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/08 10:49
 * Editored:
 */
public class StringChipAverageLength {

    public static float getherChip(String s) {
        int total = 0;
        int index = 0;
        char[] chars = s.toCharArray();
        StringBuffer buffer = new StringBuffer();
        char c = ' ';
        for (int i = 0; i < chars.length; i++) {
            if (i > 0) {
                if (chars[i] == c) {
                    buffer.append(chars[i]);
                    c = chars[i];
                } else {
                    total += buffer.length();
                    index++;
                    c = chars[i];
                    buffer.setLength(0);
                    buffer.append(chars[i]);
                }
            } else {
                c = chars[i];
                buffer.append(chars[i]);
            }
        }
        total += buffer.length();
        index++;

        DecimalFormat df = new DecimalFormat("0.00");
        String format = df.format((float) total /index);
        return Float.parseFloat(format);
    }

    public static float countAverageLength(HashSet<String> hashSet) {
        int total = 0;
        for (String s : hashSet) {
            total += s.length();
        }
        DecimalFormat df = new DecimalFormat("0.00");
        String format = df.format((float) total / hashSet.size());
        return Float.parseFloat(format);
    }

    public static void main(String[] args) {
        String s = "abcdeaa";
        float v = getherChip(s);
        System.out.println(v);
    }

}
