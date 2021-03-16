package util;

import java.util.Arrays;

public class MyArray {
    // 用于存储数据的数组
    private int[] elements;
    // 构造方法，默认数组长度为0
    public MyArray(){
        elements = new int[0];
    }
    // 获取数组的长度
    public void size(){
        System.out.println(elements.length);
    }
    // 遍历方法
    public void show(){
        System.out.println(Arrays.toString(elements));
    }
    // 取出指定位置的元素
    public int get(int index){
        // 判断删除下标是否越界
        if(index < 0 || index > elements.length-1){
            throw new RuntimeException("下标越界");
        }
       return elements[index];
    }
    // 添加方法 - 在数组后面添加一个元素
    public void add(int element){
        // 创建一个新的数组
        int[] newArr = new int[elements.length+1];
        // 遍历原数组进行赋值
        for (int i = 0; i < elements.length; i++){
            newArr[i] = elements[i];
        }
        // 把添加的元素放入新数组中
        newArr[elements.length] = element;
        // 使用新数组替换原数组
        elements = newArr;
    }
    // 删除方法 - 删除指定下标元素
    public void delete(int index){
        // 判断删除下标是否越界
        if(index < 0 || index > elements.length-1){
            throw new RuntimeException("下标越界");
        }
        // 创建新数组
        int[] newArr = new int[elements.length-1];
        for (int i = 0; i < newArr.length; i++){
            if (i < index){
                newArr[i] = elements[i];
            }else{
                newArr[i] = elements[i+1];
            }
        }
        // 新数组替换原数组
        elements = newArr;
    }
    // 插入方法 - 在指定下标处插入指定值
    public void insert(int index, int element){
        // 判断删除下标是否越界
        if(index < 0 || index > elements.length-1){
            throw new RuntimeException("下标越界");
        }
        // 创建一个新数组
        int[] newArr = new int[elements.length+1];
        for (int i = 0; i <elements.length; i++){
            if (i < index){
                newArr[i] = elements[i];
            }else{
                newArr[i+1] = elements[i];
            }
        }
        // 给插入处赋值
        newArr[index] = element;
        // 新数组替换原数组
        elements = newArr;
    }
    // 线性查找
    public int lineSearch(int element){
        for (int i = 0; i<elements.length; i++){
            if (element == elements[i]){
                return i;
            }
        }
        return -1;
    }
    // 二分查找
    public int binarySearch(int element){
        int begin = 0;
        int end = elements.length - 1;
        int mid = (begin + end) / 2;
        while (begin <= end){
            if (element == elements[mid]){
                return mid;
            }
            if (element > elements[mid]){
                begin = mid + 1;
            }else{
                end = mid - 1;
            }
            mid = (begin + end) / 2;
        }
        return -1;
    }
}
