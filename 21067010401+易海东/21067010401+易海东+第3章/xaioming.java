package uTwo;
import java.util.Scanner;
public class xaioming {
    public static void main(String[] args){
        Scanner xm=new Scanner(System.in);
        int cj=xm.nextInt();
        if(cj>=0&&cj<60){
            System.out.println("一套大嘴巴子");
        }
        else if(cj>=60&&cj<80){
            System.out.println("一套五考三模");
        }
        else if(cj>=80&&cj<100){
            System.out.println("一部手机");
        }
        else if(cj==100){
            System.out.println("一张会发光的3090ti");
        }
        else {
            System.out.println("无效成绩");
        }
    }
}
