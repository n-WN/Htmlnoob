package PACK3;

import java.util.Scanner;

public class S6E6_案例4_三科成绩 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int [3];
        for (int i = 0; i < 3; i++) {
            //读入3个数
            arr[i] = cin.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总分" + sum);
    }
}
