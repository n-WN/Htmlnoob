package ChapterII;

public class ShortCircuit {
    public static void main(String[] args) {
        int i=10,j=20;
        //System.out.println((i++>100)&(j++>100));
        System.out.println((i++>100)&&(j++>100));
        System.out.println(i);
        System.out.println(j);
    }
}
