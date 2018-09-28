package part2_basic;

import java.util.Scanner;

/**
 * 
 * @ClassName: Example011 
 * @Description: 统计选票
 * @author dong 
 * @date Sep 27, 2018 11:30:01 PM 
 * @keywords : 统计选票、原始信息与处理结果的对应存储
 *
 */
public class Example011 {
    /**
     * 接收输入票选数据，得到候选人得票结果；-1 结束输入
     * @param n 候选人个数
     * @return arr 候选人编号对应数组下表，各元素值表示对应候选人的选票
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
