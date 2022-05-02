package PACK3;

public class S4E2M8 {
    public static void main(String[] args) {
        //1 , 1 , 2 , 3 , 5 , 8 , 13 , 21 , 34;
        int 数列前一个数 = 0,数列后一个数 = 0;
        for (int i = 0; i < 2100000000; i++) {//i：从0开始的递增数列
            i = 数列前一个数;
            数列后一个数 += 数列前一个数;
            System.out.println(数列前一个数);
        }

    }
}
