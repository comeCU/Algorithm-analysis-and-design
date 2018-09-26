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
     * @version 1.0
     */
    /*public String numTranslate(int num) {
        StringBuilder sb = new StringBuilder();
        String[] data = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "night"};
        ArrayList<String> list = new ArrayList<>();
        while(num > 0) {
            list.add(data[num % 10]); // ��list�б����Ӧ��Ӣ��
            num /= 10;
        }
        sb.append(list.get(list.size() - 1));
        for (int i = list.size() - 2; i >= 0; i--) {    // ����ƴ���ַ���
            sb.append("-" + list.get(i));
        }
        return sb.toString();
    }*/
    
    /**
     * �����ֱ�ŷ���ΪӢ��
     * @param num �ַ������ͱ��
     * @return �����ַ���
     * @version 2.0
     */
    public String numTranslate(String num) {
        StringBuilder sb = new StringBuilder();
        String[] data = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "night"};
        int len = num.length();
        if(len == 0) {
            return null;
        } else {
            sb.append(data[(num.charAt(0) - 48)]);   // �ַ�'0'��ASCII��Ϊ48�����ַ�-48�� Ϊ��Ӧ������ֵ
            for (int i = 1; i <= len - 1; i++) {
                sb.append("-" + data[(num.charAt(i) - 48)]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Example014 ex014 = new Example014();
//        System.out.println(ex014.numTranslate(35706));
        System.out.println(ex014.numTranslate("001"));
    }

}
