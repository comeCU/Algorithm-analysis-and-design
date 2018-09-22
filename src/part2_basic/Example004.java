package part2_basic;

/**
 * 
 * @ClassName: Example004
 * @Description: 打印数字图形
 * @author dong
 * @date Sep 22, 2018 9:23:27 PM
 * @keywords :
 *
 */
public class Example004 {

    /**
     * 用数组存储数字图形
     * 
     * @param n
     *            n行n列
     * @return arr二维数组
     */
    public int[][] numStore(int n) {
        int[][] arr = new int[n][n];
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) { // 按对角线规律存储
                arr[i + j][j] = k;
                k++;
            }
        }
        return arr;
    }

    /**
     * 输出
     * 
     * @param arr
     */
    public void printNumStore(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i + 1; j++) { // 只输出存储了有效数字的数据
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Example004 ex004 = new Example004();
        int[][] arr = ex004.numStore(6);

        ex004.printNumStore(arr);

    }

}
