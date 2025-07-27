//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] array={94,12,203,304,89,5,8,111,30,40,20};

        for(int j=array.length-1;j>=0;j--){
            for(int i=0;i< j;i++){
                if(array[j]<array[i]){
                    int temp=array[j];
                    array[j]=array[i];
                    array[i]=temp;
                }
            }
        }
        for(int x:array){
            System.out.print(x+",");
        }

    }
}