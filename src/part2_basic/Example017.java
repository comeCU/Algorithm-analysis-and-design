package part2_basic;
/**
 * 
 * @ClassName: Example017 
 * @Description: 
 * @author: dong
 * @date: 2018��9��30�� ����2:28:04 
 * @keyword: 
 *
 */
public class Example017 {
    /**
     * ������Ϸ���õ����һ�����µ��˵�ԭʼλ��
     * @param start ��ʼ����λ��
     * @param total ������
     * @param number ��������
     * @return ���һ�����µ��˵�ԭʼλ��
     */
    public int getLastOne(int start, int total, int number) {
        int[] signArr = new int[total + 1]; // ��־����
        int out = 0;    // ��¼���˳�����
        for (int i = 0; i < signArr.length; i++) {
            signArr[i] = 1; // ȫ����λ
        }
        start--;    // Ԥ���������startλ�ÿ�ʼ
        while(out < total - 1) {    // �ٽ���������������˼���pick
            int currentNumber = 0;  // ��ǰ��������
            while(currentNumber < number) {
                start ++;   // startָ��
                if(start > total) {
                    start = 1;  // ���»ص�ԭʼ���
                }
                currentNumber += signArr[start];    // ����+1
            }
            // �ҵ�����һ�ָ��˳���һ��
            signArr[start] = 0; // ��־�˳�
            out ++;
        }
        
        for (int i = 1; i < signArr.length; i++) {  // �������һ��û�б������±�
            if(signArr[i] == 1) {
                return i;
            }
        }
        return 0;        
    }

    public static void main(String[] args) {

        Example017 ex17 = new Example017();
        System.out.println(ex17.getLastOne(83, 100, 10) + " �ţ��󼪴���������Լ���");
        
    }

}
