package someapp.testjxl;

import java.util.ArrayList;
import java.util.List;

/**
 * ���ڻ�ȡExcel��ָ���������� ��Ӧ��һϵ��ָ��
 * @ClassName: MyTarget 
 * @Description: 
 * @author: dong
 * @date: 2018��10��16�� ����8:16:09 
 * @keyword: 
 *
 */
public class MyTarget {
    private ReadExcel read;
    
    /**
     * ���ڱ���source Excel�ļ���ָ��������
     */
    private List<String> GIDs_list = new ArrayList<>();
    private List<String> target01_list = new ArrayList<>();
    private List<String> target02_list = new ArrayList<>();
    private List<String> target03_list = new ArrayList<>();
    
    public ReadExcel getRead() {
        return read;
    }


    public List<String> getGIDs_list() {
        return GIDs_list;
    }


    public List<String> getTarget01_list() {
        return target01_list;
    }


    public List<String> getTarget02_list() {
        return target02_list;
    }


    public List<String> getTarget03_list() {
        return target03_list;
    }


    /**
     * ��ȡsource Excel����ָ���������� �������ڸ��Ե�list��
     * @param filePath �ļ�·��
     * @param list ÿһ�е�������һ��list����
     * @param column ��
     * @param startRow ��ʼ��
     * @return list �����˸�������
     */
    public List<String> getMyList(String filePath, int column, int startRow) {
        read = new ReadExcel();
        List<String> list = new ArrayList<>();
        list = read.myReadColumn(filePath, column, startRow);
        
        return list;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        /*MyTarget target = new MyTarget();
        String filePath = "C:\\Users\\Administrator\\Desktop\\source.xls";
        List<String> list = target.getMyList(filePath, target.GIDs_list, 2, 2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        
    }

}
