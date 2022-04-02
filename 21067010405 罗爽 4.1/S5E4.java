package PACK3;

public class S5E4 {
    public static void main(String[] args) {
        int num = 0, x = 0;
        //outer: //起个名（标签）让break跳出循环 //8*8队列
        for (int i = 0; i < 8; i++) {
            x++;
            int y = 0;
            for (int j = 0; j < 8; j++) {

                num++;
                y++;
                System.out.println("第" + x + "排，第" + y + "列：" + num);
                //break outer;
            }
            //System.out.println();
        }
    }
}
