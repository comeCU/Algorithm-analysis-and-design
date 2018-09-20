package part2_basic;

import java.util.Scanner;

/**
 * 
 * @ClassName: Example006 
 * @Description: 
 * @author dong 
 * @date Sep 19, 2018 10:25:51 PM 
 * @keywords : �������ֻ�
 *
 */
public class Example006 {

    /**
     * �ݹ��ϵ��
     * 1. Q(n, n) = 1 + Q(n, n - 1)     (m = n)
     * 2. Q(n, m) = Q(n, m - 1) + Q(n - m, m)   (m < n)
     * ��ֹ������
     * 1. Q(n, 1) = 1
     * 2. Q(1, m) = 1
     * @param n ������������
     * @param m �κμ�����������m�Ļ���
     * @return ����������n�Ļ�����Ŀ
     */
    public int divinteger(int n, int m) {
        if(n == 1 || m == 1) {
            return 1;
        } else if (n < m) {
            return divinteger(n, n);
        } else if (n == m) {
            return (1 + divinteger(n, n - 1));
        } else {
            return divinteger(n, m - 1) + divinteger(n - m, m);
        }
    }
    
    public static void main(String[] args) {
        Example006 ex006 = new Example006();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n < 1) {
            System.out.println("�����������");
            return;
        }
        System.out.println(ex006.divinteger(n, n));
        
    }

}
