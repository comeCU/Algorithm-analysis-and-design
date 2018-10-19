package someapp.testjxl;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于获取Excel表指定的列数据 对应的一系列指标
 * @ClassName: MyTarget 
 * @Description: 
 * @author: dong
 * @date: 2018年10月16日 下午8:16:09 
 * @keyword: 
 *
 */
public class MyTarget {
    private ReadExcel read;
    
    /**
     * 用于保存source Excel文件的指定列数据
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
     * 获取source Excel表中指定的列数据 并保存在各自的list中
     * @param filePath 文件路径
     * @param list 每一列的数据用一个list保存
     * @param column 列
     * @param startRow 起始行
     * @return list 保存了该列数据
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
