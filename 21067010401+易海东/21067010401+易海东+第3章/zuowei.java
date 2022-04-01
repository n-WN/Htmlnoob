package uTwo;

import java.util.Random;

public class zuowei {
    public static void main(String[] args){
        int a,b;
        for(a=1;a<=4;a++){
            for(b=1;b<=10;b++){
                if(b==1||b==10){
                    continue;
                }
                System.out.println("第"+a+"行"+b+"列可售");
            }
        }
    }
}
