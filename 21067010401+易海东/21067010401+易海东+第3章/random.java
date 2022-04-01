package uTwo;

import java.util.Random;

public class random {
    public static void main(String[] args){
        Random r=new Random();
        //创建对象
        for(int i=0;i<10;i++){
            // 用循环获取十个随机数
            int num=r.nextInt(10);
            System.out.println("num:"+num);
        }
        int x=r.nextInt(100)+1;
        //获取一个1-100间的随机数
        System.out.println(x);
    }
}
