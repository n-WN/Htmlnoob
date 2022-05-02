package PACK3;

public class S5E7 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0 || j == 9){
                    //System.out.print("^");
                }
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}
