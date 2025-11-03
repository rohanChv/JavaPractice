import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Long startTime=System.currentTimeMillis();
        List<Employee> emp=new ArrayList<>();
        for(int i=0;i<500000;i++){
            emp.add(new Employee("ROBYohubkjhblkbvgfdxsgzaaSDFG##%%%#@!$".concat(Integer.toString(i)),"RONSDNSJKNDVOUIREVWYLRHJKNA;DSK","USA",(Math.random()*1000)));
        }

        SXSSFWorkbook workbook=new SXSSFWorkbook();
        SXSSFSheet sheet= workbook.createSheet("Country_List");
        List<String> headers=Arrays.asList("Name","Surname","Country","Salary");
        SXSSFRow row= sheet.createRow(0);
        for(int i=0;i< headers.size();i++){
                SXSSFCell cell=row.createCell(i);
                cell.setCellValue(headers.get(i));
        }
        ExecutorService ex= Executors.newFixedThreadPool(10);
        int counter=1;
        for(Employee e:emp){
            SXSSFRow row1= sheet.createRow(counter);
            ++counter;
            headers=Arrays.asList(e.getName(),e.getSurName(),e.getCountry(),e.getSalary().toString());
            List<String> finalHeaders = headers;
            System.out.println(counter);
                for(int i = 0; i< finalHeaders.size(); i++){
                    assert false;
                    row1.createCell(i).setCellValue(finalHeaders.get(i));
                }
        }
        FileOutputStream fos=new FileOutputStream(new File("Country_List.xlsx"));
        workbook.write(fos);
        startTime=System.currentTimeMillis()-startTime;
        System.out.println(startTime/1000);
    }
}