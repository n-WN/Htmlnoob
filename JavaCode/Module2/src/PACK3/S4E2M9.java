package PACK3;

import java.util.Scanner;

public class S4E2M9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //这道题似乎不用输入,划掉

        int 初始值1 = 0,初始值2 = 1,工具值;

        for(int n = sc.nextInt();n>0;n--) {
            //while (bool == 1) {
            工具值 = 初始值1 + 初始值2;
            初始值1 = 初始值2;
            初始值2 = 工具值;
            //System.out.println(初始值1+" ");
            //System.out.println(初始值2);
            //}
        }
        System.out.println(初始值1);
    }
}
