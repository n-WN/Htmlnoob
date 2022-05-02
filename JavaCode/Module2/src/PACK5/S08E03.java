package PACK5;

import java.util.Scanner;

public class S08E03 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num1 = cin.nextInt();
        int num2 = cin.nextInt();
        add(num1,num2);
    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}
