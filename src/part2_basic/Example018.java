package part2_basic;
/**
 * 
 * @ClassName: Example018 
 * @Description: 高精度数据 * 长整数
 * @author: dong
 * @date: 2018年10月8日 下午4:53:15 
 * @keyword: 
 *
 */
public class Example018 {

    /**
     * 高精度数据 * 长整数，并将结果存储在数组中
     * @param s1 存储高精度数据的字符数组
     * @param num 长整型数
     * @return 返回结果数组
     * @version 1.0
     */
    public int[] saveLargeInteger(char[] s1, long num) {
        long bitOfProduct = 0;   // 高精度数据保存在字符数组中每一位的乘积
        int[] save = new int[256];
        int len = s1.length;
        int carry = 0; // 进位
        int i, j;
        for(i = 0, j = len - 1; i < len; i++, j--) {
            bitOfProduct = ((s1[j] - 48) * num + carry);  // 获得每位数的乘积
            save[i] = (int) (bitOfProduct % 10);    // bitOfProduct为长整型，需强转
            carry = (int)bitOfProduct / 10;
        }
        while(carry != 0) { // 最后的进位
            save[len] = carry % 10;
            carry /= 10;
            len++;
        }
        return save;
    }
     
    /**
     * 高精度数据 * 长整数，并将结果存储在数组中
     * @param str 存储高精度数据的字符串数组
     * @param num 长整型数
     * @return 返回结果数组
     * @version 2.0
     */
    public int[] saveLargeInteger2(String str, long num) {
        long bitOfProduct = 0;
        int carry = 0;  // 进位
        int len = str.length();
        int[] save = new int[256];
        
        int i = 0;
        int j = len - 1;
        for(; j >= 0; j--, i++) {
            bitOfProduct = (str.charAt(j) - 48) * num + carry;
            save[i] = (int) (bitOfProduct % 10);
            carry = (int) (bitOfProduct / 10);
        }
        while(carry != 0) {
            save[len] = carry % 10;
            carry /= 10;
        }
        return save;
    }
    
    /**
     * 打印输出
     * @param save 存储结果的数组
     */
    public void printSaveLargeInteger(int[] save) {
        int i = save.length - 1;
        int j = 0;
        for (; i >=0; i--) {
            if(save[i] != 0) {  // 记录有效数据所在的数组下标
                j = i;
                break;
            }
        }
        for (; j >= 0; j--) {   // 开始输出有效数据
            System.out.print(save[j]);
        }
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Example018 ex18 = new Example018();
        /*char[] s1 = {'3', '6', '9', '1', '2', '3', '3', '4', '5', '9', '6', '7', '4', '6', '5'};
        int[] arr = ex18.saveLargeInteger(s1, 6);
        ex18.printSaveLargeInteger(arr);*/
        
        System.out.println();
        int[] arr2 = ex18.saveLargeInteger2("369123345967465", 6);
        ex18.printSaveLargeInteger(arr2);
    }

}
