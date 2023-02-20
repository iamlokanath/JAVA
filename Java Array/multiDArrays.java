
public class multiDArrays {
    public static void main(String[] args) {
        /*
         * 
         * int[][] num = { { 1, 2, 3, 4 }, { 4, 5, 0, 3 } };
         * System.out.println(num[1][3]);
         * }
         */

        int[][] num = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                System.out.println(num[i][j]);
            }
        }
    }
}
