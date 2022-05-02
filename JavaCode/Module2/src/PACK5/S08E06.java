package PACK5;

import java.util.Scanner;

public class S08E06 {
    public static void main(String[] args) {
        System.out.printf("请输入整数n:");
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        System.out.println(sum(n));
    }
    public static double sum(int n) {
        int sign = -1;
        double sum = 1.0;
        double under = 1.0;

        for (int i = 2; i <= n; i++) {
            under = 1.0 * 1;
            sum = sum + sign/under;
            sign = sign * (-1);
        }
        return (sum);
    }
}
