package part2_basic;

import java.util.ArrayList;

/**
 * 
 * @ClassName: Example014 
 * @Description: �����ֱ�ŷ���ΪӢ��
 * @author dong 
 * @date Sep 26, 2018 7:14:29 PM 
 * @keywords : 
 *
 */
public class Example014 {
    
    /**
     * �����ֱ�ŷ���ΪӢ��
     * @param n �������ֱ��
     * @return String�ַ���
     */
    public String numTranslate(int n) {
        StringBuilder sb = new StringBuilder();
        String[] data = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "night"};
        ArrayList<String> list = new ArrayList<>();
        while(n > 0) {
            list.add(data[n % 10]); // ��list�б����Ӧ��Ӣ��
            n /= 10;
        }
        sb.append(list.get(list.size() - 1));
        for (int i = list.size() - 2; i >= 0; i--) {    // ����ƴ���ַ���
            sb.append("-" + list.get(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Example014 ex014 = new Example014();
        System.out.println(ex014.numTranslate(35706));
    }

}
