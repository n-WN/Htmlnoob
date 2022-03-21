package grammer_demo;

import java.util.Scanner;

public class cegao {
    public static void main(String[] args){
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int c=x.nextInt();

        int max=a>b?a:b;
        int max1=max>c?max:c;
        System.out.println("最高身高"+max1);
    }

}
