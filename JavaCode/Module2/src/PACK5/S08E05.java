package PACK5;

import java.util.Scanner;

public class S08E05 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.printf("加起来就是 %d",sumAdd(n));

        // 测试变量接受
        int sum1 = sumAdd(n);
        System.out.printf("加起来就是 %d",sum1);
    }

    public static int sumAdd(int n1) {
        int num,sum = 0;
        for (int i = 1; i <= n1; i++) {
            num = i * 10 + 2;
            sum += num;
        }
        return sum;
    }
}
