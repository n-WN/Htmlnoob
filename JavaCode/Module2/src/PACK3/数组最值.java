package PACK3;

import java.util.Scanner;

public class 数组最值 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int 长度 = 5;
        int[]  arr = new int[长度];
        for (int i = 0; i < 长度; i++) {
            //读入数据到数组
            arr[i] = sc.nextInt();
            System.out.println(arr[i]);
        }

        //int a, b, 工具数;
        int max = arr[0];
        for (int j = 0; j < arr.length; j++) {
            //进行一个 最大值的求
            if (arr[j] > max) {
                //求出最大值
                max = arr[j];
            }
        }
        System.out.println();
        System.out.println(max);
        //System.out.println(a + " " + b);
    }
}
