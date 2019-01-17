package arithmetic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * About:
 * Other:
 * Created: ruanting on 2018/12/21 10:56
 * Editored:
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        List<Character> arrayList = new ArrayList<>();
        int length = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            int indexOf = arrayList.indexOf(chars[i]);
            if(indexOf >= 0) {
                int size = arrayList.size();
                if(size > length) {
                    length = size;
                }
                arrayList = arrayList.subList(indexOf + 1, arrayList.size());
            }
            arrayList.add(chars[i]);
        }
        int size = arrayList.size();
        if(size > length) {
            length = size;
        }
        return length;
    }

    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }

    public int lengthOfLongestSubstring3(String s) {
        int n = s.length(), ans = 0;
        int[] index = new int[128]; // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }
}
