package part2_basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Example002 
 * @Description: 
 * @author dong 
 * @date Sep 18, 2018 8:21:55 PM 
 * @keywords : 
 *
 */
public class Example002 {
	
	// �ҳ�1000֮�����������������������
	public void printFactorsIn1000() {
//		Example002 ex002 = new Example002();
		for (int i = 1; i <= 1000; i++) {
			List l1;
			if (Example002.getFactors(i) != null) {
				l1 = Example002.getFactors(i);
				System.out.print(i + " it's factors are:");
				for(int j = 0; j < l1.size(); j++) {
					System.out.print(l1.get(j) + " ");
				}
				System.out.println();
			}
		}
	}
	
	// �жϸ����Ƿ�Ϊ���������ҷ���������
	public static List getFactors(int num) {
		List list = new ArrayList<>();
		list.add(1);
		int sum = 1;
		for(int i = 2; i <= num / 2; i++) {
			while(num % i == 0) {
				list.add(i);
				sum = sum + i;
				i++;
			}
		}
		if(sum == num) {
//			System.out.println("������");
			return list;
		}
//		System.out.println("��������");
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example002 ex002 = new Example002();
		ex002.printFactorsIn1000();
	}

}
