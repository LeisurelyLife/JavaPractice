package arithmetic;

import java.util.ArrayList;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/09 10:58
 * Editored:
 * Description: 输入一个整数数组，实现一个函数来调整该数组中数字的顺序
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class ClearOddAndEvenNum {

    //自己写的，性能极其低下
    public static Integer[] clear(int[] array) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for (int i : array) {
            if ((i & 1) == 1) {
                odd.add(i);
            } else {
                even.add(i);
            }
        }
        odd.addAll(even);

        return odd.toArray(new Integer[0]);
    }

    public static int[] clear2(int[] array) {
        //如果数组长度等于0或者等于1，什么都不做直接返回
        if(array.length==0||array.length==1)
            return array;
        //oddCount：保存奇数个数
        //oddBegin：奇数从数组头部开始添加
        int oddCount=0,oddBegin=0;
        //新建一个数组
        int[] newArray=new int[array.length];
        //计算出（数组中的奇数个数）开始添加元素
        for(int i=0;i<array.length;i++){
            if((array[i]&1)==1) oddCount++;
        }
        for(int i=0;i<array.length;i++){
            //如果数为基数新数组从头开始添加元素
            //如果为偶数就从oddCount（数组中的奇数个数）开始添加元素
            if((array[i]&1)==1)
                newArray[oddBegin++]=array[i];
            else newArray[oddCount++]=array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        long start = System.nanoTime();
        Integer[] clear = clear(array);
        long end = System.nanoTime();
        for (Integer integer : clear) {
            System.out.println(integer);
        }
        System.out.println(end - start);

//        long start = System.nanoTime();
//        int[] ints = clear2(array);
//        long end = System.nanoTime();
//        for (int anInt : ints) {
//            System.out.println(anInt);
//        }
//        System.out.println(end - start);
    }

}
