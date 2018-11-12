package part2_basic;

import java.util.Scanner;

/**
 * 
 * @ClassName: Example009 
 * @Description: 用2的幂次方表示正整数，
 *              如：137 = 2(7)+2(3)+2(0) = 2(2(2)+2(1)+2(0))+2(2(1)+2(0))+2(0)
 * @author dong 
 * @date Sep 24, 2018 6:26:46 PM 
 * @keywords : 
 *
 */
public class Example009 {
    
    /*public void showIntTo2Power(int n, int r) {
        if(n == 1) {
            System.out.print("2(" + r + ")");
        } else {
            showIntTo2Power(n / 2, r + 1);
            if(n % 2 == 1) {
                System.out.print("+2(" + r + ")");
            }
        }
    }*/
    
    public void showIntTo2Power(int n, int r) {
        if(n == 1) {
            switch (r) {
                case 0:
                    System.out.print("2(0)");
                    break;
                case 1:
                    System.out.print("2");
                    break;
                case 2:
                    System.out.print("2(2)");
                    break;
                default:
                    System.out.print("2(");
                    showIntTo2Power(r, 0);
                    System.out.print(")");
                    break;
            }
        } else {
            showIntTo2Power(n / 2, r + 1);
            if (n % 2 == 1) {
                switch (r) {
                    case 0:
                        System.out.print("+2(0)");
                        break;
                    case 1:
                        System.out.print("+2");
                        break;
                    case 2:
                        System.out.print("+2(2)");
                    default:
                        System.out.print("+2(");
                        showIntTo2Power(r, 0);
                        System.out.print(")");
                        break;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Example009 ex009 = new Example009();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n >= 1) {
            ex009.showIntTo2Power(n, 0);
        } else {
            System.out.println("error");
        }

    }

}
