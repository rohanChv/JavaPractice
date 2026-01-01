public class Main {
    public static void main(String[] args) {
        String s="Hello World";
        String[] array=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i< array.length;i++){
            sb= new StringBuilder(array[i]);
            array[i]=sb.reverse().toString()+" ";
        }
        sb=new StringBuilder();
        for (String s1:array){
            sb.append(s1);
        }
        System.out.println(sb.toString());
    }
}
