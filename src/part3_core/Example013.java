package part3_core;

/**
 * 
 * @ClassName: Example013 
 * @Description: �������
 * @author dong 
 * @date Oct 15, 2018 11:10:39 PM 
 * @keywords : ���Ͷ��ַ�����������
 *
 */
public class Example013 {
    /**
     * �������ս����Сֵ�����ֵ������
     * saveMinAndMax[0]������Сֵ,saveMinAndMax[1]�������ֵ
     */
    private static float[] saveMinAndMax = new float[2];
    /**
     * ��������ݱ�������Сֵ�����ֵ������
     * saveLeftMinAndMax[0]�����������Сֵ,saveLeftMinAndMax[1]������������ֵ
     */
    private static float[] saveLeftMinAndMax = new float[2];
    /**
     * �ҷ������ݱ�������Сֵ�����ֵ������
     * saveRightMinAndMax[0]�����ҷ�����Сֵ,saveRightMinAndMax[1]�����ҷ������ֵ
     */
    private static float[] saveRightMinAndMax = new float[2];
    
    /**
     * �������ԡ����һ����������ָ����Χ�����ݵ���Сֵ�����ֵ
     * @param arr �������飬һ����������
     * @param first �����±꣺�������ݷ�Χ����
     * @param last �����±꣺�������ݷ�Χ����
     * @return ���ر�������Сֵ�����ֵ�����飬��һ��Ԫ��saveMinAndMax[0]Ϊ��Сֵ���ڶ���Ԫ��saveMinAndMax[1]Ϊ���ֵ
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
     * ���ַ����ԡ����һ����������ָ����Χ�����ݵ���Сֵ�����ֵ
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
        
        // ����version 1.0
        /*float[] save = example013.getMinAndMax1(arr, 1, 3);
        System.out.println("min:" + save[0]);
        System.out.println("max:" + save[1]);*/
        
        // ����version 2.0
        float[] saveMinAndMax = example013.getMinAndMax2(arr, 0, 4);
        System.out.println("min:" + saveMinAndMax[0]);
        System.out.println("max:" + saveMinAndMax[1]);
    }

}
