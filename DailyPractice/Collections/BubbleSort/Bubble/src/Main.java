import java.util.Arrays;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Random random=new Random();
    int[] array={5,6,94,54,1,2,84};
     for(int x:array){
         System.out.print(x+",");
     }
     //Bubble Sort , QuadRatic Time Complexity O(n2)
        for(int i=0;i< array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        System.out.println();
        for(int x:array){
            System.out.print(x+",");
        }
    }
}