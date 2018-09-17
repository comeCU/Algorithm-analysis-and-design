package part2_basic;

import java.util.Scanner;

/**
 * 
 * @ClassName: Example001 
 * @Description: link() 
 * @author dong 
 * @date Sep 17, 2018 9:56:10 PM 
 * @keywords : 
 *
 */

public class Example001 {
	// 
	public float getCumAndMul(int n) {
		int i, sign;
		float s, t = 1;
//		Scanner input = new Scanner(System.in);
//		n = input.nextInt();
		s = 1;
		sign = 1;
		for(i = 2; i<= n; i++) {
			sign = -sign;
			t = t*(2 * i - 2) * (2 * i - 1);
			s = s + sign / t;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ÇëÊäÈë£º");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		Example001 ex001 = new Example001();
		System.out.println(ex001.getCumAndMul(n));
	}

}
