package PACK4;

public class 增强型for {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int num = 0;

        for (int i = 0; i < arr.length; i++) {
            num = arr[i];
        }

        for (int x : arr) {
            num += x;
            //System.out.println(num);
        }
    }
}
