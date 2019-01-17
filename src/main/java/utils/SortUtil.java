package utils;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/02 9:28
 * Editored:
 */
public class SortUtil {
    public static String ExtrangeString(String source) {
        char[] chars = source.toCharArray();
        int circ = chars.length / 2;
        for(int i = 0; i < circ; i++) {
            char temp = chars[i * 2];
            chars[i * 2] = chars[(i * 2) + 1];
            chars[(i * 2) + 1] = temp;
        }
        return String.valueOf(chars);
    }

    public static String ExtrangeString2(String source) {
        char[] chars = source.toCharArray();
        int circ = chars.length / 2;
        for(int i = 0; i < circ; i++) {
            int pre = i * 2;
            int aft = (i * 2) + 1;
            char temp = chars[pre];
            chars[pre] = chars[aft];
            chars[aft] = temp;
        }
        return String.valueOf(chars);
    }
}
