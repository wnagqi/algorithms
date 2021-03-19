package sort;

import util.MyQueue;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author WangQi
 * @Date 2021/3/19 19:10
 * @Desciption      队列实现基数排序
 */
public class radixQueueSort {
    public static void main(String[] args) {
        int[] arr = new int[8];
        for (int x = 0; x < arr.length; x++){
            arr[x] = (int)(Math.random()*80);
        }
        System.out.println(Arrays.toString(arr));
//        Date date1 = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
//        String format1 = simpleDateFormat.format(date1);
//        System.out.println(format1);
        radixSort(arr);
//        Date date2 = new Date();
//        String format2 = simpleDateFormat.format(date2);
//        System.out.println(format2);
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
        // 用队列存储元素
        MyQueue[] myQueue = new MyQueue[10];
        // 给队列赋值
        for (int i = 0; i < myQueue.length; i++){
            myQueue[i] = new MyQueue();
        }
        //  j = 0:个位数求余
        for (int j = 0, n = 1;j < elementLength; j++,n *= 10){
            // 对数组中的数进行求余
            for (int k = 0; k < arr.length; k++){
                // 第一次比较个位数：j=0,n=1;第二次比较十位数：j=1,n=10
                int ys = (arr[k] / n) % 10;
                // 第ys列队列添加元素
                myQueue[ys].add(arr[k]);
//                temp[ys][counts[ys]] = arr[k];
                // ys列+1：表示temp数组中的counts[ys]中有几个元素了
//                counts[ys]++;
            }
            // 表示原数组下标
            int index = 0;
            // counts的长度表示有几个桶，遍历每个桶
            for (int l = 0; l < myQueue.length; l++){
                while (!myQueue[l].isEmpty()){

                        // 把temp中余数为l的第m个元素赋值给原数组
                        arr[index] = myQueue[l].poll();
                        index++;


                }
            }


        }
    }
}
