package part2_basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Example003 
 * @Description: 求一个矩阵的鞍点，即在行上最小而在列上最大的点
 * @author dong 
 * @date Sep 20, 2018 8:40:12 PM 
 * @keywords : 鞍点
 *
 */
public class Example003 {
    
    /**
     * 求二维矩阵的鞍点
     * @param arr 二维数组
     * @return List
     */
    public List<Integer> getSaddlePoint(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int rows = arr.length;  // 获取二维数组行数
        int columns = arr[0].length;    // 获取二维数组列数
        int min_i;
        int i = 0, j = 0;
        int flag_i = 0, flag_j = 0;   // 标志最小值所在列
        
        for(i = 0; i< rows; i++) {
            min_i = arr[i][0];  // 设每行的首个元素为当前最小值
            flag_i = i; // 先记录下行号
            
            for (j = 0; j < columns; j++) {
                if (arr[i][j] < min_i) {
                    min_i = arr[i][j];  // 获取行上的最小值
                    flag_j = j;   // 标志该行最小值所在的列                    
                }
            }
            
            list.add(min_i);    // 将鞍点先添加到链表中
            list.add(flag_i);
            list.add(flag_j);
            for(int k =  0; k< rows; k++) {
                if(arr[k][flag_j] > min_i) {
                    list.remove(list.size() - 1);   // 如果该列上有比min_i 大的值，则min_i 不是鞍点，移除链表中新加的元素
                    list.remove(list.size() - 1);
                    list.remove(list.size() - 1);
                    break;  
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[][] arr = {{1,1,2},
                        {3,3,4},
                        {3,3,5}};
        /*for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j]);
            }
        }*/
        
        Example003 ex003  = new Example003();
        
        List list = ex003.getSaddlePoint(arr);
        
        for (int i = 0; i < list.size();) {
            System.out.println(list.get(i) + " [" + list.get(i + 1) + "," + list.get(i + 2) + "]");
            i = i + 3;
        }

    }

}
