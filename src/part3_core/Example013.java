package part3_core;

/**
 * 
 * @ClassName: Example013 
 * @Description: 金块问题
 * @author dong 
 * @date Oct 15, 2018 11:10:39 PM 
 * @keywords : 典型二分法、蛮力策略
 *
 */
public class Example013 {
    /**
     * 保存最终结果最小值和最大值的数组
     * saveMinAndMax[0]保存最小值,saveMinAndMax[1]保存最大值
     */
    private static float[] saveMinAndMax = new float[2];
    /**
     * 左分组数据保存结果最小值和最大值的数组
     * saveLeftMinAndMax[0]保存左分组最小值,saveLeftMinAndMax[1]保存左分组最大值
     */
    private static float[] saveLeftMinAndMax = new float[2];
    /**
     * 右分组数据保存结果最小值和最大值的数组
     * saveRightMinAndMax[0]保存右分组最小值,saveRightMinAndMax[1]保存右分组最大值
     */
    private static float[] saveRightMinAndMax = new float[2];
    
    /**
     * 蛮力策略。获得一组无序数据指定范围内数据的最小值和最大值
     * @param arr 输入数组，一组无序数据
     * @param first 数组下标：查找数据范围下限
     * @param last 数组下标：查找数据范围上限
     * @return 返回保存了最小值和最大值的数组，第一个元素saveMinAndMax[0]为最小值，第二个元素saveMinAndMax[1]为最大值
     */
    public float[] getMinAndMax1(float[] arr, int first, int last) {
        saveMinAndMax[0] = arr[first];
        saveMinAndMax[1] = arr[first];
        for (int i = first; i < last; i++) {
            if(saveMinAndMax[1] < arr[i]) {
                saveMinAndMax[1] = arr[i];
            } else if (saveMinAndMax[0] > arr[i]) {
                saveMinAndMax[0] = arr[i];
            }
        }
        
        return saveMinAndMax;
    }
    
    /**
     * 二分法策略。获得一组无序数据指定范围内数据的最小值和最大值
     * @param arr
     * @param first
     * @param last
     * @return
     */
    public float[] getMinAndMax2(float[] arr, int first, int last) {
        int mid;
        if(first == last) {
            saveMinAndMax[0] = arr[first];
            saveMinAndMax[1] = arr[first];
        } else if (first == last - 1) {
            if(arr[first] < arr[last]) {
                saveMinAndMax[1] = arr[last];
            } else {
                saveMinAndMax[0] = arr[first];
            }
        } else {
            mid = (first + last) / 2;
            saveLeftMinAndMax = getMinAndMax2(arr, first, mid);
            saveRightMinAndMax = getMinAndMax2(arr, mid + 1, last);
            if(saveLeftMinAndMax[1] > saveRightMinAndMax[1]) {
                saveMinAndMax[1] = saveLeftMinAndMax[1];
            } else {
                saveMinAndMax[1] = saveRightMinAndMax[1];
            }
            if(saveLeftMinAndMax[0] > saveRightMinAndMax[0]) {
                saveMinAndMax[0] = saveRightMinAndMax[0];
            } else {
                saveMinAndMax[0] = saveLeftMinAndMax[0];
            }
        }
        
        return saveMinAndMax;
    }
    
    public static void main(String[] args) {

        Example013 example013 = new Example013();
        float[] arr = {1.2323f, 23.2f, 10.0f, 20, 99.0f};
        
        // 测试version 1.0
        /*float[] save = example013.getMinAndMax1(arr, 1, 3);
        System.out.println("min:" + save[0]);
        System.out.println("max:" + save[1]);*/
        
        // 测试version 2.0
        float[] saveMinAndMax = example013.getMinAndMax2(arr, 0, 4);
        System.out.println("min:" + saveMinAndMax[0]);
        System.out.println("max:" + saveMinAndMax[1]);
    }

}
