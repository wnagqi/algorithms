package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @Author WangQi
 * @Date 2021/3/19 12:24
 * @Desciption      希尔排序——交换法
 */
public class ShellSort1 {
    public static void main(String[] args) {
//        int[] arr = new int[]{2,4,5,7,8,54,1,3,0};
        // 测试八万个数据
        int[] arr = new int[80000];
        for (int i = 0;i<arr.length;i++){
            // 生成【0,80000）的数
            arr[i] = (int)(Math.random()*800000);
        }
        // 设置时间
        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format1 = simpleDateFormat.format(date1);
        System.out.println(format1);

        shellSort1(arr);
        // 排序后时间
        Date date2 = new Date();
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String format2 = simpleDateFormat.format(date2);
        System.out.println(format2);
    }
    public static void shellSort1(int[] arr){
        int temp = 0;
        int count = 1;
        // 确立步长d
        for (int d = arr.length/2; d > 0; d /= 2){

            // 根据步长分组
            for (int i = d; i < arr.length; i++){
                // 每一组中当前数大于后面元素，就交换
                for (int j = i-d;j >= 0; j -= d){
                    if (arr[j] > arr[j+d]){
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
//            System.out.println("第"+count+"次排序结果："+Arrays.toString(arr));
            count++;
        }
        System.out.println("最终排序结果："+Arrays.toString(arr));
    }
}
