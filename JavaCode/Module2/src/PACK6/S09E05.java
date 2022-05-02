package PACK6;

public class S09E05 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        // System.out.println(遍历输出(a));
        遍历输出(a);
    }

    public static void 遍历输出(int[] a) {
        System.out.print("[");
        for (int i : a) {
            if (i == a.length - 1) {
                System.out.print(i);
            } else {
                System.out.print(i + ",");
            }
        }
        System.out.println("]");
        // return sum;
    }
}
