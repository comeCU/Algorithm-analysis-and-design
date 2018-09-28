package part2_basic;
/**
 * 
 * @ClassName: Example013 
 * @Description: �ҳ�3��ȫ�����ѧ������
 * @author dong 
 * @date Sep 27, 2018 03:10:01 PM 
 * @keywords : 
 *
 */
public class Example013 {
    /**
     * 
     * @param stuCount ѧ��������
     * @param a �γ�a�����ѧ���������
     * @param b �γ�b�����ѧ���������
     * @param c �γ�c�����ѧ���������
     * @return arr ��������ѧ��ͨ���Ŀγ�����
     */
    public int[] getAllPassStudentsNum(int stuCount, int[] a, int[] b, int[] c) {
        int[] arr = new int[stuCount + 1];
        for (int i = 0; i < a.length; i++) {
            arr[a[i]]++;
        }
        for (int i = 0; i < b.length; i++) {
            arr[b[i]]++;
        }
        for (int i = 0; i < c.length; i++) {
            arr[c[i]]++;
        }
        return arr;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int[] language = {1,9,6,8,4,3,7};
        int[] algebra = {5,2,9,1,3,7};
        int[] english = {8,1,6,7,3,5,4,9};
        Example013 ex13 = new Example013();
        int[] arr = ex13.getAllPassStudentsNum(9, language, algebra, english);

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == 3) {
                System.out.println(i);
            }
            
        }
    }

}
