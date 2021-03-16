package array;

/**
 * @Author Wangqi
 * @Date 2021/3/15 9:14
 * 二分查找
 */
public class Test6BinarySearch {
    public static void main(String[] args) {
        // 二分查找的前提是数组元素顺序排列
        // 创建数组
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        // 创建左、中、右指针
        int begin = 0;
        int end = arr.length-1;
        int mid = (begin + end)/2;
        // 目标元素
        int dst = 9;
        // 记录目标元素下标
        int index = -1;
        // 遍历数组
        while(begin <= end){
            if (dst == arr[mid]){
                index = mid;
                break;
            }
            if (dst > arr[mid]){
                begin = mid +1;
            }else{
                end = mid -1;
            }
            mid = (begin + end)/2;
        }
        System.out.println(index);
    }

}
