package PACK3;

import java.util.Scanner;

public class AcWing数组替换 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int[] arr = new int [10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = cin.nextInt();
            if (arr[i] < 1){
                arr[i] = 1;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("X[" + i + "] = "+ arr[i]);
        }
    }
}
