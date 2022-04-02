package PACK3;

import java.util.Random;

public class S5E6 {
    public static void main(String[] args) {
        Random r = new Random();
                //导包，生成随机数
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(10);
            System.out.println("number:" + number);
        }
        int x = r.nextInt(100+1);
        System.out.println(x);
    }
}
