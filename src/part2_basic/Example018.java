package part2_basic;
/**
 * 
 * @ClassName: Example018 
 * @Description: �߾������� * ������
 * @author: dong
 * @date: 2018��10��8�� ����4:53:15 
 * @keyword: 
 *
 */
public class Example018 {

    /**
     * �߾������� * ����������������洢��������
     * @param s1 �洢�߾������ݵ��ַ�����
     * @param num ��������
     * @return ���ؽ������
     * @version 1.0
     */
    public int[] saveLargeInteger(char[] s1, long num) {
        long bitOfProduct = 0;   // �߾������ݱ������ַ�������ÿһλ�ĳ˻�
        int[] save = new int[256];
        int len = s1.length;
        int carry = 0; // ��λ
        int i, j;
        for(i = 0, j = len - 1; i < len; i++, j--) {
            bitOfProduct = ((s1[j] - 48) * num + carry);  // ���ÿλ���ĳ˻�
            save[i] = (int) (bitOfProduct % 10);    // bitOfProductΪ�����ͣ���ǿת
            carry = (int)bitOfProduct / 10;
        }
        while(carry != 0) { // ���Ľ�λ
            save[len] = carry % 10;
            carry /= 10;
            len++;
        }
        return save;
    }
     
    /**
     * �߾������� * ����������������洢��������
     * @param str �洢�߾������ݵ��ַ�������
     * @param num ��������
     * @return ���ؽ������
     * @version 2.0
     */
    public int[] saveLargeInteger2(String str, long num) {
        long bitOfProduct = 0;
        int carry = 0;  // ��λ
        int len = str.length();
        int[] save = new int[256];
        
        int i = 0;
        int j = len - 1;
        for(; j >= 0; j--, i++) {
            bitOfProduct = (str.charAt(j) - 48) * num + carry;
            save[i] = (int) (bitOfProduct % 10);
            carry = (int) (bitOfProduct / 10);
        }
        while(carry != 0) {
            save[len] = carry % 10;
            carry /= 10;
        }
        return save;
    }
    
    /**
     * ��ӡ���
     * @param save �洢���������
     */
    public void printSaveLargeInteger(int[] save) {
        int i = save.length - 1;
        int j = 0;
        for (; i >=0; i--) {
            if(save[i] != 0) {  // ��¼��Ч�������ڵ������±�
                j = i;
                break;
            }
        }
        for (; j >= 0; j--) {   // ��ʼ�����Ч����
            System.out.print(save[j]);
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Example018 ex18 = new Example018();
        /*char[] s1 = {'3', '6', '9', '1', '2', '3', '3', '4', '5', '9', '6', '7', '4', '6', '5'};
        int[] arr = ex18.saveLargeInteger(s1, 6);
        ex18.printSaveLargeInteger(arr);*/
        
        System.out.println();
        int[] arr2 = ex18.saveLargeInteger2("369123345967465", 6);
        ex18.printSaveLargeInteger(arr2);
    }

}
