package PACK3;

import java.util.Random;

public class S6E5_案例3_挑战杯 {
    public static void main(String[] args) {
        Random 随机数 = new Random();
        int int数组[] = new int[10];
        for (int i = 0; i < int数组.length; i++) {
            int数组[i] = 随机数.nextInt(10);
        }

        //计算总分
        int sum = 0;
        for (int i = 0; i < int数组.length; i++) {
            sum += int数组[i];
        }
        System.out.println("总分 = " + sum);

        //计算平均分
        System.out.println("平均分 = " + (double)sum/int数组.length);
    }
}
