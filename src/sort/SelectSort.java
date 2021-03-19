package sort;

import java.util.Arrays;

/**
 * @Author WangQi
 * @Date 2021/3/19 14:25
 * @Desciption
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,63,2,32,7,9,12,3};
        selectSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectSort(int[] arr){
        // 遍历整个数组
        for (int i = 0; i < arr.length; i++){
            // 把i处值认为是最小值
            int minIndex = i;
            // 向后遍历
            for (int j = i + 1; j < arr.length; j++){
                // 如果存在比minIndex处值更小的元素，则将此处的下标赋值给minIndex
                if (arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            // 如果minIndex 不等于 i ，说明后面有更小值， 将后面的最小值与之前的交换
            if (minIndex != i){
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
