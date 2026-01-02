public class SWAPFL {
    public static void main(String[] args) {
        String s="java is powerful";
        StringBuilder sb=new StringBuilder();
        String[] array=s.split("\\s");
        String temp=array[0];
        array[0]=array[array.length-1];
        array[array.length-1]=temp;

        for(String s1:array){
            sb.append(s1+" ");
        }
        System.out.println(sb.toString());
    }
}
