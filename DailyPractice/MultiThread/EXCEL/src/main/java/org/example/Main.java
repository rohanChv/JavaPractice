package org.example;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.employee.*;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.print("GENERATING DATA");
        long time=System.currentTimeMillis();
        List<Employee> emp=new ArrayList<>();
        for (int i = 1; i <= 100000; i++) {
            emp.add(new Employee("RAJkjhkjbjbjbjbjbjbjbjbjbjbjbjbjbjbjbjhbjhbjbjbjbhjbjknknlkmluliouoi".concat(Integer.toString(i)),"ROBObbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbT","asjchaisnxiansxiansxianixsnaisxniasnx",(Math.random()*10000)));
        }
        System.out.println("...GENERATED "+emp.size());
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet();
        List<String>headerList= Arrays.asList("Name","Surname","Project","Salary");
        XSSFRow row=sheet.createRow(0);
        AtomicInteger counter= new AtomicInteger();
        for(String s : headerList){
            XSSFCell cell=row.createCell(counter.get());
            counter.incrementAndGet();
            cell.setCellValue(s);
        }
        ExecutorService ex= Executors.newFixedThreadPool(2);
        AtomicInteger partOneCounter= new AtomicInteger(0);
        Future<String> taskOne= ex.submit(()->{
                try{
                    int start=0;
                    int end=emp.size()/2;
                    for(int i=start;i<end;i++) {
                        Employee e=emp.get(i);
                        XSSFRow row1;
                            synchronized (sheet) {
                                row1 = sheet.createRow(partOneCounter.incrementAndGet());
                            }
                                row1.createCell(0).setCellValue(e.getName());
                                row1.createCell(1).setCellValue(e.getSurname());
                                row1.createCell(2).setCellValue(e.getProject());
                                row1.createCell(3).setCellValue(e.getSalary());
                    }
                    return "Done";
                }catch (Exception e){
                    System.out.println(e.getCause().getMessage());
                    return e.toString();
                }
            });

        AtomicInteger partTwoCounter=new AtomicInteger(emp.size()/2);
        Future<String> taskTwo= ex.submit(()->{
            try{
                int start=emp.size()/2;
                int end=emp.size();
                for(int i=start;i<end;i++) {
                    Employee e=emp.get(i);
                    XSSFRow row2 ;
                        synchronized (sheet) {
                            row2 = sheet.createRow(partTwoCounter.incrementAndGet());
                        }
                            row2.createCell(0).setCellValue(e.getName());
                            row2.createCell(1).setCellValue(e.getSurname());
                            row2.createCell(2).setCellValue(e.getProject());
                            row2.createCell(3).setCellValue(e.getSalary());
                }
                return "Done";
            }catch (Exception e){
                return Arrays.toString(e.getStackTrace());
            }
        });
        ScheduledExecutorService sch=Executors.newScheduledThreadPool(2);
        sch.scheduleAtFixedRate(()-> System.out.println(partOneCounter+"<>"+partTwoCounter),10,15,TimeUnit.SECONDS);
        String resp1=taskOne.get();
        String resp2=taskTwo.get();
        System.out.println(resp2 + resp1);

            ex.shutdown();

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
            }finally {
                workbook.close();
                time=System.currentTimeMillis()-time;
                System.out.println("TIME TAKEN"+(time/1000));
                System.out.println(resp2 +"\n"+ resp1);
            }
    }
}