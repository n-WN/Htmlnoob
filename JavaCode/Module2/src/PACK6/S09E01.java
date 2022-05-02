package PACK6;

public class S09E01 {
    public static void main(String[] args) {
        int result1 = sum(10,20);
        System.out.println(result1);

        double result2 = sum(10.0,20.0);
        System.out.println(result2);

        int result3 = sum(10,20,30);
        System.out.println(result3);
    }

    public static int sum(int a,int b) {return a+b;}

    public static double sum(double a,double b) {
        return a + b;
    }

    public static int sum(int a,int b,int c) {return a + b + c;}
}
