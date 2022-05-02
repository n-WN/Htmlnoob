package PACK6;

import java.util.Random;
import java.util.Scanner;

public class cjb {
    static  Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("---欢迎---");
        String[]arr=new String[100];
        System.out.println("请输入班级人数");
        int people= sc.nextInt();

        System.out.println("请输入学期课程数");
        int course=sc.nextInt();
        for (int i=1;i<=course;i++){
            System.out.println("请输入第" + i + "门课程");
            Scanner sr=new Scanner(System.in);
            String course1=sr.nextLine();
            arr[i]=course1;
        }

        System.out.print("学号");
        for(int i=0;i<=people;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("总分"+"平均分");
        student(people,course);
    }
    public  static  void student(int a,int b){
        // int a = people;int b = course;
        int [][] arr = new int[9][9];
        int z=0;
        int f=0;
        for (int i=0;i<a;i++){
            arr[i][0]=i+1;
        }
        for (int i=1;i<a;i++){
            for (int j=0;j<b;j++){
                Random r=new Random();
                int grade= r.nextInt(100)+1;
                arr[i][j]=grade;
            }
        }
        // TODO 计算行平均分和总分
        for (int i=0;i<a;i++){
            for (int j=0;j<b;j++){
                z=z+arr[i][j];
            }
            f = z/b;
            //arr[i][b+1]=f;
            z=0;
        }
//        for (int i=0;i<a;i++){
//            // 行
//            for (int j=1;j<b;j++){
//                // 列
//                z+=arr[i][j];
//                // 总分
//            }
//            f=z/b;
//            // 平均分
//
//            arr[i][b+1]=z;
//            arr[i][b+2]=f;
//            z=0;
//        }
        for (int i=0;i<a;i++){
            // 行
            for (int j=0;j<b+3;j++){
                // 列

                System.out.print(" "+arr[i][j]+" "+" \t");
            }
            System.out.println();
        }
    }
}