package PACK6;

public class S09E04 {
    // 案例6
    // 设计一个方法用于获取数组元素的最大值，调用方法并输出结果
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 12, 5, 6, 7, 8, 9, 10};
        System.out.println(getMax(array));
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }
}
