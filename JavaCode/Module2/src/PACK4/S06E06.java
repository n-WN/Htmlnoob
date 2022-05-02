package PACK4;

/**
 * @author L1653 数组插入
 */
public class S06E06 {
    public static void main(String[] args) {
        String[] arr = {"西游记", "鹿鼎记", "红楼梦", null, null};

        for (int i = 0; i < arr.length; i++) {
            if (i == 1) {
            //if (arr[i] == null) {
                arr[i] = "水浒传";
                //break;
                i += 1;
            }
        }

        for (String h: arr) {
            System.out.println(h);
        }
    }
}
