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
        List<String> list = read.myReadExcel(dataFilePath, 2, 1);   // 接收test.xls表中的一列不重复ID
        
        CreateExcel create = new CreateExcel();
        String outFilePath = "C:\\Users\\Administrator\\Desktop\\out.xls";
        
        MyTarget target = new MyTarget();
        String sourceFilePath = "C:\\Users\\Administrator\\Desktop\\source.xls";
        // 保存source.xls表中的全部GIDs
        List<String> source_GIDs_list = target.getMyList(sourceFilePath, 1, 2);
        List<String> source_target01_list = target.getMyList(sourceFilePath, 2, 2);
        List<String> source_target02_list = target.getMyList(sourceFilePath, 3, 2);
        List<String> source_target03_list = target.getMyList(sourceFilePath, 4, 2);
        
        // 测试各list中保存的数据
        /*for (int i = 0; i < source_GIDs_list.size(); i++) {
            System.out.println(source_GIDs_list.get(i));
        }*/
        
        for (int i = 0; i < list.size(); i++) {
            if(source_GIDs_list.contains(list.get(i))) {    // 如果匹配到该GIDs字符串
                int index = source_GIDs_list.indexOf(list.get(i));  // 获取对照表中的该条记录的下标
                Client.save_GIDs_list.add(source_GIDs_list.get(index)); // 依次存入结果表的各项list
                Client.save_target01_list.add(source_target01_list.get(index));
                Client.save_target02_list.add(source_target02_list.get(index));
                Client.save_target03_list.add(source_target03_list.get(index));
            }
        }
        
        // 设置List嵌套List保存方便数据输出
        List<List<String>> totalList = new ArrayList<>();
        totalList.add(save_GIDs_list);
        totalList.add(save_target01_list);
        totalList.add(save_target02_list);
        totalList.add(save_target03_list);
        
        // 整体数据输出
        create.myTotalWriteExcel(totalList, outFilePath, 1, 1);
        
        
    }

}
