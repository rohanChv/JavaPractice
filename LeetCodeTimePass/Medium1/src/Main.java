import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list1= new LinkedList<>();
        list1.addAll(Arrays.asList(2,4,9));
        LinkedList<Integer> list2= new LinkedList<>();
        list2.addAll(Arrays.asList(5,6,4,9));
        int number1=0;
        int number2=0;
        System.out.println(list1);
        System.out.println(list2);
        int counter=0;
        for(int x:list1){
            number1=number1+(x*(int)(Math.pow(10,counter)));
            ++counter;
        }
        counter=0;
        for(int x:list2){
            number2=number2+(x*(int)(Math.pow(10,counter)));
            ++counter;
        }
        int result=Math.addExact(number1,number2);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(result);
        char[] inp=Integer.toString(result).toCharArray();
        LinkedList<Integer> resultList=new LinkedList<>();
        for (int x=inp.length-1;x>=0;x--){
            resultList.add(Integer.parseInt(String.valueOf(inp[x])));
        }
        System.out.println(resultList);

        Calendar myCalendar = Calendar.getInstance();
        System.out.println(myCalendar.getTime());
        // Add 2 years to the current date
        myCalendar.add(Calendar.YEAR, 2);
        // Subtract 10 days from the current date
        myCalendar.add(Calendar.DAY_OF_MONTH, 10);
        myCalendar.setTime(null);
        System.out.println("Modified Date after subtracting 10 days: " + myCalendar.getTime());
    }
}