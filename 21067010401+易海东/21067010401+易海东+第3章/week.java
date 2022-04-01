package uTwo;

import java.util.Scanner;

public class week {
    public static void main(String[] args){
        System.out.println("开始");
        Scanner sc=new Scanner(System.in);
        //创建对象
        System.out.println("输入星期数");
        int week=sc.nextInt();
        //接受数据
        if(week==1){
            System.out.println("星期一");
        }
         else if(week==2){
             System.out.println("星期二");
        }
        else if(week==3){
            System.out.println("星期三");
        }
        else if(week==4){
            System.out.println("星期四");
        }
        else if(week== 5){
            System.out.println("星期五");
        }
        else if(week==6) {
            System.out.println("星期六");
        }
        else if(week==7){
            System.out.println("星期天");
        }
        else{
            System.out.println("错误");
        }
        System.out.println("结束");
    }
}
