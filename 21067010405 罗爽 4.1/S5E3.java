package PACK3;

public class S5E3 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            //8x8 还没做
            //这是查找素数
            boolean is_prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) System.out.println(i);
        }
    }
}
