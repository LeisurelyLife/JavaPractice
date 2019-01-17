package arithmetic;

import java.util.Random;

/**
 * Created by Rt on 2018/10/16.
 * 归并排序
 */
public class SortMerger {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10;
        int[] arr = new int[count];
        for(int i = 0; i < count; i++) {
            arr[i] = random.nextInt(100);
        }
        sortMergeRecursionHelper(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void sortMergeRecursionHelper(int[] nums, int left, int right) {
        if(left == right) {
            return ;
        }
        int middle = left + (right - left) / 2;
        sortMergeRecursionHelper(nums, left, middle);
        sortMergeRecursionHelper(nums, middle + 1, right);
        mergeArr(nums, left, middle, right);
    }

    public static void mergeArr(int[] nums, int left, int middle, int right) {
        int[] tem = new int[right - left + 1];
        int i = left, j = middle + 1, k = 0;
        while(i <= middle && j <= right) {
            tem[k++] = nums[i] < nums[j] ? nums[i++] : nums[j++];
        }
        while(i <= middle) {
            tem[k++] = nums[i++];
        }
        while(j <= right) {
            tem[k++] = nums[j++];
        }

        for (int num : tem) {
            nums[left++] = num;
        }
    }


}
