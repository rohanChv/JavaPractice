import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        int[]array=new int[20];
        for(int i=0;i<20;i++){
            array[i]= random.nextInt()/20000;
        }
        for(int x:array){
            System.out.print(x+",");
        }
        for(int j=1;j<=array.length-1;j++){
            for(int i=0;i<j;i++){
                int temp;
                if(array[i]>array[j]){
                    temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
                if(array[i]>array[i+1]){
                    temp=array[i+1];
                    array[i+1]=array[i];
                    array[i]=temp;
                }
            }
        }
        System.out.println();
        for(int x:array){
            System.out.print(x+",");
        }
    }
}