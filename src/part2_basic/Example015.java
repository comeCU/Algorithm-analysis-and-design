package part2_basic;
/**
 * 
 * @ClassName: Example015 
 * @Description: 顾客买东西，售货员用最少的钱币找给顾客
 * @author dong 
 * @date Sep 29, 2018 9:16:05 PM 
 * @keywords : 
 *
 */
public class Example015 {
    
    public static int[] COINS = {0, 50, 20, 10, 5, 2, 1};   // 钱币面额种类，100不包含其中
    /**
     * 
     * @param price 应付商品总价
     * @param pay 未找零之前所付的钱
     * @return saveArr 返回保存各面额钱币的数量数组，从数组下标为1 的元素开始有效
     */
    public int[] getLeastCoin(int price, int pay) {
        int change = pay - price;
        int[] saveArr = new int[7];
        int a = 0;
        for (int i = 1; i < COINS.length; i++) {
            a = change / COINS[i];
            saveArr[i] = a;
            change -= a * COINS[i];
        }
        return saveArr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Example015 ex15 = new Example015();
        int[] arr = ex15.getLeastCoin(23, 100);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != 0) {
                System.out.println(COINS[i] + " 元纸币 ------ " + arr[i] + "张");
            }
        }
    }

}
