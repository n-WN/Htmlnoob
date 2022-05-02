package PACK4;

public class S06Etest02 {
    public static void main(String[] args) {
        //對角綫
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //對角綫
        int[][] b = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        //對角綫
        int 主對角綫 = 0,副對角綫 = 0;
        int[][] c = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                // System.out.print(c[i][j] + " ");
                if (i == j) {
                    主對角綫 += c[i][j];
                }
                if (i + j == 4) {
                    副對角綫 += c[i][j];
                }
            }
            System.out.println();
        }
        System.out.printf("主對角綫=%d\n", 主對角綫);
        System.out.printf("副對角綫=%d\n", 副對角綫);
        System.out.println();
        //副對角綫
        主對角綫 = 0;副對角綫 = 0;
        int[][] d = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    主對角綫 += d[i][j];
                }
                if (i + j == 2) {
                    副對角綫 += d[i][j];
                }
            }
        }
        System.out.printf("主對角綫=%d\n", 主對角綫);
        System.out.printf("副對角綫=%d\n", 副對角綫);
    }
}
