package PACK6;

import java.util.Scanner;

public class 水果店管理系统 {
    // 水果店管理系统
    // 实现水果店的增删改查
    // TODO 显示全表
    // TODO 修改水果库存
    // TODO 修改水果价格
        // TODO 添加水果(增)
    // TODO 退出系统
    // TODO 各个欢迎和交互语句

    // TODO 未实现的功能 每次刷新后自动显示全表
    public static void main(String[] args) {
        String[][] 表头;
        // TODO 创建初始水果信息
        表头 = new String[][]{
                {"水果名称", "水果价格(元/每斤)", "水果库存(斤)"},
                {"苹果", "3.5", "10"},
                {"香蕉", "2.5", "20"},
                {"西瓜", "3.5", "30"},
                {"荔枝", "5.5", "40"},
                {"梨", "2.5", "50"},
        };
        // TODO 修改水果信息 (输入后)查找，修改，删除，输出 操作选择的while语句
        Scanner cin = new Scanner(System.in);
        int 操作选择 = 0;
        while (true) {
            // TODO 欢迎语句
            System.out.println();
            // 格式化
            System.out.println("请选择操作：");
            // 交互
            // System.out.print("1.查找" + "\t" + "2.修改" + "\t" + "3.删除" + "\t" + "4.输出" + "\t" + "5.退出" + "\n");
            System.out.print("1.查找" + "\t" + "2.增加" + "\t" + "3.修改" + "\t" + "4.删除" + "\t" + "5.输出(此功能优先选择选项7)" + "\t" + "6.退出" + "\t" + "7.只读模式打开表格" + "\n");
            操作选择 = cin.nextInt();
            if (操作选择 == 1) {
                System.out.println("请输入要查找的水果名称：(输入0返回主菜单)");
                String 查找水果名称 = cin.next();
                if (查找水果名称.equals("0")) {
                    continue;
                }
                // TODO 查找水果信息
                int for计数器 = 0;
                for (int i = 0; i < 表头.length; i++) {
                    // 行
                    if (表头[i][0].equals(查找水果名称)) {
                        // .equals() 方法用于比较两个字符串是否相等。 == 比较的是两个对象的地址 -> https://www.cnblogs.com/Whichzzz/p/15684836.html(==与equals的区别)
                        System.out.println("水果名称：" + 表头[i][0]);
                        System.out.println("水果价格：" + 表头[i][1]);
                        System.out.println("水果库存：" + 表头[i][2]);
                        for计数器++;
                    }
                }
                if (for计数器 == 0) {
                    System.out.println("查找失败！没有这个数据");
                }
            }
            if (操作选择 == 2) {
                System.out.println("请输入要添加的水果名称：(输入0返回主菜单)");
                String 添加水果名称 = cin.next();
                if (添加水果名称.equals("0")) {
                    continue;
                }
                System.out.println("请输入要添加的水果价格：(输入0返回主菜单)");
                String 添加水果价格 = cin.next();
                if (添加水果价格.equals("0")) {
                    continue;
                }
                System.out.println("请输入要添加的水果库存：(输入0返回主菜单)");
                String 添加水果库存 = cin.next();
                if (添加水果库存.equals("0")) {
                    continue;
                }
                // TODO 添加水果信息(未完成)
                String[][] 新表头 = new String[表头.length + 1][表头[0].length];
                for (int i = 0; i < 表头.length; i++) {
                    for (int j = 0; j < 表头[0].length; j++) {
                        新表头[i][j] = 表头[i][j];
                    }
                }
                // 遍历输出新表头
                for (int i = 0; i < 新表头.length; i++) {
                    for (int j = 0; j < 新表头.length; j++) {
                        System.out.println(新表头[i][j]);
                    }
                }
                System.out.println("操作完成");
            }
            if (操作选择 == 3) {
                System.out.println("请输入要修改的水果名称：(输入0返回主菜单)");
                String 修改水果名称 = cin.next();
                if (修改水果名称.equals("0")) {
                    continue;
                }
                System.out.println("请输入要修改的水果价格：(输入0返回主菜单)");
                String 修改水果价格 = cin.next();
                if (修改水果价格.equals("0")) {
                    continue;
                }
                System.out.println("请输入要修改的水果库存：");
                String 修改水果库存 = cin.next();
                // TODO 修改水果信息
                for (int i = 0; i < 表头.length; i++) {
                    if (表头[i][0].equals(修改水果名称)) {
                        表头[i][1] = 修改水果价格;
                        表头[i][2] = 修改水果库存;
                    }
                }
                System.out.println("操作完成");
            }
            if (操作选择 == 4) {
                System.out.println("请输入要删除的水果名称：");
                String 删除水果名称 = cin.next();
                // TODO 删除水果信息
                for (int i = 0; i < 表头.length; i++) {
                    if (表头[i][0].equals(删除水果名称)) {
                        表头[i][0] = "";
                        表头[i][1] = "";
                        表头[i][2] = "";
                    }
                }
            }
            if (操作选择 == 5) {
                // TODO 输出水果信息
                for (int i = 0; i < 表头.length; i++) {
                    System.out.println("水果名称：" + 表头[i][0]);
                    System.out.println("水果价格：" + 表头[i][1]);
                    System.out.println("水果库存：" + 表头[i][2]);
                }
            }
            if (操作选择 == 6) {
                // TODO 退出系统
                break;
            }
            if (操作选择 == 7) {
                // TODO 查看所有水果信息
                for (int i = 0; i < 表头.length; i++) {
                    System.out.println("水果名称：" + 表头[i][0]);
                    System.out.println("水果价格：" + 表头[i][1]);
                    System.out.println("水果库存：" + 表头[i][2]);
                    System.out.println("----------------------------------");
                }
            }
        }
    }
}