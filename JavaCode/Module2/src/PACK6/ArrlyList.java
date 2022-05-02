package PACK6;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrlyList {
    public static void main(String[] args) {
        初始化二维动态数组并放入输入水果信息(args);
        选择功能(args);

    }
    public static void 初始化二维动态数组并放入输入水果信息(String[] args) {
//        动态数组法水果店管理系统
//        1.添加水果
//        2.删除水果
//        3.修改水果
//        4.查询水果
//        5.退出
//        请选择（1-5）：
        //创建二维动态数组初始化水果信息
        String[][] fruits = new String[4][2];
        fruits[0][0] = "苹果";
        fruits[0][1] = "10元/斤";
        fruits[1][0] = "香蕉";
        fruits[1][1] = "5元/斤";
        fruits[2][0] = "西瓜";
        fruits[2][1] = "15元/斤";
        fruits[3][0] = "梨";
        fruits[3][1] = "20元/斤";
        //创建动态数组初始化水果信息
//        ArrayList<String[]> fruits1 = new ArrayList<>();
//        fruits1.add(new String[]{"苹果", "10元/斤"});
//        fruits1.add(new String[]{"香蕉", "5元/斤"});
//        fruits1.add(new String[]{"西瓜", "15元/斤"});
//        fruits1.add(new String[]{"梨", "20元/斤"});
        //测试读取水果信息
//        for (int i = 0; i < fruits.length; i++) {
//            for (int j = 0; j < fruits[i].length; j++) {
//                System.out.print(fruits[i][j] + " ");
//
//            }
//            System.out.println();
//        }
//        System.out.println("-----------------");
    }

    public static void 选择功能(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择（1-5）：\n1.添加水果 2.删除水果 3.修改水果 4.查询水果 5.退出");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("添加水果");
                break;
            case 2:
                System.out.println("删除水果");
                break;
            case 3:
                System.out.println("修改水果");
                break;
            case 4:
                System.out.println("查询水果");
                break;
            case 5:
                System.out.println("退出");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }

    public static void 添加水果(String[] args) {
        System.out.println("添加水果");
        // TODO: 添加水果 动态数组添加元素

    }
}
