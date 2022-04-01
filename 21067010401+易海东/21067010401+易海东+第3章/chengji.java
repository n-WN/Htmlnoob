package uTwo;
import java.util.Scanner;

public class chengji {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("输入成绩");

        int grade=sc.nextInt();
        switch(grade){
            case 10:
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
            case 6:
                System.out.println("中");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("差");
                break;
            default:
                System.out.println("无效");
        }
    }
}
