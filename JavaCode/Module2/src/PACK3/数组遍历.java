package PACK3;

//import static java.util.Collections.swap;

public class 数组遍历 {
    public static void main(String[] args) {
        /*
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

        }
         */
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println();

        System.out.println(arr.length);
        //获取数组长度
        System.out.println();

        for (int j : arr) {
            //遍历数组
            System.out.println(j);
        }

    }
}