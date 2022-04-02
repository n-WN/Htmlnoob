package PACK3;

public class S4E2M6 {
    public static void main(String[] args) {
        int 存1到100 = 0,存偶数 = 0;
        for (int i = 1;i <= 100;i++){
            if (i % 2 == 0){
                存偶数 += i;//偶数嘉和
            }
            存1到100 += i;
        }
        System.out.println(存偶数);
    }
}
