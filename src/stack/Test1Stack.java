package stack;

import util.MyStack;

/**
 * @Author Wangqi
 * @Date 2021/3/15 22:12
 * @Discription
 */
public class Test1Stack {
    public static void main(String[] args) {
        // 创建一个栈
        MyStack ms = new MyStack();
        // 压栈
        ms.push(33);
        ms.push(44);
        ms.push(55);
        ms.show();
        ms.pop();
        ms.show();
        System.out.println(ms.get());
        boolean flag = ms.isEmpty();
        System.out.println(flag);
        ms.pop();
        ms.show();
        ms.pop();
        ms.show();
    }
}
