package arithmetic;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/22 17:04
 * Editored: 排序算法的各种实现
 */
public class SortAlgorithm {

    /**
     * 冒泡
     * @param arr
     * @return
     */
    public static int[] bubbleSort(int[] arr) {
        int temp;
        for (int i = arr.length - 2; i > 0; i--) {
            boolean con = false;
            for (int j = 0; j <= i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    con = true;
                }
            }
            if (!con) {
                break;
            }
        }
        return arr;
    }

    /**
     * 选择
     * @param arr
     * @return
     */
    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int small = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < small) {
                    small = arr[j];
                    index = j;
                }
            }
            arr[index] = arr[i];
            arr[i] = small;
        }
        return arr;
    }

    /**
     * 插入
     * @param arr
     * @return
     */
    public static int[] insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int index = i;
            while (index > 0 && val < arr[index - 1]) {
                arr[index] = arr[index - 1];
                index--;
            }
            if (index != i) {
                arr[index] = val;
            }
        }
        return arr;
    }

    /**
     * 希尔排序，就是升级的插入排序
     * @param arr
     * @return
     */
    public static int[] shellSort(int[] arr) {
        for (int inc = arr.length / 2; inc > 0; inc /= 2) {
            for (int i = inc; i < arr.length; i++) {
                int val = arr[i];
                int index = i - inc;
                while (index >= 0 && arr[index] > val) {
                    arr[index + inc] = arr[index];
                    index -= inc;
                }
                arr[index + inc] = val;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {15, 50, 74, 88, 91, 66, 36, 88, 23, 13, 22, 17, 56, 57, 52, 59, 80, 78, 73, 19};
//        int[] ints = bubbleSort(arr);
//        int[] ints = selectionSort(arr);
//        int[] ints = insertSort(arr);
        int[] ints = shellSort(arr);
        System.out.println(ints.length);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }

}
