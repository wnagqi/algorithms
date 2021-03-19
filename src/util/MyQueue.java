package util;

/**
 * @Author WangQi
 * @Date 2021/3/19 20:44
 * @Desciption
 */
public class MyQueue {
    int[] elements;
    public MyQueue(){
        elements = new int[0];
    }
    // 入队
    public void add(int element){
        // 创建一个新数组
        int[] newArr = new int[elements.length + 1];
        // 将数组中内容复制到新数组中
        for (int i = 0; i < elements.length; i++){
            newArr[i] = elements[i];
        }
        // 新数组最后一个位置存放要添加的元素
        newArr[elements.length] = element;
        // 新数组替换旧数组
        elements = newArr;
    }
    // 出队
    public int poll(){
        // 取出第一个元素
        int element = elements[0];
        // 创建一个新数组
        int[] newArr = new int[elements.length - 1];
        // 从旧数组的第二个元素开始复制到新数组
        for (int i = 1; i < elements.length; i++){
            newArr[i-1] = elements[i];
        }
        // 新数组替换旧数组
        elements = newArr;
        return element;
    }
    // 判断队列是否为空
    public boolean isEmpty(){
        return elements.length == 0;
    }
}
