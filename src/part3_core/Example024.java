package part3_core;

import java.util.Scanner;

/**
 * 
 * @ClassName: Example024 
 * @Description: ��������
 * @author: dong
 * @date: 2018��11��14�� ����5:41:00 
 * @keyword: ��̬�滮���Զ���洢
 *
 */
public class Example024 {
    
    public static int n;
    
    /**
     * ��ȡ��������
     * @return
     */
    public int[][][] getData() {
        int[][][] arr = new int[50][50][4];
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                arr[i][j][1] = input.nextInt();
                arr[i][j][2] = arr[i][j][1];
                arr[i][j][3] = 0;
            }
        }
        
        return arr;
    }
    
    /**
     * ��ȡ���Ǻ������d����
     * @param dataArr
     * @return
     */
    public int[][][] getMaxPathValue(int[][][] dataArr) {
        // �õ����Ǻ������d
        for(int i = n - 1; i >= 1; i--) {  // �Ե�����
            for(int j = 1; j <= i; j++) {
                if(dataArr[i + 1][j][2] > dataArr[i + 1][j + 1][2]) {
                    dataArr[i][j][2] = dataArr[i][j][2] + dataArr[i + 1][j][2];
                    dataArr[i][j][3] = 0; // ��־���·���±�ı䣬ȡ��һ�ж�Ӧֵ��0�������1
                } else {
                    dataArr[i][j][2] = dataArr[i][j][2] + dataArr[i + 1][j + 1][2];
                    dataArr[i][j][3] = 1;   
                }
            }
        }
        
        return dataArr;
    }
    
    /**
     * ��ʾ�����ֵ·��
     * @param pathValueArr
     */
    public void showPath(int[][][] pathValueArr) {
        int j = 1;
        for (int i = 1; i < n; i++) {
            System.out.print(pathValueArr[i][j][1] + "->");
            j = j + pathValueArr[i][j][3];  // �õ�dataArr�±�
        }
        System.out.println(pathValueArr[n][j][1]);
    }
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example024 example024 = new Example024();
        
        int[][][] outarr = example024.getMaxPathValue(example024.getData());
        System.out.println("max:" + outarr[1][1][2]);
        
        example024.showPath(outarr);

    }

}
