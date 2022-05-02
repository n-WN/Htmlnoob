package PACK5;

/**
 * &#064;设计方法求出1-5的和
 * @author L1653
 */
public class S08E02 {
    public static void main(String[] args) {
        Sum();
    }

    public static void Sum() {
        // 设计方法求出1-5的和
        int num = 0;
        for (int i = 1; i <= 5; i++) {
            num += i;
        }
        System.out.printf("一到五的和为：" + num);
    }
}
