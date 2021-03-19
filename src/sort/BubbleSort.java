package sort;

import java.util.Arrays;

/**
 * @Author WangQi
 * @Date 2021/3/17 10:40
 * @Description     冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        // 创建数组
        int[] bubble = new int[]{2,5,87,32,654,67};
        System.out.println(Arrays.toString(bubble));
        BubbleSort.bubbleSort(bubble);
        System.out.println(Arrays.toString(bubble));
    }
    // 冒泡排序方法
    public static void bubbleSort(int[] arr){
        // 控制总共多少轮
        for (int i = 0; i < arr.length - 1; i++){
            // 每轮比较多少次
            for (int j = 0; j < arr.length - 1 - i; j++){
                // 从小到大排序，前一个数大于后一个数就交换
                if (arr[j] > arr [j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
//    // 两数交换方法
//    public static void swap(int i, int j){
//        int temp = i;
//        i = j;
//        j = temp;
//    }
}
