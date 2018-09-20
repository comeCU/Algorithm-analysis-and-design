package part2_basic;

import java.util.Scanner;

/**
 * 
 * @ClassName: Example006 
 * @Description: 
 * @author dong 
 * @date Sep 19, 2018 10:25:51 PM 
 * @keywords : 正整数分划
 *
 */
public class Example006 {

    /**
     * 递归关系：
     * 1. Q(n, n) = 1 + Q(n, n - 1)     (m = n)
     * 2. Q(n, m) = Q(n, m - 1) + Q(n - m, m)   (m < n)
     * 终止条件：
     * 1. Q(n, 1) = 1
     * 2. Q(1, m) = 1
     * @param n 给定的正整数
     * @param m 任何加数都不超过m的划分
     * @return 给定正整数n的划分数目
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
            System.out.println("输入参数错误");
            return;
        }
        System.out.println(ex006.divinteger(n, n));
        
    }

}
