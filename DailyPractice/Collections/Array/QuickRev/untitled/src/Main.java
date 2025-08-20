import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void reversal(int[] array){
        int i=0;
        int j= array.length-1;
        while (i<j){
            int temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            ++i;
            --j;
        }
        System.out.println(Arrays.toString(array));
    }
    public static void main(String[] args) {
        //Quick Rev Array Reversal in place
        int[] array={9,8,7,6,5,4,3,2,1,0};
        System.out.println("Original Array : "+Arrays.toString(array));
        reversal(array);
    }
}