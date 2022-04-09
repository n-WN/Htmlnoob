package PACK3;

import java.util.Scanner;

public class S4E4 {
    public static void main(String[] args) {
        System.out.println("开始");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个星期数(1-7):");
        int week = sc.nextInt();

        if (week == 1){
            System.out.println("星期一");
        }
        if (week == 2){
            System.out.println("星期二");
        }
        if (week == 3){
            System.out.println("星期三");
        }
        if (week == 4){
            System.out.println("星期四");
        }
        if (week == 5){
            System.out.println("星期五");
        }
        if (week == 6){
            System.out.println("星期六");
        }
        if (week == 7){
            System.out.println("星期日");
        }
    }
}
