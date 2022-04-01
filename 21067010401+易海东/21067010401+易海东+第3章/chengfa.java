package uTwo;

public class chengfa {
    public static void main(String[] args){
        int a,b;
        for(a=1;a<=9;a++){
            for(b=1;b<=a;b++){
                System.out.print(a+"*"+b+"="+(a*b)+"\t");//\t空格
            }
            System.out.println();
        }
    }
}
