package part3_core;
/**
 * 
 * @ClassName: Example012 
 * @Description: ��������
 * @author dong 
 * @date Oct 11, 2018 8:21:14 PM 
 * @keywords : 
 *
 */
public class Example012 {
    /**
     * ����ͷŵķ��䡣��ʼֵΪ0�� 1��ʾ������0 ��ʾ����
     * @param num ��������
     * @return ����save���鱣���ͷŵķ����
     */
    public int[] getFreeMan(int num) {
        int[] save = new int[num+1];
        for(int i = 1; i< save.length; i++) {
            for(int j = i; j< save.length; j = j + i) { // ���� +i
                save[j] = 1 - save[j];  // ���ƿ���
            }
        }
        return save;
    }
    
    public void printFreeMan(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 1) {
                System.out.print(i + " ");
            }
//            System.out.println(arr[i]);
        }
    }
    

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Example012 example012 = new Example012();
        int[] arr = example012.getFreeMan(5);
        example012.printFreeMan(arr);
        
    }

}
