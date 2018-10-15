package part3_core;
/**
 * 
 * @ClassName: Example013 
 * @Description: �������
 * @author: dong
 * @date: 2018��10��12�� ����2:13:12 
 * @keyword: ���Ͷ��ַ�����������
 *
 */
public class Example013 {
    /**
     *  ������Сֵ�����ֵ������
     *  saveMinAndMax[0]������Сֵ,saveMinAndMax[1]�������ֵ
     */
    private static final float[] saveMinAndMax = new float[2];
    private static float leftMax, leftMin, rightMax, rightMin;
    
    /**
     * ���һ����������ָ����Χ�����ݵ���Сֵ�����ֵ
     * @param arr �������飬һ����������
     * @param first �����±꣺�������ݷ�Χ����
     * @param last �����±꣺�������ݷ�Χ����
     * @return ���ر�������Сֵ�����ֵ�����飬��һ��Ԫ��saveMinAndMax[0]Ϊ��Сֵ���ڶ���Ԫ��saveMinAndMax[1]Ϊ���ֵ
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
