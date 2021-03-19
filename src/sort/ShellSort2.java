package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author WangQi
 * @Date 2021/3/19 13:41
 * @Desciption      希尔排序——移位法 （类似插入排序）
 */
public class ShellSort2 {
    public static void main(String[] args){
        // 测试八万个数据
        int[] arr = new int[80000];
        for (int i = 0;i<arr.length;i++){
            // 生成【0,80000）的数
            arr[i] = (int)(Math.random()*800000);
        }
//        System.out.println(Arrays.toString(arr));
        // 设置时间
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);


        shellSort2(arr);
        // 排序后时间
        Date date2 = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format2 = simpleDateFormat.format(date2);
        System.out.println(format2);
//        System.out.println(Arrays.toString(arr));

    }
    public static void shellSort2(int[] arr){
        // 按步长分组
        for(int d = arr.length/2; d > 0; d /=2){
            // 遍历每一组
            for (int i = d; i < arr.length; i++){
                // 对每组中的数进行插入排序
                // 把第i个数作为一个基准值，与前面的比较
                int j = i;
                int temp = arr[j];
                // 如果第j个数小于第j-d个数
                if (arr[j] < arr[j - d]){
                    while (j - d >= 0 && temp <arr[j - d]){
                        arr[j] = arr[j - d];
                        j -= d;
                    }
                    arr[j] = temp;
                }

            }
        }
    }
}
