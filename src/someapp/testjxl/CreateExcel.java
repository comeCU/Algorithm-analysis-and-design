package someapp.testjxl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class CreateExcel {
    
    /**
     * ��list�е�����д��Excel�����ٴε����������������ļ�·����ͬ�����ݲ�����׷����ʽд��
     * @param list ������ʱ�������
     * @param filePath ��Ҫд���Excel�ļ�·��
     * @param column д���Excel�ļ�����������
     * @param startRow ��ʼ�У�����һ�п�ʼд��
     */
    public void myWriteExcel(List<String> list, String filePath, int column, int startRow) {
        WritableWorkbook book = null;
        WritableSheet sheet = null;
        jxl.write.Label label;
        try {
            // ���ļ�
            book = Workbook.createWorkbook(new File(filePath));
            
            // ������Ϊ��һҳ�Ĺ���������0��ʾ���ǵ�һҳ
            sheet = book.createSheet("��һҳ", 0);
            // listд��
            for (int i = 0; i < list.size(); i++) {
                label = new jxl.write.Label(column - 1, startRow - 1, list.get(i));
                sheet.addCell(label);
                startRow ++;
            }
            
            book.write();
            book.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RowsExceededException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (WriteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * ����������е�����һ����д��Excel�ļ���ͬ������׷�ӡ�
     * @param list ListǶ�׵�List
     * @param filePath ��Ҫд���Excel�ļ�·��
     * @param column ��ʼ�У�����һ�п�ʼд��
     * @param startRow ��ʼ�У�����һ�п�ʼд��
     */
    public void myTotalWriteExcel(List<List<String>> list, String filePath, int column, int startRow) {
        WritableWorkbook book = null;
        WritableSheet sheet = null;
        jxl.write.Label label;
        try {
            // ���ļ�
            book = Workbook.createWorkbook(new File(filePath));
            // ������Ϊ��һҳ�Ĺ���������0��ʾ���ǵ�һҳ
            sheet = book.createSheet("��һҳ", 0);  
            // һ��һ��д��
            for (int i = 0; i < list.get(0).size(); i++) {  // ��
                int reColumn = column;  // ���·�����ʼ��
                for (int j = 0; j < list.size(); j++) { // ��
                    label = new jxl.write.Label(reColumn - 1, startRow - 1, list.get(j).get(i));
                    sheet.addCell(label);
                    reColumn ++;
                }
                startRow++;
            }
            
            book.write();
            book.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (RowsExceededException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (WriteException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            System.out.println("OK");
        }
    }
    
    public static void main(String args[]) {
        
        
    }
    
}
