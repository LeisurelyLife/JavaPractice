package arithmetic;

import java.util.*;
import java.util.stream.Collectors;

/**
 * About:
 * Other:
 * Created: ruanting on 2018/12/20 11:07
 * Editored:
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int[] result = new int[2];
        for (int i = 0; i < list.size(); i++) {
            Integer num = list.get(i);
            int one = Integer.parseInt(num.toString());
            int two = target - one;
            boolean contains = list.contains(two);
            if(contains) {
                int j = list.indexOf(two);
                if(j != i) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum3(int[] nums, int target) {
        ArrayList<Integer> ints = new ArrayList();
        for(int i = 0; i < nums.length; i++) {
            ints.add(nums[i]);
        }
        for(int j = 0; j < ints.size(); j++) {
            int one = ints.get(j);
            int two = target - one;
            if(ints.contains(two) && ints.indexOf(two) != j) {
                return new int[]{j, ints.indexOf(two)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSum4(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
