public class Main {
    public static void main(String[] args) {
        String s="one two two one";
        String s2="one";
        int occurence=2;
        int counter=0;
        int i=0;
        String[] array=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(String s1:array){

            if(s1.equalsIgnoreCase(s2)){
                ++counter;
            }
            if(counter==occurence){
                array[i]="";
            }
            sb.append(array[i]+" ");
            ++i;

        }
        System.out.println(sb.toString());
    }
}
