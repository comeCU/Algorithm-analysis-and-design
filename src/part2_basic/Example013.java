package part2_basic;
/**
 * 
 * @ClassName: Example013 
 * @Description: 找出3科全及格的学生名单
 * @author dong 
 * @date Sep 27, 2018 03:10:01 PM 
 * @keywords : 
 *
 */
public class Example013 {
    /**
     * 
     * @param stuCount 学生总人数
     * @param a 课程a及格的学生编号数组
     * @param b 课程b及格的学生编号数组
     * @param c 课程c及格的学生编号数组
     * @return arr 返回所有学生通过的课程数量
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
