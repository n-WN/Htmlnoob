package ChapterII;

public class Mmo {
    public static void main(String[] args) {
        int password=751248;
        int key=7;
        System.out.println("password:"+password);
        password=password<<key;
        System.out.println("左password:"+password);
        password=password>>key;
        System.out.println("右password:"+password);
    }
}
