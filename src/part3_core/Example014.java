package part3_core;

/**
 * 
 * @ClassName: Example014
 * @Description: 残缺棋盘
 * @author: dong
 * @date: 2018年10月23日 下午2:38:25
 * @keyword: 二分法不相似
 *
 */
public class Example014 {
    private static int SIZE = 4;    // 棋盘大小size*size
    private static int[][] BOARD = new int[SIZE][SIZE];
    private static int t = 0;   // 计数使用的三格板
    
    /**
     * 覆盖残缺棋盘
     * 注：0). 此方法先填中间方格
     *    1). tr 和 tc是相对于(0,0)位置不断变化
     *    2). 覆盖后的中间方格，也看作是残缺方格（“伪”残缺方格）
     *    3). dr 和 dc 用tr、tc和 s 来表示，当前子棋盘下则直接用dr dc表示
     *    
     * @param tr cover子棋盘左上角所在行
     * @param tc cover子棋盘左上角所在列
     * @param dr 残缺方格所在行
     * @param dc 残缺方格所在列
     * @param size 棋盘的行数或列数
     * @return BOARD数组，保存棋盘覆盖的状态信息
     */
    public int[][] cover(int tr, int tc, int dr, int dc, int size) {
        int s = 0;
        if(size < 2) {
            return null;
        }
        t ++;
        s = size / 2;
        
        if(dr < tr + s && dc < tc + s) {    // 残缺方格位于左上块棋盘
            BOARD[tr + s][tc + s - 1] = t;
            BOARD[tr + s][tc + s] = t;
            BOARD[tr + s - 1][tc + s] = t;
            
            cover(tr, tc, dr, dc, s);   // 覆盖左上
            cover(tr, tc + s, tr + s - 1, tc + s, s);   // 覆盖右上
            cover(tr + s, tc, tr + s, tc + s -1, s);    // 覆盖左下
            cover(tr + s, tc + s, tr + s, tc + s, s);   // 覆盖右下
        } else if(dr < tr + s && dc >= tc + s) {    // 残缺方格位于右上块棋盘
            BOARD[tr + s - 1][tc + s - 1] = t;
            BOARD[tr + s][tc + s -1] = t;
            BOARD[tr + s][tc + s] = t;
            
            cover(tr, tc, tr + s - 1, tc + s - 1, s);
            cover(tr, tc + s, dr, dc, s);
            cover(tr + s, tc, tr + s, tc + s - 1, s);
            cover(tr + s, tc + s, tr + s, tc + s, s);
        } else if(dr >= tr + s && dc < tc + s) {    // 残缺方格位于左下块棋盘
            BOARD[tr + s - 1][tc + s - 1] = t;
            BOARD[tr + s - 1][tc + s] = t;
            BOARD[tr + s][tc + s] = t;
            
            cover(tr, tc, tr + s -1, tc + s -1, s);
            cover(tr, tc + s, tr + s - 1, tc + s, s);
            cover(tr + s, tc, dr, dc, s);
            cover(tr + s, tc + s, tr + s, tc + s, s);
        } else {    // 残缺方格位于右下块棋盘
            BOARD[tr + s - 1][tc + s - 1] = t;
            BOARD[tr + s][tc + s - 1] = t;
            BOARD[tr + s - 1][tr + s] = t;
            
            cover(tr, tc, tr + s - 1, tc + s - 1, s);
            cover(tr, tc + s, tr + s - 1, tc + s, s);
            cover(tr + s, tc, tr + s, tc + s - 1, s);
            cover(tr + s, tc + s, dr, dc, s);
        }
        
        return BOARD;
    }
    
    /**
     * 输出显示
     * @param board
     */
    public void outputBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Example014 example014 = new Example014();
        int[][] arr= example014.cover(0, 0, 1, 0, SIZE);
        example014.outputBoard(arr);

    }

}
