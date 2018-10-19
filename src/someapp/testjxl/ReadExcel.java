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
     * @param filePath ��Ҫ��ȡ��Excel�ļ�·��
     * @param column ��Ҫ��ȡExcel�ļ�����������
     * @param startRow ��ӦExcel���е���ʼ��
     * @return ���������в��ظ����ݵ�list
     */
    public List<String> myReadExcel(String filePath, int column, int startRow) {
        list = new ArrayList<>();   // ArrayList ���ڲ���ʹ�ÿɉ�������ʵ�ֵģ���������get��set�����ǻ��ѳ���ʱ���
        try {
            Workbook book = Workbook.getWorkbook(new File(filePath));
            Sheet sheet = book.getSheet(0); // ��õ�һ�Ź��������
            Cell cell = null;  // ��Ԫ�����            
            
            int rows = sheet.getRows(); // ��ȡ������������
            int row = startRow - 1;    // ��ʼ��,�ӵ�0�п�ʼ
            while(row < rows) { // 
                cell = sheet.getCell(column - 1, row);   // ��һ������Ϊ�У��ڶ�������Ϊ�С����λ�ȡָ���еĵ�Ԫ�����
                String result = cell.getContents(); // ��ȡ��Ԫ�������
                String[] str = result.split(";");
                
                for (int i = 0; i < str.length; i++) {  // 
                    if(!list.contains(str[i])) {    // ȥ�ء����list�в����ڸ��ַ����������
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
     * ��ȡ�����ݣ�������ȥ��
     * @param filePath ��Ҫ��ȡ��Excel�ļ�·��
     * @param column ��Ҫ��ȡExcel�ļ�����������
     * @param startRow ��ӦExcel���е���ʼ��
     * @return list
     */
    public List<String> myReadColumn(String filePath, int column, int startRow) {
        list = new ArrayList<>();   // ArrayList ���ڲ���ʹ�ÿɉ�������ʵ�ֵģ���������get��set�����ǻ��ѳ���ʱ���
        try {
            Workbook book = Workbook.getWorkbook(new File(filePath));
            Sheet sheet = book.getSheet(0); // ��õ�һ�Ź��������
            Cell cell = null;  // ��Ԫ�����
            
            int rows = sheet.getRows(); // ��ȡ������������
            int row = startRow - 1;    // ��ʼ��,�ӵ�0�п�ʼ
            while(row < rows) { // 
                cell = sheet.getCell(column - 1, row);   // ��һ������Ϊ�У��ڶ�������Ϊ�С����λ�ȡָ���еĵ�Ԫ�����
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
    
    // ����jxl getRows����
    /*public void testGetRows(String filePath) {
        Workbook book;
        try {
            book = Workbook.getWorkbook(new File(filePath));
            Sheet sheet = book.getSheet(0); // ��õ�һ�Ź��������
            Cell cell;  // ��Ԫ�����
            int rows = sheet.getRows(); // ��ȡ������������
            
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
