import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String s="banana";
        List<Character> list=new ArrayList<>();
        for(char c:s.toCharArray()){
            if(!list.contains(c)){
                list.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:list){
            sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
