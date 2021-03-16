package util;

import java.util.Arrays;

/**
 * @Author Wangqi
 * @Date 2021/3/15 20:53
 * @Discription
 */
public class MyStack {
    // 用数组实现栈
    private int[] elements;
    public MyStack(){
        elements = new int[0];
    }
    // 压栈
    public void push(int element){
        // 创建一个新数组
        int[] newArr = new int[elements.length + 1];
        // 遍历原来的数组
        for (int i = 0; i < elements.length; i++){
            newArr[i] = elements[i];
        }
        // 最后一位赋值
        newArr[elements.length] = element;
        // 替换数组
        elements = newArr;
    }
    // 出栈
    public int pop(){
        if (elements.length == 0){
            throw new RuntimeException("stack为空");
        }
        // 获取原数组中最后一个元素
        int element = elements[elements.length - 1];
        // 创建一个新数组，长度减1
        int[] newArr = new int[elements.length - 1];
        // 遍历原来的数组，复制到新数组
        for (int i = 0; i < elements.length - 1; i++){
            newArr[i] = elements[i];
        }
        // 新数组替换原数组
        elements = newArr;
        // 返回最后一个元素
        return element;
    }
    // 获取最上面的元素
    public int get(){
        // 如果没有元素
        if (elements.length == 0){
            throw new RuntimeException("stack为空");
        }
        // 获取顶部元素
        int element = elements[elements.length - 1];
        // 有元素，返回最顶部元素
        return element;
    }
    // 判定stack是否为空
    public boolean isEmpty(){
        return elements.length == 0;
    }
    // 获取栈中全部数组
    public void show(){
        System.out.println(Arrays.toString(elements));
    }
}
