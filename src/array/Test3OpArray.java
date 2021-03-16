package array;

import java.util.Arrays;

public class Test3OpArray {
    public static void main(String[] args) {
        // 解决删除一个元素的问题
        int[] arr = new  int[]{4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        // 问题：删除下标为5的元素
        int del = 5;
        // 创建一个新元素 长度为原始长度-1
        int[] newArr = new int[arr.length-1];
        for (int i = 0; i<newArr.length; i++){
            if (i<del){
                // 删除元素位置之前的数直接复制到新数组
                newArr[i] = arr[i];
            }else{
                // 删除元素位置之后的数，原数组中的元素向前挪动一位
                newArr[i] = arr[i+1];
            }
        }
        // 原数组转化为新数组
        arr = newArr;
        System.out.println(Arrays.toString(arr));
    }
}
