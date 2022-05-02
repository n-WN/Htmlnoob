package PACK6;

import java.util.Random;
import java.util.Scanner;

/**
 * @author L1653 成绩管理系统
 */
public class S09E02 {
    public static void main(String[] args) {
        // 成绩管理系统,多个程序储存,对成绩进行求和和计算平均分、打印成绩单、统计。
        // 欢迎页面
        System.out.println("--------欢迎---------");
        // 新建二维数组存表
        String[][] arr = new String[5][5];


        // 班级人数
        System.out.println("请输入班级人数:");
        Scanner cin = new Scanner(System.in);
        int num = cin.nextInt();

        // 循环读入表
        int i = 0;
            // System.out.println("请输入第" + (i + 1) + "门课程名称:");
            // 确定第一门课的名字
            System.out.println("请输入第一门课程名:");
            Scanner cin1 = new Scanner(System.in);
            String name1 = cin1.nextLine();
            arr[0][i] = name1;
            i++;
            // 确定第二门课的名字
            System.out.println("请输入第二门课程名:");
            Scanner cin2 = new Scanner(System.in);
            String name2 = cin2.nextLine();
            arr[0][i] = name2;
            i++;
            // 确定第三门课的名字
            System.out.println("请输入第三门课程名:");
            Scanner cin3 = new Scanner(System.in);
            String name3 = cin3.nextLine();
            arr[0][i] = name3;
            i++;
            // 确定第四门课的名字
            System.out.println("请输入第四门课程名:");
            Scanner cin4 = new Scanner(System.in);
            String name4 = cin4.nextLine();
            arr[0][i] = name4;
            i++;
            // 随机生成成绩
            Random r = new Random();
            int score = r.nextInt(100);
            // 创建一个数组存放成绩
            int[][] ss = new int [num + 10][num + 10];
            // 将数据存入数组
            ss[i][1] = score;
            // 没用到 valueOf() 方法用于返回给定参数的原生 Number 对象值，参数可以是原生数据类型, String等。
            // 求和
            int sum = 0;
//            for (int j = 0; j < arr.length; j++) {
//                sum += Integer.parseInt(arr[j][2]);
//                // 是将整型数据Integer转换为基本数据类型int
//            }
            // 计算平均分
            double avg = sum / arr.length;
            // 打印成绩单
            System.out.println("成绩单");
            // 打印表头
            System.out.println("姓名\t\tname1\tname2\tname3\tname4\t平均分");
            for (int j = 0; j < arr.length; j++) {
                // 打印表内容
                System.out.println(arr[j][0] + "\t" + arr[j][1] + "\t" + arr[j][2] + "\t" + arr[j][3] + "\t" + arr[j][4] + "\t" + avg);
            }
        // 循环输入学生信息
//        for (int i = 0; i < num; i++) {
//            // 学生姓名
//            System.out.println("请输入第" + (i + 1) + "个学生姓名:");
//            arr[i][0] = cin.nextLine();
//            // 学生学号
//            System.out.println("请输入第" + (i + 1) + "个学生学号:");
//            arr[i][1] = cin.nextLine();
//            // 学生成绩为了方便采取随机数进行录入
//            Random r = new Random();
//            // 学生成绩
//            arr[i][2] = String.valueOf(r.nextInt(100));
//        }
        // 循环输出表格
//        System.out.println("成绩单");
//        for (int i = 0; i < num; i++) {
//            // 行
//            for (int j = 0; j < 5; j++) {
//                // 列
//                if (j == 0) {
//                    System.out.print("num" + i + "\t");
//                }
//                else {
//                    System.out.print(arr[i][j] + "\t");
//                }
//
//            }
//            System.out.println();
//        }
    }
}
