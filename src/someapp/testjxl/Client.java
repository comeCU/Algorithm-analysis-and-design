package someapp.testjxl;

import java.util.ArrayList;
import java.util.List;

public class Client {
    
    private static List<String> save_GIDs_list = new ArrayList<>();
    private static List<String> save_target01_list = new ArrayList<>();
    private static List<String> save_target02_list = new ArrayList<>();
    private static List<String> save_target03_list = new ArrayList<>();

    public static void main(String[] args) {
        
        ReadExcel read = new ReadExcel();
        String dataFilePath = "C:\\Users\\Administrator\\Desktop\\test.xls";
        List<String> list = read.myReadExcel(dataFilePath, 2, 1);   // ����test.xls���е�һ�в��ظ�ID
        
        CreateExcel create = new CreateExcel();
        String outFilePath = "C:\\Users\\Administrator\\Desktop\\out.xls";
        
        MyTarget target = new MyTarget();
        String sourceFilePath = "C:\\Users\\Administrator\\Desktop\\source.xls";
        // ����source.xls���е�ȫ��GIDs
        List<String> source_GIDs_list = target.getMyList(sourceFilePath, 1, 2);
        List<String> source_target01_list = target.getMyList(sourceFilePath, 2, 2);
        List<String> source_target02_list = target.getMyList(sourceFilePath, 3, 2);
        List<String> source_target03_list = target.getMyList(sourceFilePath, 4, 2);
        
        // ���Ը�list�б��������
        /*for (int i = 0; i < source_GIDs_list.size(); i++) {
            System.out.println(source_GIDs_list.get(i));
        }*/
        
        for (int i = 0; i < list.size(); i++) {
            if(source_GIDs_list.contains(list.get(i))) {    // ���ƥ�䵽��GIDs�ַ���
                int index = source_GIDs_list.indexOf(list.get(i));  // ��ȡ���ձ��еĸ�����¼���±�
                Client.save_GIDs_list.add(source_GIDs_list.get(index)); // ���δ�������ĸ���list
                Client.save_target01_list.add(source_target01_list.get(index));
                Client.save_target02_list.add(source_target02_list.get(index));
                Client.save_target03_list.add(source_target03_list.get(index));
            }
        }
        
        // ����ListǶ��List���淽���������
        List<List<String>> totalList = new ArrayList<>();
        totalList.add(save_GIDs_list);
        totalList.add(save_target01_list);
        totalList.add(save_target02_list);
        totalList.add(save_target03_list);
        
        // �����������
        create.myTotalWriteExcel(totalList, outFilePath, 1, 1);
        
        
    }

}
