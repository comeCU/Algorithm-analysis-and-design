package part2_basic;
/**
 * 
 * @ClassName: Example015 
 * @Description: �˿��������ۻ�Ա�����ٵ�Ǯ���Ҹ��˿�
 * @author dong 
 * @date Sep 29, 2018 9:16:05 PM 
 * @keywords : 
 *
 */
public class Example015 {
    
    public static int[] COINS = {0, 50, 20, 10, 5, 2, 1};   // Ǯ��������࣬100����������
    /**
     * 
     * @param price Ӧ����Ʒ�ܼ�
     * @param pay δ����֮ǰ������Ǯ
     * @return saveArr ���ر�������Ǯ�ҵ��������飬�������±�Ϊ1 ��Ԫ�ؿ�ʼ��Ч
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
                System.out.println(COINS[i] + " Ԫֽ�� ------ " + arr[i] + "��");
            }
        }
    }

}
