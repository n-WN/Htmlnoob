package PACK3;

import java.util.Scanner;

/**
 * @author L1653
 */
public class S4E1test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("这个月是几月");
        int m = sc.nextInt();
        switch (m) {
            case 3, 4, 5 -> System.out.println("春天");
            case 6, 7, 8 -> System.out.println("夏天");
            case 9, 10, 11 -> System.out.println("秋天");
            case 12, 1, 2 -> System.out.println("冬天");
            default -> System.out.println("您这个月份可真是特殊呢");
        }
    }
}
