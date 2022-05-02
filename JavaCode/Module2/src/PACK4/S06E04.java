package PACK4;

/**@二分查找
 * @author L1653
 */
public class S06E04 {
    public static void main(String[] args) {
        int[] sort = {1,23,5,65,6,67,68,67,5};
        int key = 6;
        //需要查找的值
        int locale = -1;
        //记录查找位置的变量
        int low = 0;
        int high = sort.length - 1;

        while (high >= low){
            //low 和 high 是位置
            int mid = (low + high)/2;
            if (key < sort[mid]) {
                high = mid - 1;
                //
            } else if (key == sort[mid]){
                locale = mid;
                break;
            }
            else {
                low = mid + 1;
            }
        }
        if (locale == -1) {
            System.out.println("数组中不存在元素 " + key);
        } else {
            System.out.println("元素 " + key + " 在数组中的下标是 " + locale);
        }
    }
}
