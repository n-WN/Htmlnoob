package PACK4;

/**@冒泡排序
 * @author L1653
 */
public class S06E03 {
    public static void main(String[] args) {
        int[] sort = {1,6,2,3,9,132,4,2};
        System.out.println(("排序前："));

        for (int k : sort) {
            System.out.print(k + " ");
        }
        System.out.println();

        for (int i = 0; i < sort.length; i++) {
            int temp;
            for (int j = sort.length - 1; j > 0; j--) {
                if (sort[j] > sort[j - 1]){
                    temp = sort[j];
                    sort[j] = sort[j - 1];
                    sort[j - 1] = temp;
                }
            }
        }
        System.out.println("排序后：");
        for (int j : sort) {
            System.out.println(j + " ");
        }
    }
}
