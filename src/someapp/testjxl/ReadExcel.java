package someapp.testjxl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel {
    private List<String> list = new ArrayList<>();

    /**
     * 
     * @param filePath 需要读取的Excel文件路径
     * @param column 需要读取Excel文件数据所在列
     * @param startRow 对应Excel表中的起始行
     * @return 保存了所有不重复数据的list
     */
    public List<String> myReadExcel(String filePath, int column, int startRow) {
        list = new ArrayList<>();   // ArrayList 的内部是使用可増长数组实现的，所以是用get和set方法是花费常数时间的
        try {
            Workbook book = Workbook.getWorkbook(new File(filePath));
            Sheet sheet = book.getSheet(0); // 获得第一张工作表对象
            Cell cell = null;  // 单元格对象            
            
            int rows = sheet.getRows(); // 获取工作表总行数
            int row = startRow - 1;    // 起始行,从第0行开始
            while(row < rows) { // 
                cell = sheet.getCell(column - 1, row);   // 第一个参数为列，第二个参数为行。依次获取指定列的单元格对象
                String result = cell.getContents(); // 获取单元格的内容
                String[] str = result.split(";");
                
                for (int i = 0; i < str.length; i++) {  // 
                    if(!list.contains(str[i])) {    // 去重。如果list中不存在该字符串，则添加
                        list.add(str[i]);
                    }
                }
                row++;
            }   
            
            book.close();
        } catch (BiffException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return list;
    }
    
    /**
     * 读取列数据，不考虑去重
     * @param filePath 需要读取的Excel文件路径
     * @param column 需要读取Excel文件数据所在列
     * @param startRow 对应Excel表中的起始行
     * @return list
     */
    public List<String> myReadColumn(String filePath, int column, int startRow) {
        list = new ArrayList<>();   // ArrayList 的内部是使用可増长数组实现的，所以是用get和set方法是花费常数时间的
        try {
            Workbook book = Workbook.getWorkbook(new File(filePath));
            Sheet sheet = book.getSheet(0); // 获得第一张工作表对象
            Cell cell = null;  // 单元格对象
            
            int rows = sheet.getRows(); // 获取工作表总行数
            int row = startRow - 1;    // 起始行,从第0行开始
            while(row < rows) { // 
                cell = sheet.getCell(column - 1, row);   // 第一个参数为列，第二个参数为行。依次获取指定列的单元格对象
                list.add(cell.getContents());
                row++;
            }   
            
            book.close();
        } catch (BiffException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return list;
    }
    
    // 测试jxl getRows方法
    /*public void testGetRows(String filePath) {
        Workbook book;
        try {
            book = Workbook.getWorkbook(new File(filePath));
            Sheet sheet = book.getSheet(0); // 获得第一张工作表对象
            Cell cell;  // 单元格对象
            int rows = sheet.getRows(); // 获取工作表总行数
            
            System.out.println(rows);
        } catch (BiffException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }*/
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub

//        ReadExcel read = new ReadExcel();
        /*List<String> list = read.myReadExcel("C:\\Users\\Administrator\\Desktop\\testApp.xls", 2, 2);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        
//        read.testGetRows("C:\\Users\\Administrator\\Desktop\\testApp.xls");
    }

}
