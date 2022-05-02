package PACK3;

import java.util.Random;
import java.util.Scanner;

public class S5E8 {
    public static void main(String[] args) {
        Random r = new Random();
        int x = r.nextInt(100);
        x++;
        //随机生成一个数赋值到x
        Scanner scan = new Scanner(System.in);
        //输入一个值到a
        for (int i = 0; i < 999; i++) {
            //int a = scan.nextInt();
            int a = r.nextInt(100);
            a++;

            if (a == x) {
                System.out.println("猜对了"+ a);
                break;
            }
            if(a > x) {
                System.out.println("猜大了，再输入试试");
            }
            if(a < x) {
                System.out.println("猜小了，再输入试试");
            }
        }
    }
}
