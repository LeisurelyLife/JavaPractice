package arithmetic;

import java.util.ArrayList;

/**
 * About:
 * Other:
 * Created: ruanting on 2019/01/09 9:54
 * Editored:
 * Description: 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class FindNumINDoubleDimensionalArray {

    public static boolean find(int[][] array, int num) {
        ArrayList<Integer> two = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == num) {
                return true;
            } else if (array[i][0] < num) {
                two.add(i);
            }
        }
        for (int j = 0; j < two.size(); j++) {
            for (int k = 0; k < array[two.get(j)].length; k++) {
                if (array[two.get(j)][k] == num) {
                    return true;
                }
            }
        }
        return false;
    }

    //推荐的答案是不满足不规则数组的
    public static boolean find2(int [][] array, int target) {
        int row = array.length-1;//行
        int column = 0;//列
        //当行数大于0，当前列数小于总列数时循环条件成立
        while((row >= 0)&& (column< array[0].length)){
            if(array[row][column] > target){
                row--;
            }else if(array[row][column] < target){
                column++;
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] array = {{1, 4, 5, 7}, {3}, {4, 5, 6}};
        boolean b = find(array, 7);
        System.out.println(b);
    }

}
