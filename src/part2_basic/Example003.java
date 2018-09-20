package part2_basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Example003 
 * @Description: ��һ������İ��㣬����������С�����������ĵ�
 * @author dong 
 * @date Sep 20, 2018 8:40:12 PM 
 * @keywords : ����
 *
 */
public class Example003 {
    
    /**
     * ���ά����İ���
     * @param arr ��ά����
     * @return List
     */
    public List<Integer> getSaddlePoint(int[][] arr) {
        List<Integer> list = new ArrayList<>();
        int rows = arr.length;  // ��ȡ��ά��������
        int columns = arr[0].length;    // ��ȡ��ά��������
        int min_i;
        int i = 0, j = 0;
        int flag_i = 0, flag_j = 0;   // ��־��Сֵ������
        
        for(i = 0; i< rows; i++) {
            min_i = arr[i][0];  // ��ÿ�е��׸�Ԫ��Ϊ��ǰ��Сֵ
            flag_i = i; // �ȼ�¼���к�
            
            for (j = 0; j < columns; j++) {
                if (arr[i][j] < min_i) {
                    min_i = arr[i][j];  // ��ȡ���ϵ���Сֵ
                    flag_j = j;   // ��־������Сֵ���ڵ���                    
                }
            }
            
            list.add(min_i);    // ����������ӵ�������
            list.add(flag_i);
            list.add(flag_j);
            for(int k =  0; k< rows; k++) {
                if(arr[k][flag_j] > min_i) {
                    list.remove(list.size() - 1);   // ����������б�min_i ���ֵ����min_i ���ǰ��㣬�Ƴ��������¼ӵ�Ԫ��
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
