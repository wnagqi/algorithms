package sort;

import java.util.Arrays;

/**
 * @Author WangQi
 * @Date 2021/3/19 16:11
 * @Desciption
 */
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,3,555,1,2,0,2,4,6,8,10};
//        merge(arr,0,2,arr.length-1);
        mergeSort(arr,0,6);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr, int low, int high){
        int middle = (high + low) / 2;
        if(low < high){
            mergeSort(arr, low, middle);
            mergeSort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }
    // 合并方法
    public static void merge(int[] arr, int low, int middle, int high){
        // 创建一个临时数组，存放排序的数组
        int[] temp = new int[high - low + 1];
        // 记录第一个数组中需要遍历的下标
        int i = low;
        // 记录第二个数组中需要遍历的下标
        int j = middle + 1;
        // 记录临时数组的下标
        int index = 0;
        // 比较i和j位置的元素
        while (i <= middle && j <= high){
            // 第一个数组中的元素小于第二个数组元素，将第一个数组元素放入临时数组中，并将下标后移
            if (arr[i] <= arr[j]){
                temp[index] = arr[i];
                i++;
            }else{
                // 第二个数组中的元素小
                temp[index] = arr[j];
                j++;
            }
            // 临时变量下标向后移
            index++;
        }
        // 退出循环条件：有一个数组中元素已经全部放入临时变量
        while (i <= middle){
            // 将第一个数组中剩下的元素存入临时数组
            temp[index] = arr[i];
            i++;
            index++;

        }
        while (j <= high){
            // 将第二个数组中剩下的元素存入临时数组中
            temp[index] = arr[j];
            j++;
            index++;
        }
        // 将临时数组赋给原数组
        for (int n =0; n < temp.length; n++){
            arr[n + low] = temp[n];
        }
    }
}
