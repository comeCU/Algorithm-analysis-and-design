package part2_basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Example016 
 * @Description: 求x，使x^2为一个各位数字互不相同的9位数
 * @author dong 
 * @date Sep 27, 2018 11:31:19 AM 
 * @keywords : 枚举法、数组记录状态信息
 *
 */
public class Example016 {
    /**
     * 
     * @return list保存所有使x^2为一个各位数字互不相同的9位数的 x值
     */
    public List<Integer> getNumPowerNotRepeat() {
        ArrayList<Integer> list =  new ArrayList<>();
        int[] arr = new int[10];
        for(int n = 10000; n< 32000; n++) { // 估算取值区间在[10000,32000)
            for (int i = 0; i < arr.length; i++) {  // 必须初始化？该段代码注释掉将会运行不出结果！
                arr[i] = 0;
            }
            
            int total = n * n;
            int y = total;
            int k = 0;  // 记录不重复次数
            int index = 0;  // 标记位
            for(int i = 0; i< 9; i++) { // 循环次数为9次
                index = total % 10;
                total /= 10;
                if (arr[index] == 0) {
                    arr[index] = 1; // 标记
                    k++;
                } else {
                    break;
                }
            }
            if(k == 9) {
                list.add(n);
                list.add(y);    // 将该9位数添加到list中
            }
        }
        return list;
    }
    
    /*
     * 测试new创建数组初始化
     */
    /*public void testInitArr() {
        int[] arr = new int[5];
        System.out.println(arr[0]);
    }*/

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example016 ex16 = new Example016();
        List<Integer> list = ex16.getNumPowerNotRepeat();
        for (int i = 0; i < list.size();) {
            System.out.print("第" + (i+1) + "个： " + list.get(i));
            System.out.println("  the power:" + list.get(i+1));
            i = i+2;
        }
        
//        ex16.testInitArr();
        
    }

}
