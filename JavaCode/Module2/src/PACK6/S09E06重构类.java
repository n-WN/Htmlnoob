package PACK6;

import java.util.Scanner;

/**
 * @author L1653 水果店管理 分public.
 *     // TODO 显示全表
 *     // TODO 修改水果库存
 *     // TODO 修改水果价格
 *     // TODO 添加水果(增) 未实现
 *     // TODO 退出系统
 *     // TODO 各个欢迎和交互语句
 */
public class S09E06重构类 {
    public static void main(String[] args) {
        String[][] 表头;
        表头 = new String[][]{
                {"水果", "数量", "单价"},
                {"苹果", "10", "5.5"},
                {"香蕉", "20", "3.5"},
                {"西瓜", "30", "4.5"},
                {"葡萄", "40", "6.5"},
                {"荔枝", "50", "7.5"},
                {"柠檬", "60", "8.5"},
                {"梨", "70", "9.5"},
                {"桃", "80", "10.5"},
                {"柚子", "90", "11.5"},
                {"桔子", "100", "12.5"},
        };
        // TODO 修改水果信息 (输入后)查找，修改，删除，输出 操作选择的while语句
        Scanner cin = new Scanner(System.in);
        while (true) {
            // TODO 显示全表
            显示表格(表头);
            System.out.println("请选择操作：");
/**            System.out.println("1.查找");
            System.out.println("2.修改");
            System.out.println("3.删除");
            System.out.println("4.输出");
            System.out.println("5.退出"); */
            System.out.println("1.查找" + "\t" + "2.修改"+ "\t" + "3.删除"+ "\t" + "4.输出"+ "\t" + "5.退出");
            int 选择 = cin.nextInt();
            switch (选择) {
                case 1:
                    System.out.println("请输入要查找的水果名称：");
                    String 水果名称 = cin.next();
                    查找水果(水果名称, 表头);
                    break;
                case 2:
                    System.out.println("请输入要修改的水果名称：");
                    String 水果名称2 = cin.next();
                    System.out.println("请输入要修改的数量：");
                    int 数量 = cin.nextInt();
                    System.out.println("请输入要修改的单价：");
                    double 单价 = cin.nextDouble();
                    修改水果(水果名称2, 数量, 单价, 表头);
                    break;
                case 3:
                    System.out.println("请输入要删除的水果名称：");
                    String 水果名称3 = cin.next();
                    删除水果(水果名称3, 表头);
                    break;
                case 4:
                    输出水果(表头);
                    break;
//                case 6:
//                    增加水果(表头);
//                    break;
                case 5:
                    System.out.println("退出");
                    return;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        }
    }

    // 水果店管理系统
    // 实现水果店的增删改查
    public static void 查找水果(String 水果名称, String[][] 表头) {
        /*       TODO 查找水果 */
        for (int i = 1; i < 表头.length; i++) {
            if (表头[i][0].equals(水果名称)) {
                System.out.println("水果名称：" + 表头[i][0]);
                System.out.println("数量：" + 表头[i][1]);
                System.out.println("单价：" + 表头[i][2]);
            }
        }
    }
    public static void 修改水果(String 水果名称, int 数量, double 单价, String[][] 表头) {
        // TODO 修改水果
        for (int i = 1; i < 表头.length; i++) {
            if (表头[i][0].equals(水果名称)) {
                表头[i][1] = String.valueOf(数量);
                表头[i][2] = String.valueOf(单价);
            }
        }
    }
    public static void 删除水果(String 水果名称, String[][] 表头) {
        // TODO 删除水果
        for (int i = 1; i < 表头.length; i++) {
            if (表头[i][0].equals(水果名称)) {
                表头[i][0] = "";
                表头[i][1] = "";
                表头[i][2] = "";
            }
        }
    }
    public static void 输出水果(String[][] 表头) {
        // TODO 输出水果,查询水果
        for (int i = 1; i < 表头.length; i++) {
            if (!表头[i][0].equals("")) {
                System.out.println("水果名称：" + 表头[i][0]);
                System.out.println("数量：" + 表头[i][1]);
                System.out.println("单价：" + 表头[i][2]);
            }
        }
    }

    public static void 显示表格(String[][] 表头) {
        // TODO 显示表格
        System.out.println("现有商品列表:");
        for (int i = 0; i < 表头.length; i++) {
            for (int j = 0; j < 表头[i].length; j++) {
                System.out.print(表头[i][j] + "\t");
                // System.out.println();
            }
            System.out.println();
        }
        System.out.println("<----------------->");
    }
//    public static void 增加水果(String[][] 表头) {
//        // TODO 增加水果
//        System.out.println("请输入水果名称：");
//        Scanner cin = new Scanner(System.in);
//        String 水果名称 = cin.next();
//        System.out.println("请输入数量：");
//        int 数量 = cin.nextInt();
//        System.out.println("请输入单价：");
//        double 单价 = cin.nextDouble();
//        for (int i = 1; i < 表头.length; i++) {
//            if (表头[i][0].equals("")) {
//                表头[i][0] = 水果名称;
//                表头[i][1] = String.valueOf(数量);
//                表头[i][2] = String.valueOf(单价);
//                return;
//            }
//        }
//    }
}

