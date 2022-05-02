package PACK4;

public class S06E02 {
    public static void main(String[] args) {
        int[] aa = {1, 2, 3, 4, 5};
        int[] bb = {6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        System.arraycopy(aa, 0, bb, 0, 5);
        //覆盖

        for (int i = 0; i < aa.length; i++) {
            System.out.print(aa[i] + " ");
        }
        System.out.println();

        for (int j : bb) {
            System.out.print(j + " ");
        }
        System.out.println();

    }
}
