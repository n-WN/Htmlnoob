package uTwo;

import java.util.Random;
import java.util.Scanner;

public class caishu {
    public static void main(String[] args){
        Random bb=new Random();
        int b=bb.nextInt(100)+1;
        System.out.println(b);
        Scanner aa=new Scanner(System.in);
        System.out.println("请输入a的值");
        int a=aa.nextInt();
        for(;a<b;){
            if(a<b){
                a++;
                System.out.println("你猜的数据小了");
                System.out.println("a为:"+a);
            }
            if(a==b) {
                System.out.println("你猜中了");
            }
        }
        for (;a>b;){
            if (a>b) {
                a--;
                System.out.println("你猜的数据大了");
                System.out.println("a为:"+a);
            }
            if (a==b){
                System.out.println("你猜中了");
            }
        }
        }
    }
