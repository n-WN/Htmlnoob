package grammer_demo;

public class zidong {
    public static void main(String[] args){
        byte b = 127;
        int i = 150;
        float f = 452.12f;
        char c = 10;
        double d = 45.46546;

        System.out.println("byte与float数据进行运算结果："+(b + f));
        System.out.println("byte与int数据进行运算结果："+(b * i));
        System.out.println("byte与char数据进行运算结果："+(b / c));
        System.out.println("double与char数据进行运算结果："+(d + c));
    }
}
