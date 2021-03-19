package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author WangQi
 * @Date 2021/3/19 19:10
 * @Desciption      基数排序
 */
public class radixSort {
    public static void main(String[] args) {
        int[] arr = new int[800000];
        for (int x = 0; x < arr.length; x++){
            arr[x] = (int)(Math.random()*8000000);
        }
        System.out.println(Arrays.toString(arr));
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);
        radixSort(arr);
        Date date2 = new Date();
        String format2 = simpleDateFormat.format(date2);
        System.out.println(format2);
        System.out.println(Arrays.toString(arr));

    }
    public static void radixSort(int[] arr){
        // 计算数组中最大数
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        // 计算最大数是几位数
        int elementLength = (max + "").length();
         // 创建一个二维数组临时存储数据,10表示10中余数共10个桶，arr.length表示每个桶中最多放的元素个数
        int[][] temp = new int[10][arr.length];
        // 用来计数每种桶中已经存了多少个元素
        int[] counts = new int[10];
        //  j = 0:个位数求余
        for (int j = 0, n = 1;j < elementLength; j++,n *= 10){
            // 对数组中的数进行求余
            for (int k = 0; k < arr.length; k++){
                // 第一次比较个位数：j=0,n=1;第二次比较十位数：j=1,n=10
                int ys = (arr[k] / n) % 10;
                // 第ys行第counts[ys]列放入一个数
                temp[ys][counts[ys]] = arr[k];
                // ys列+1：表示temp数组中的counts[ys]中有几个元素了
                counts[ys]++;
            }
            // 表示原数组下标
            int index = 0;
            // counts的长度表示有几个桶，遍历每个桶
            for (int l = 0; l < counts.length; l++){
                // 如果某桶中元素个数大于0，则遍历取出
                if (counts[l] > 0){
                    // 循环取出元素count[l]表示最多取出多少个
                    for (int m = 0; m < counts[l]; m++){
                        // 把temp中余数为l的第m个元素赋值给原数组
                        arr[index] = temp[l][m];
                        index++;
                    }
                    // 取完后将counts置空：表示桶里没有元素了
                    counts[l] = 0;
                }
            }


        }
    }
}
