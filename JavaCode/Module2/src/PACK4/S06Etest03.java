package PACK4;

/**
 * &#064;數組刪除
 * @author L1653
 */
public class S06Etest03 {
    public static void main(String[] args) {
        // ArrayReduce.java
        int[] a = {1, 2, 3, 4, 5};
        // 可以對該數組進行縮減,提示用戶是否繼續縮減,每次縮減最後一個元素,儅 a.length == 1 則結束縮減
        int num = a.length;
        while (num > 1) {
            a[num - 1] = 0;
            // 刪除最後一個元素
            num--;
        }
        /*
        int[] b = {1, 2, 3, 4, 5};
        while (b.length > 1) {
            b.length--;
        }

         */
        System.out.print("不能再縮減");
    }
}
