package PACK6;

import java.util.Scanner;

public class S09E03 {
    // 案例五
    // 设计一个方法用于数组遍历，要求遍历的结果是在一行上的。
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[scanner.nextInt()];
        // 初始化数组且输入长度
        // int[] arr = {11, 22, 33, 44, 55};
        for (int i = 0; i < arr.length; i++) {
            // 遍历输入
            arr[i] = scanner.nextInt();

        }
        print(arr);
    }

    public static void print(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            // 遍历输出
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
        // 增强型for循环，遍历输出
        System.out.print("[");
        for (int i : arr) {
            if (i == arr[arr.length - 1]) {
                System.out.print(i);
            }
            else {
                System.out.print(i + ",");
            }
        }
        System.out.print("]");
        System.out.println();
    }
}