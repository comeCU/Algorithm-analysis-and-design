package part2_basic;
/**
 * 
 * @ClassName: Example022 
 * @Description: 魔方阵
 * @author dong 
 * @date Oct 9, 2018 9:10:35 PM 
 * @keywords : 
 *
 */
public class Example022 {
    /**
     * 获取n阶魔方阵
     * @param n 魔方阵的阶数，取奇数，如果该数为偶数，则取比n小1 的奇数
     * @return 返回保存了该魔方阵的二维数组
     */
    public int[][] getMagicMatrix(int n) {
        int i, j, i1, j1;
        int x = 1;  // x的值依次取 1,2,3 ... n^2
        if(n % 2 == 0) {    // 如果n为偶数，取比n小1的一个奇数
            n = n - 1;
        }
        // 申请行列都为n+1的空间，防止数组越界；第一行[0, j] 和 第一列[i, 0]数据为越界标记，不存储魔方阵数据
        int[][] saveMagicMatrixArr = new int[n + 1][n + 1]; 
        
        i = 1;
        j = (n + 1) / 2;    // 取第一行的中间坐标
        while(x <= n * n) {
            saveMagicMatrixArr[i][j] = x;   // 赋值
            x++;
            i1 = i;
            j1 = j;
            i = i - 1;
            j = j - 1;
            if(i == 0) {    // 如果位置下标出界，则取位置(n, j) 或 (i, n)
                i = n;
            }
            if(j == 0) {
                j = n;
            }
            if(saveMagicMatrixArr[i][j] != 0) { // 如果该位置已经填有数据
                i = i1 + 1;
                j = j1;
            }
        }
        return saveMagicMatrixArr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example022 ex22 = new Example022();
        int[][] arr = ex22.getMagicMatrix(5);
        
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

}
