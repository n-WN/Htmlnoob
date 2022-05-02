package PACK3;

import java.util.Scanner;

public class S6E4_案例2_平均值 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int 长度 = 10;
        double[] 双精度数字 = new double [长度];
        for (int i = 0; i < 双精度数字.length; i++) {
            //遍历读入长度个双精度数字
            双精度数字[i] = cin.nextDouble();
            System.out.println(双精度数字[i]);
        }

        double 平均值,sum = 0;
        for (int i = 0; i < 双精度数字.length; i++) {
            //求出平均值
            sum += 双精度数字[i];
        }
        平均值 = sum/ 双精度数字.length;
        System.out.println("平均值 = " + "\t" + 平均值);
        //制表符？ \t
        int num = 0;
        //double num = 0;
        for (int i = 0; i < 双精度数字.length; i++) {
            //找出有多少个数字在平均值之上
            if (双精度数字[i] > 平均值) {
                num ++;
                System.out.println(双精度数字[i] + "大于平均值");
            }
        }
        System.out.println("有" + num + "个数字在平均值之上");
    }
}
