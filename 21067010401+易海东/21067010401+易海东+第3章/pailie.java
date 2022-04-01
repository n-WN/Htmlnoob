package uTwo;

public class pailie {
    public static void main(String[] args){
        int a,b,c=0;
        ls: for (a=1;a<=8;a++){
            for(b=1;b<=8;b++){
                c++;
                System.out.print("第"+a+"排"+b+"列："+c);
                if (c==12){
                    break ls;
                }
                System.out.println();

            }
        }
    }
}
