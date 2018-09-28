package part2_basic;

import java.util.Scanner;
/**
 * 
 * @ClassName: Example012 
 * @Description: 
 * @author dong 
 * @date Sep 28, 2018 03:10:01 PM 
 * @keywords : 
 *
 */
public class Example012 {
    /**
     * 接收输入身高数据，统计各档次身高人数。-1 结束输入
     * @return arr 统计结果保存在数组中。各档次对应的数组下标-1，该数组元素即为该档次的身高人数
     */
    public int[] addUpheight() {
        int[] arr = new int[8];
        Scanner input = new Scanner(System.in);
        int height = input.nextInt();
        while(height != -1) {
            if(height > 179) {
                arr[7]++;
            } else if (height < 150) {
                arr[0]++;
            } else {
                arr[(height / 5) - 29]++;   // 建立对应关系
            }
            
            height = input.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example012 ex12 = new Example012();
        int[] arr = ex12.addUpheight();
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+1 + " field of the number of people: " + arr[i]);
        }
    }

}
