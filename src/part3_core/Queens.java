package part3_core;
/**
 * 
 * @ClassName: Queens 
 * @Description: 八皇后问题
 * @author: dong
 * @date: 2018年11月27日 下午7:03:47 
 * @keyword: 
 *
 */
public class Queens {
    
    private static int TABLES = 8;  // 棋盘大小
    private static int[] save = new int[20];   // 保存已找到的位置
    private static int answers = 0; // 解的个数
    
    /**
     * 非递归回溯算法
     * @param tables 棋盘大小
     */
    public void backdate(int tables) {
        int row = 1;
        Queens.save[1] = 0;
        
        while(row > 0) {
            Queens.save[row] ++;
            while(Queens.save[row] <= tables && check(row) == 0) {  // 为第row个皇后搜索位置
                Queens.save[row] ++;
            }
            if(Queens.save[row] <= tables) {
                if(row == tables) { // 找到一组解
                    output();
                } else {
                    row ++; // 前row个皇后找到位置，继续为第 row+1 个皇后找到位置
                    Queens.save[row] = 0;  // 下一个皇后从一行的第一个格子开始搜索
                }
            } else {
                row --; // 回溯
            }
        }
    }
    
    /**
     * 检查是否满足约束条件
     * @param row 当前行
     * @return 满足返回0，否则返回1
     */
    public int check(int row) {
        for (int i = 1; i <= row - 1; i++) {
            // 两个皇后在对角线上或者在同一列上
            if(Math.abs(Queens.save[i] - Queens.save[row]) == Math.abs(i - row) || Queens.save[i] == Queens.save[row]) {
                return 0;
            }
        }
        return 1;
    }
    
    /**
     * 输出并计算解的个数
     */
    public void output() {
        answers ++;
        System.out.println("第" + answers + "个解：");
        for (int i = 1; i <= Queens.TABLES; i++) {
            System.out.print(save[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Queens queens = new Queens();
        queens.backdate(TABLES);
        
    }

}
