package PACK3;

public class S4E2M7 {
    public static void main(String[] args) {
        int 水仙花数 = 0,百位 = 0,十位 = 0,个位 = 0, 工具数 = 0 ;
        for (int i = 100;i <= 999;i++){
            百位 = i / 100; 工具数 = i % 100;
            十位 = 工具数 /10; 工具数 = i % 10;
            个位 = 工具数;
            if ((百位 * 百位 * 百位 + 十位 * 十位 * 十位 + 个位 * 个位 * 个位)   ==   i){
                水仙花数 = i;
                System.out.println(水仙花数);
            }
            //System.out.println(百位);
        }
    }
}
