package PACK5;

import java.util.Scanner;

public class S08E01 {
    public static void main(String[] args) {
        // main 主方法
        Number ();
    }

    public static void Number () {
        Scanner cin = new Scanner(System.in);
        int number = cin.nextInt();
        if (number % 2 == 0) {
            System.out.println("偶数");
        }
        else {
            System.out.println("奇数");
        }
    }
}
