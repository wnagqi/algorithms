package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Test2OpArray {
    public static void main(String[] args) {
        // 解决数据元素无法改变的问题
        int[] arr = new int[]{1,2,3,4};
        // 快速遍历 Arrays.toString()
        System.out.println(Arrays.toString(arr));
        // 问题: 在原数组中添加一个值
        int dst = 100;
        // 创建一个新数组
        int[] newArr = new int[arr.length+1];
        // 原数组中元素复制到新数组中
        for (int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        // 目标值添加到新数组中
        newArr[arr.length] = dst;
        // 新数组转化成原数组
        arr = newArr;
        System.out.println(Arrays.toString(arr));

    }
}
