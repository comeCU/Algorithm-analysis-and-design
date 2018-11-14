package part3_core;
/**
 * 
 * @ClassName: Example017 
 * @Description: 选择问题：求一组数的第二小的数据
 * @author: dong
 * @date: 2018年10月28日 下午8:02:17 
 * @keyword: 非等分分治
 *
 */
public class Example017 {
    /*
    private static float fmin2, fmin1;
    private static int mid;
    
    private static float[] lmin = new float[2];
    private static float[] rmin = new float[2];
    
    public float getSecondNum(float[] arr, int i, int j, float fmin2, float fmin1) {
//        this.fmin2 = fmin2;
//        this.fmin1 = fmin1;
        
        float lmin2 = 0, lmin1 = 0, rmin2 = 0, rmin1 = 0;
        
        if(i == j) {
            fmin2 = arr[i];
            fmin1 = arr[i];
        } else if(i == j - 1) {
            if(arr[i] < arr[j]) {
                fmin2 = arr[j];
                fmin1 = arr[i];
            } else {
                fmin2 = arr[i];
                fmin1 = arr[j];
            }
        } else {
            mid = (i + j) / 2;
            
            getSecondNum(arr, i, mid, lmin2, lmin1);
            getSecondNum(arr, mid + 1, j, rmin2, rmin1);
            
            // 总共4种情况
            if(lmin1 < rmin1) {
                if(lmin2 < rmin1) {
                    fmin1 = lmin1;
                    fmin2 = lmin2;
                } else {    // lmin2 >= rmin1
                    fmin1 = lmin1;
                    fmin2 = rmin1;
                }
            } else {    // lmin1 > rmin1
                if(rmin2 < lmin1) {
                    fmin1 = rmin1;
                    fmin2 = rmin2;
                } else {    // rmin2 >= lmin1
                    fmin1 = rmin1;
                    fmin2 = lmin1;
                }
            }
        }
        
        return fmin2;
    }*/
    
   /* public int findSecondSmallest(int[] A, int start, int end){
        if(end == start){
            return A[start];
//            return Integer.MAX_VALUE;
        }else if(start == end-1){
            
            return Math.max(A[start], A[end]);
        }else{
                int mid = start + (end-start)/2;
                int min1 = findSecondSmallest(A, start, mid);
                int min2 = findSecondSmallest(A, mid+1, end);

                
                return Math.min(min1, min2);    
        }
    } 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Example017 example017 = new Example017();
        int[] arr = {-2, 11, -4, 13, -5, -2};
        int a = example017.findSecondSmallest(arr, 0, 2);
        System.out.println(a);
    }
*/
}
