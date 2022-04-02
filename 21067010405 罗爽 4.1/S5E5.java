package PACK3;

public class S5E5 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if (i % 2 != 0) {
                //continue; //与break一样 均可加指定标签跳出循环，但continue只跳过一次
                break;
            }
        }
    }
}
