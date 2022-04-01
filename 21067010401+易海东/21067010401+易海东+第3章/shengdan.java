package uTwo;

import java.util.Scanner;

public class shengdan {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int a,b,c;
        for(a=1;a<=i;a++) {
            for (b = 0; b <= i - a; b++) {
                System.out.print(" ");
            }
            for (c = 1; c <= 2 * a - 1; c++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
