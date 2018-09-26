package part2_basic;

import java.util.ArrayList;

/**
 * 
 * @ClassName: Example014 
 * @Description: 将数字编号翻译为英文
 * @author dong 
 * @date Sep 26, 2018 7:14:29 PM 
 * @keywords : 
 *
 */
public class Example014 {
    
    /**
     * 将数字编号翻译为英文
     * @param n 整型数字编号
     * @return String字符串
     */
    public String numTranslate(int n) {
        StringBuilder sb = new StringBuilder();
        String[] data = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "night"};
        ArrayList<String> list = new ArrayList<>();
        while(n > 0) {
            list.add(data[n % 10]); // 在list中保存对应的英文
            n /= 10;
        }
        sb.append(list.get(list.size() - 1));
        for (int i = list.size() - 2; i >= 0; i--) {    // 逆序拼接字符串
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
