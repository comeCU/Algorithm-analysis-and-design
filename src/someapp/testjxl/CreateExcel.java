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
     * 将list中的数据写入Excel表，当再次调用这个方法且输出文件路径相同，数据不能以追加形式写入
     * @param list 链表暂时存放数据
     * @param filePath 需要写入的Excel文件路径
     * @param column 写入的Excel文件数据所在列
     * @param startRow 起始行，从这一行开始写入
     */
    public void myWriteExcel(List<String> list, String filePath, int column, int startRow) {
        WritableWorkbook book = null;
        WritableSheet sheet = null;
        jxl.write.Label label;
        try {
            // 打开文件
            book = Workbook.createWorkbook(new File(filePath));
            
            // 生成名为第一页的工作表，参数0表示这是第一页
            sheet = book.createSheet("第一页", 0);
            // list写入
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
     * 将多个链表中的数据一行行写入Excel文件。同样不能追加。
     * @param list List嵌套的List
     * @param filePath 需要写入的Excel文件路径
     * @param column 起始列，从这一列开始写入
     * @param startRow 起始行，从这一行开始写入
     */
    public void myTotalWriteExcel(List<List<String>> list, String filePath, int column, int startRow) {
        WritableWorkbook book = null;
        WritableSheet sheet = null;
        jxl.write.Label label;
        try {
            // 打开文件
            book = Workbook.createWorkbook(new File(filePath));
            // 生成名为第一页的工作表，参数0表示这是第一页
            sheet = book.createSheet("第一页", 0);  
            // 一行一行写入
            for (int i = 0; i < list.get(0).size(); i++) {  // 行
                int reColumn = column;  // 重新返回起始列
                for (int j = 0; j < list.size(); j++) { // 列
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
