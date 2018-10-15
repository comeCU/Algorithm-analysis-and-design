package part3_core;
/**
 * 
 * @ClassName: Example013 
 * @Description: 金块问题
 * @author: dong
 * @date: 2018年10月12日 下午2:13:12 
 * @keyword: 典型二分法、蛮力策略
 *
 */
public class Example013 {
    /**
     *  保存最小值和最大值的数组
     *  saveMinAndMax[0]保存最小值,saveMinAndMax[1]保存最大值
     */
    private static final float[] saveMinAndMax = new float[2];
    private static float leftMax, leftMin, rightMax, rightMin;
    
    /**
     * 获得一组无序数据指定范围内数据的最小值和最大值
     * @param arr 输入数组，一组无序数据
     * @param first 数组下标：查找数据范围下限
     * @param last 数组下标：查找数据范围上限
     * @return 返回保存了最小值和最大值的数组，第一个元素saveMinAndMax[0]为最小值，第二个元素saveMinAndMax[1]为最大值
     */
    public float[] getMinAndMax1(float[] arr, int first, int last) {
        float min = arr[first];
        float max = arr[first];
        for (int i = first; i < last; i++) {
            if(max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        saveMinAndMax[0] = min;
        saveMinAndMax[1] = max;
        
        return saveMinAndMax;
    }
    
    /*public float[] getMinAndMax2(float[] arr, int first, int last) {
        int mid;
//        float leftMax, leftMin, rightMax, rightMin;
        if(first == last) {
            saveMinAndMax[0] = arr[first];
            saveMinAndMax[1] = arr[first];
        } else if (first == last - 1) {
            if(arr[first] < arr[last]) {
                saveMinAndMax[0] = arr[first];
                saveMinAndMax[1] = arr[last];
            } else {
                saveMinAndMax[0] = arr[last];
                saveMinAndMax[1] = arr[first];
            }
        } else {
            mid = (first + last) / 2;
            saveMinAndMax = getMinAndMax2(arr, first, mid);
            saveMinAndMax = getMinAndMax2(arr, mid + 1, last);
            if(saveMinAndMax[0]) {
                
            }
            
        }
        
        
    }*/
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Example013 example013 = new Example013();
        float[] arr = {1.2323f, 23.2f, 10.0f, 20};
        
        float[] minAndMax = example013.getMinAndMax1(arr, 2, 4);
        System.out.println("min:" + minAndMax[0]);
        System.out.println("max:" + minAndMax[1]);
    }

}
