package sort;

import java.util.Arrays;

/**
 * @Author WangQi
 * @Date 2021/3/18 22:09
 * @Desciption      插入排序：插入排序有一个缺点，如果后面添加一个比较小的数，执行排序较慢
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2,45,6,8,12,43,7,3};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
        例如：遍历到arr中的第三个元素6，就先把6赋值给temp
             向前遍历，发现45比6大，就把45向后挪动，此时{2,45,45,8,12,43,7,3}
             再向前一位，发现2比6小，就不挪动，此时指针指向2，把临时变量temp赋值指针后一位处，即45替换为6
             此时{2,6,45,8,12,43,7,3}
             依次往下遍历第四个元素……
     */
    public static void insertSort(int[] arr){
        // 从数组的第二个元素开始遍历，与前一个元素比较
        for (int i = 1; i < arr.length; i++){
            // 如果发现当前元素小于前一个数
            if(arr[i] < arr[i - 1]){
                // 就把当前元素值先赋值给一个临时变量,放到一边
                int temp = arr[i];
                int j;
                // 向前遍历第i个数之前的数
                for (j = i-1; j >= 0 && temp < arr[j]; j--){
                    // 将值比temp大的向后挪动一位
                        arr[j+1] = arr[j];
                }
                // 最后将temp赋值给arr[j+1]
                arr[j+1] = temp;
            }
        }
    }
}
