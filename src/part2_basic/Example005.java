package part2_basic;

public class Example005 {
	/**
	 * ��ŵ������
	 * @param n �������
	 * @param a ��A
	 * @param b ��B
	 * @param c ��C
	 */
	public void hanoi(int n, char a, char b, char c) {
		if(n > 0) {
			hanoi(n - 1, a, c, b);
			System.out.println("move dish " + n + " : " + a + " -> " + b);
			hanoi(n - 1, c, b, a);
		}
	}
	
	public static void main(String[] args) {
		Example005 ex005 = new Example005();
		ex005.hanoi(3, 'A', 'B', 'C');
	}

}
