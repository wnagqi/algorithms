package recursive;

/**
 * @Author WangQi
 * @Date 2021/3/16 22:39
 * @Description     斐波那契数列
 */
public class Test1Febonacci {
    public static void main(String[] args) {
        int f = febonacci(-1);
        System.out.println(f);
    }

    public static int febonacci(int i){
        if (i < 1){
            throw new RuntimeException("请输入大于0的自然数");

        }
        if (i == 1 || i == 2){
            return 1;
        }else{
            return febonacci(i-1) + febonacci(i-2);
        }
    }
}
