package part2_basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Example016 
 * @Description: ��x��ʹx^2Ϊһ����λ���ֻ�����ͬ��9λ��
 * @author dong 
 * @date Sep 27, 2018 11:31:19 AM 
 * @keywords : ö�ٷ��������¼״̬��Ϣ
 *
 */
public class Example016 {
    /**
     * 
     * @return list��������ʹx^2Ϊһ����λ���ֻ�����ͬ��9λ���� xֵ
     */
    public List<Integer> getNumPowerNotRepeat() {
        ArrayList<Integer> list =  new ArrayList<>();
        int[] arr = new int[10];
        for(int n = 10000; n< 32000; n++) { // ����ȡֵ������[10000,32000)
            for (int i = 0; i < arr.length; i++) {  // �����ʼ�����öδ���ע�͵��������в��������
                arr[i] = 0;
            }
            
            int total = n * n;
            int y = total;
            int k = 0;  // ��¼���ظ�����
            int index = 0;  // ���λ
            for(int i = 0; i< 9; i++) { // ѭ������Ϊ9��
                index = total % 10;
                total /= 10;
                if (arr[index] == 0) {
                    arr[index] = 1; // ���
                    k++;
                } else {
                    break;
                }
            }
            if(k == 9) {
                list.add(n);
                list.add(y);    // ����9λ����ӵ�list��
            }
        }
        return list;
    }
    
    /*
     * ����new���������ʼ��
     */
    /*public void testInitArr() {
        int[] arr = new int[5];
        System.out.println(arr[0]);
    }*/

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example016 ex16 = new Example016();
        List<Integer> list = ex16.getNumPowerNotRepeat();
        for (int i = 0; i < list.size();) {
            System.out.print("��" + (i+1) + "���� " + list.get(i));
            System.out.println("  the power:" + list.get(i+1));
            i = i+2;
        }
        
//        ex16.testInitArr();
        
    }

}
