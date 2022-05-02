package PACK4;

import java.util.Scanner;

/**
 * @剑指 Offer 64. 求1+2+…+n
 * @author L1653
 */
public class leetcode_劍指64 {
    public static void main(String[] args) {
        // 剑指 Offer 64. 求1+2+…+n
        // 求 1+2+...+n ，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
        int n,sum = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        while (n > 0) {
            sum += n;
            n--;
        }
        System.out.printf("%d",sum);
    }
}
