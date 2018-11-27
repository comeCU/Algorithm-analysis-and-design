package part3_core;
/**
 * 
 * @ClassName: Queens 
 * @Description: �˻ʺ�����
 * @author: dong
 * @date: 2018��11��27�� ����7:03:47 
 * @keyword: 
 *
 */
public class Queens {
    
    private static int TABLES = 8;  // ���̴�С
    private static int[] save = new int[20];   // �������ҵ���λ��
    private static int answers = 0; // ��ĸ���
    
    /**
     * �ǵݹ�����㷨
     * @param tables ���̴�С
     */
    public void backdate(int tables) {
        int row = 1;
        Queens.save[1] = 0;
        
        while(row > 0) {
            Queens.save[row] ++;
            while(Queens.save[row] <= tables && check(row) == 0) {  // Ϊ��row���ʺ�����λ��
                Queens.save[row] ++;
            }
            if(Queens.save[row] <= tables) {
                if(row == tables) { // �ҵ�һ���
                    output();
                } else {
                    row ++; // ǰrow���ʺ��ҵ�λ�ã�����Ϊ�� row+1 ���ʺ��ҵ�λ��
                    Queens.save[row] = 0;  // ��һ���ʺ��һ�еĵ�һ�����ӿ�ʼ����
                }
            } else {
                row --; // ����
            }
        }
    }
    
    /**
     * ����Ƿ�����Լ������
     * @param row ��ǰ��
     * @return ���㷵��0�����򷵻�1
     */
    public int check(int row) {
        for (int i = 1; i <= row - 1; i++) {
            // �����ʺ��ڶԽ����ϻ�����ͬһ����
            if(Math.abs(Queens.save[i] - Queens.save[row]) == Math.abs(i - row) || Queens.save[i] == Queens.save[row]) {
                return 0;
            }
        }
        return 1;
    }
    
    /**
     * ����������ĸ���
     */
    public void output() {
        answers ++;
        System.out.println("��" + answers + "���⣺");
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
