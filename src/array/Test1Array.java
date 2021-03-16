package array;

public class Test1Array {
    public static void main(String[] args){
        // 创建数据
        int[] arr = new int[3];
        // 赋值
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // 遍历，获取数组元素
        for (int i = 0;i < arr.length; i++){
            System.out.println("arr element" + i + ":" + arr[i]);
        }

        // 创建数组时直接赋值
        int[] arr1 = new int[]{9,8,7,6,5};
        // 遍历数组
        for (int i = 0; i < arr1.length; i++){
            System.out.println("arr1 element" + i + ":" + arr1[i]);
        }

    }
}
