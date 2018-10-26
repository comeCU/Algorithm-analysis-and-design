package part3_core;

/**
 * 
 * @ClassName: Example014
 * @Description: ��ȱ����
 * @author: dong
 * @date: 2018��10��23�� ����2:38:25
 * @keyword: ���ַ�������
 *
 */
public class Example014 {
    private static int SIZE = 4;    // ���̴�Сsize*size
    private static int[][] BOARD = new int[SIZE][SIZE];
    private static int t = 0;   // ����ʹ�õ������
    
    /**
     * ���ǲ�ȱ����
     * ע��0). �˷��������м䷽��
     *    1). tr �� tc�������(0,0)λ�ò��ϱ仯
     *    2). ���Ǻ���м䷽��Ҳ�����ǲ�ȱ���񣨡�α����ȱ����
     *    3). dr �� dc ��tr��tc�� s ����ʾ����ǰ����������ֱ����dr dc��ʾ
     *    
     * @param tr cover���������Ͻ�������
     * @param tc cover���������Ͻ�������
     * @param dr ��ȱ����������
     * @param dc ��ȱ����������
     * @param size ���̵�����������
     * @return BOARD���飬�������̸��ǵ�״̬��Ϣ
     */
    public int[][] cover(int tr, int tc, int dr, int dc, int size) {
        int s = 0;
        if(size < 2) {
            return null;
        }
        t ++;
        s = size / 2;
        
        if(dr < tr + s && dc < tc + s) {    // ��ȱ����λ�����Ͽ�����
            BOARD[tr + s][tc + s - 1] = t;
            BOARD[tr + s][tc + s] = t;
            BOARD[tr + s - 1][tc + s] = t;
            
            cover(tr, tc, dr, dc, s);   // ��������
            cover(tr, tc + s, tr + s - 1, tc + s, s);   // ��������
            cover(tr + s, tc, tr + s, tc + s -1, s);    // ��������
            cover(tr + s, tc + s, tr + s, tc + s, s);   // ��������
        } else if(dr < tr + s && dc >= tc + s) {    // ��ȱ����λ�����Ͽ�����
            BOARD[tr + s - 1][tc + s - 1] = t;
            BOARD[tr + s][tc + s -1] = t;
            BOARD[tr + s][tc + s] = t;
            
            cover(tr, tc, tr + s - 1, tc + s - 1, s);
            cover(tr, tc + s, dr, dc, s);
            cover(tr + s, tc, tr + s, tc + s - 1, s);
            cover(tr + s, tc + s, tr + s, tc + s, s);
        } else if(dr >= tr + s && dc < tc + s) {    // ��ȱ����λ�����¿�����
            BOARD[tr + s - 1][tc + s - 1] = t;
            BOARD[tr + s - 1][tc + s] = t;
            BOARD[tr + s][tc + s] = t;
            
            cover(tr, tc, tr + s -1, tc + s -1, s);
            cover(tr, tc + s, tr + s - 1, tc + s, s);
            cover(tr + s, tc, dr, dc, s);
            cover(tr + s, tc + s, tr + s, tc + s, s);
        } else {    // ��ȱ����λ�����¿�����
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
     * �����ʾ
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
