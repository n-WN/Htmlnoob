package PACK3;

import java.util.Scanner;

public class S4E5 {
    public static void main(String[] args) {
        System.out.println("小明油，想要多少分");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 100) {
            System.out.println("桃子");
        }
        else if (a == 100){
            System.out.println("你小子胆子真大");
        }
        else if (a < 100){
            System.out.println("大嘴巴子");
        }
    }
}