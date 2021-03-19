package sort;

import java.util.Arrays;

/**
 * @Author WangQi
 * @Date 2021/3/18 11:15
 * @Desciption      快速排序
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{1,5,63,2,32,7,9,12,3};
        quickSort(arr,0,arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     *
     * @param arr
     * @param start     开始位置，左指针指向处
     * @param end       结束位置，右指针指向处
     */
    public static void quickSort(int[] arr, int start, int end){
        if(start < end){
            // 确立比较的基数值，使用数组的第一个元素
            int standard = arr[start];
            // 使用两个变量作为指针，表示比较时的位置;初始时一个在最左边，一个在最右边
            int low = start;
            int high = end;
            // 进行循环遍历比较，当指针重合时跳出循环
            while (low < high){
                // 右边的数大于基准值，右边指针向左挪动一位
                while (low < high && arr[high] >= standard){
                    high--;
                }
                // 否则就将右边的数替换左边的数
                arr[low] = arr[high];
                // 此时从左边开始比较，左边的数小于等于基准值，左边指针向右挪动一位
                while (low < high && arr[low] <= standard){
                    low++;
                }
                // 否则左边的数替换右边的数
                arr[high] = arr[low];
            }
            // 跳出循环，代表两指针位置重合,将标准值赋值到此处
            arr[low] = standard;
            // 处理所有小于标准值的数
            quickSort(arr,start,low);
            // 处理所有大于标准值的数
            quickSort(arr,low+1,end);

        }

    }
}
