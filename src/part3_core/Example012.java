package part3_core;
/**
 * 
 * @ClassName: Example012 
 * @Description: 狱吏问题
 * @author dong 
 * @date Oct 11, 2018 8:21:14 PM 
 * @keywords : 
 *
 */
public class Example012 {
    /**
     * 获得释放的房间。初始值为0， 1表示开锁，0 表示闭锁
     * @param num 房间总数
     * @return 返回save数组保存释放的房间号
     */
    public int[] getFreeMan(int num) {
        int[] save = new int[num+1];
        for(int i = 1; i< save.length; i++) {
            for(int j = i; j< save.length; j = j + i) { // 步长 +i
                save[j] = 1 - save[j];  // 控制开关
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
