package part2_basic;

import java.util.Scanner;

/**
 * 
 * @ClassName: Example011 
 * @Description: ͳ��ѡƱ
 * @author dong 
 * @date Sep 27, 2018 11:30:01 PM 
 * @keywords : ͳ��ѡƱ��ԭʼ��Ϣ�봦�����Ķ�Ӧ�洢
 *
 */
public class Example011 {
    /**
     * ��������Ʊѡ���ݣ��õ���ѡ�˵�Ʊ�����-1 ��������
     * @param n ��ѡ�˸���
     * @return arr ��ѡ�˱�Ŷ�Ӧ�����±���Ԫ��ֵ��ʾ��Ӧ��ѡ�˵�ѡƱ
     */
    public int[] getVotesResult(int n) {
        int[] arr = new int[n+1];
        Scanner input = new Scanner(System.in);
        int vote = input.nextInt();
        while (vote != -1) {
            if(vote >= 1 && vote <=n) {
                arr[vote]++;
            } else {
                System.out.println("input error");
//                break;
            }
            vote = input.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example011 ex011 = new Example011();
        int[] arr = ex011.getVotesResult(5);
        
        for (int i = 1; i < arr.length; i++) {
            System.out.println(i + " number get " + arr[i] + " votes");
        }
    }

}
