package array;

/**
 * @Author Wangqi
 * @Date 2021/3/15 9:09
 * 线性查找
 */
public class Test5LineSearch {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = new int[]{1,5,3,2};
        // 目标元素
        int dst = 5;
        // 查找目标元素的下标 找不到就返回-1
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == dst){
                index = i;
                break;
            }
        }
        // 输出查找元素的下标
        System.out.println(index);
    }
}
