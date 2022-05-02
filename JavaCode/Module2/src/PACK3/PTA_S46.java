package PACK3;

import java.util.Random;
import java.util.Scanner;

public class PTA_S46 {
    public static void main(String[] args) {
        //Random ran  = new Random();
        Scanner cin = new Scanner(System.in);
        int 随机数 = cin.nextInt();

        System.out.println("所获取随机数为" + 随机数);
        System.out.println("它的百位数字为" + 随机数 / 100);
        System.out.println("它的十位数字为" + 随机数 / 10 % 10);
        System.out.println("它的个位数字为" + 随机数 % 10);
    }
}
