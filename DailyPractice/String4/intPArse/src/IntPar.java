import java.util.ArrayList;
import java.util.List;

public class IntPar {

    public static void main(String[] args) {
        String s="id=-42, values=7, 15 and -3-";
        char[] array=s.toCharArray();
        int i=0;
        StringBuilder sb=new StringBuilder();
        char prev;
        for(char c:array){
            ++i;
            if(Character.isDigit(c)||(i< array.length &&c=='-'&&Character.isDigit(array[i]))){
                sb.append(c);
                prev=c;
                if(i< array.length &&!Character.isDigit(array[i])){
                    sb.append(",");
                }
            }
        }
        String[] split=sb.toString().split(",");
        List<Integer> list=new ArrayList<>();
        for(String s1:split){
            if(!s1.isEmpty())
            list.add(Integer.parseInt(s1));
        }
        System.out.println(list);

    }

}
