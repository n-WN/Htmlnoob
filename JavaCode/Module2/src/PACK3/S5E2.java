package PACK3;

import java.util.Scanner;

public class S5E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int 行数 = 1;行数 <= num;行数++){
            for (int 空格 = 1; 空格 <= num - 行数;空格++)
            {
                System.out.print(" ");
            }
            for (int 星号 = 1;星号 <= 2 * 行数 - 1;星号 ++){
                System.out.print("*");
            }
            System.out.println();
            //格式 输出换行
        }
    }
}
