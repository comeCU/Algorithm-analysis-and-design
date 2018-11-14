package part3_core;

import java.util.Scanner;

/**
 * 
 * @ClassName: Example024 
 * @Description: 数塔问题
 * @author: dong
 * @date: 2018年11月14日 下午5:41:00 
 * @keyword: 动态规划、自定义存储
 *
 */
public class Example024 {
    
    public static int n;
    
    /**
     * 获取输入数据
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
     * 获取覆盖后的数组d数据
     * @param dataArr
     * @return
     */
    public int[][][] getMaxPathValue(int[][][] dataArr) {
        // 得到覆盖后的数组d
        for(int i = n - 1; i >= 1; i--) {  // 自底向上
            for(int j = 1; j <= i; j++) {
                if(dataArr[i + 1][j][2] > dataArr[i + 1][j + 1][2]) {
                    dataArr[i][j][2] = dataArr[i][j][2] + dataArr[i + 1][j][2];
                    dataArr[i][j][3] = 0; // 标志输出路径下标改变，取下一行对应值加0，否则加1
                } else {
                    dataArr[i][j][2] = dataArr[i][j][2] + dataArr[i + 1][j + 1][2];
                    dataArr[i][j][3] = 1;   
                }
            }
        }
        
        return dataArr;
    }
    
    /**
     * 显示最大数值路径
     * @param pathValueArr
     */
    public void showPath(int[][][] pathValueArr) {
        int j = 1;
        for (int i = 1; i < n; i++) {
            System.out.print(pathValueArr[i][j][1] + "->");
            j = j + pathValueArr[i][j][3];  // 得到dataArr下标
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
