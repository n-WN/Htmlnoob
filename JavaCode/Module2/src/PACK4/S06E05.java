package PACK4;

/**
 * @author L1653 数组反转
 */
public class S06E05 {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};
        int swap1, swap2;
        // 中间值
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
                         // arr.length - 1 (数组从0 开始 。。。)
            swap1 = arr[i];
            swap2 = arr[j];
            arr[j] = swap1;
            arr[i] = swap2;
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
