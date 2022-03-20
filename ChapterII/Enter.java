package ChapterII;

import java.util.Scanner;
//导包
public class Enter {
    public static void main(String[] args) {
//        主函数入口
        Scanner ac = new Scanner(System.in);
//        创建函数
        int B = ac.nextInt();
        int A = ac.nextInt();
        int C = ac.nextInt();
//        接收函数
        int d = A > B ? A : B;
//        假定最大数与第三个数比较
        int s = d > C ? d : C;
//        比较大小
        System.out.println(s);
//        输出最大值：并打印到屏幕上
    }
}
