package part2_basic;

/**
 * 
 * @ClassName: Example007 
 * @Description: �ӡ���λ����λ���������������λ����
 * @author dong 
 * @date Sep 24, 2018 4:18:37 PM 
 * @keywords : 
 *
 */
public class Example007 {
    
    // answer 1 �� ѭ��
    /*public void revOutputInt(int n) {
        int temp = 0;
        while(n > 0) {
            temp = n % 10;
            n /= 10;
            System.out.println(temp);
        }
    }*/
    
    // answer 2 : �ݹ�  ʱ��Ч�ʺͿռ�Ч�ʱ�answer 1ѭ���㷨��
    public void revOutputInt(int n) {
        int temp;
        if(n < 10) {
            System.out.println(n);
        } else {
            System.out.println(n % 10);
            revOutputInt(n / 10);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example007 ex007 = new Example007();
        ex007.revOutputInt(12345);

    }

}
