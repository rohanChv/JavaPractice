package org.example;
import org.apache.poi.xssf.streaming.SXSSFCell;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.employee.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("GENERATING DATA");
        long time=System.currentTimeMillis();
        List<Employee> emp=new ArrayList<>();
        for (int i = 1; i <= 1000000; i++) {
            emp.add(new Employee("RAJkjhkjbjbjbjbjbjbjbjbjbjbjbjbjbjbjbjhbjhbjbjbjbhjbjknknlkmluliouoi".concat(Integer.toString(i)),"ROBObbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbT","asjchaisnxiansxiansxianixsnaisxniasnx",(Math.random()*10000)));
        }
        System.out.println("...GENERATED "+emp.size());
        SXSSFWorkbook workbook=new SXSSFWorkbook();
        SXSSFSheet sheet=workbook.createSheet();
        List<String>headerList= Arrays.asList("Name","Surname","Project","Salary");
        SXSSFRow row=sheet.createRow(0);
        AtomicInteger counter= new AtomicInteger();
        for(String s : headerList){
            SXSSFCell cell=row.createCell(counter.get());
            counter.incrementAndGet();
            cell.setCellValue(s);
        }
        ExecutorService ex= Executors.newFixedThreadPool(10);
            emp.forEach(e->{
                ex.execute(() -> {
                    Lock lock = new ReentrantLock();
                    lock.lock();
                    SXSSFRow row1 = sheet.createRow(emp.indexOf(e));
                    row1.createCell(0).setCellValue(e.getName());
                    row1.createCell(1).setCellValue(e.getSurname());
                    row1.createCell(2).setCellValue(e.getProject());
                    row1.createCell(3).setCellValue(e.getSalary());
                });

                //
            });
            FileOutputStream fos= null;
            try {
                fos = new FileOutputStream("OUTPUT.xlsx");
            } catch (FileNotFoundException exc) {
                throw new RuntimeException(exc);
            }
            try {
                workbook.write(fos);
            } catch (IOException exc) {
                throw new RuntimeException(exc);
            }
            Runtime r=Runtime.getRuntime();
        workbook.dispose();
        time=System.currentTimeMillis()-time;
        System.out.println("TIME TAKEN"+(time/1000));
    }
}