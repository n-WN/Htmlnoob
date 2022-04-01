package uTwo;

import java.util.Scanner;

public class guilv2 {
    public static void main(String[] args){
        int num1=1,num2=1,temp;
        Scanner sc=new Scanner(System.in);
        long num=sc.nextInt();
        for(int i=1;i<num;i++){
            num1+=num2;
            temp=num1;
            num1=num2;
            num2=temp;
        }
        System.out.println("第"+num+"个"+num2);
    }
}
