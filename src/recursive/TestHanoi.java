package recursive;

import java.util.Scanner;

/**
 * @Author WangQi
 * @Date 2021/3/16 23:06
 * @Description     汉诺塔问题
 */
public class TestHanoi {
    static int m;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char A = 'A';
        char B = 'B';
        char C = 'C';
        System.out.println("请输入圆盘的个数");
        int disks = scanner.nextInt();
        TestHanoi.hanoi(disks,A,B,C);
        System.out.println("总共移动了"+m+"次");
        scanner.close();
    }
    public static void move(int disks,char N, char M){

        System.out.println("第"+(++m)+"次移动：把第"+disks+"号盘子从"+N+"柱子移动到"+M+"柱子");
    }
    /**
     *
     * @param n     有几个盘子
     * @param A  起始柱子
     * @param B    中间柱子
     * @param C    目标柱子
     */
    public static void hanoi(int n,char A, char B, char C){
        if (n == 1){
            TestHanoi.move(1,A,C);
        }else {
            // 将n-1个盘子从A移到B，C为辅助柱子
            hanoi(n-1,A,C,B);
            // 将第n个盘子从A移到C
            TestHanoi.move(n,A,C);
            // 再将n-1个盘子从B移到C，A为辅助柱子
            hanoi(n-1,B,A,C);
        }
    }
}
