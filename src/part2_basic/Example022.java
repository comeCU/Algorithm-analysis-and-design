package part2_basic;
/**
 * 
 * @ClassName: Example022 
 * @Description: ħ����
 * @author dong 
 * @date Oct 9, 2018 9:10:35 PM 
 * @keywords : 
 *
 */
public class Example022 {
    /**
     * ��ȡn��ħ����
     * @param n ħ����Ľ�����ȡ�������������Ϊż������ȡ��nС1 ������
     * @return ���ر����˸�ħ����Ķ�ά����
     */
    public int[][] getMagicMatrix(int n) {
        int i, j, i1, j1;
        int x = 1;  // x��ֵ����ȡ 1,2,3 ... n^2
        if(n % 2 == 0) {    // ���nΪż����ȡ��nС1��һ������
            n = n - 1;
        }
        // �������ж�Ϊn+1�Ŀռ䣬��ֹ����Խ�磻��һ��[0, j] �� ��һ��[i, 0]����ΪԽ���ǣ����洢ħ��������
        int[][] saveMagicMatrixArr = new int[n + 1][n + 1]; 
        
        i = 1;
        j = (n + 1) / 2;    // ȡ��һ�е��м�����
        while(x <= n * n) {
            saveMagicMatrixArr[i][j] = x;   // ��ֵ
            x++;
            i1 = i;
            j1 = j;
            i = i - 1;
            j = j - 1;
            if(i == 0) {    // ���λ���±���磬��ȡλ��(n, j) �� (i, n)
                i = n;
            }
            if(j == 0) {
                j = n;
            }
            if(saveMagicMatrixArr[i][j] != 0) { // �����λ���Ѿ���������
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
