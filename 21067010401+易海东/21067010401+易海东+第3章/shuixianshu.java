package uTwo;

public class shuixianshu {
    public static void main(String[] args){
        int i=0;
        int num,a,b,c;
        for(num=100;num<1000;num++){
            a=num/100;
            b=num%100/10;
            c=num%10;
            if(num==a*a*a+b*b*b+c*c*c){
                i++;
                System.out.println(num);
            }
        }
    }
}
