import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Runtime run=Runtime.getRuntime();
        System.out.println("Memory before ->"+(run.totalMemory()-run.freeMemory())/(1024*1024));
        List<String>list=new ArrayList<>();
        for(int i=0;i<1000000;i++){
            list.add("Champu"+i);
        }
        list.clear();
        list=null;
        System.gc();
        System.out.println("Memory Used ->"+(run.totalMemory()-run.freeMemory())/(1024*1024));
    }
}