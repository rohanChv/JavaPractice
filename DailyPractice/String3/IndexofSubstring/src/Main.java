import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String s="abracadabra";
        String s1="abra";
        int start=0;
        int end=s1.length();
        ArrayList<Integer>a=new ArrayList<>();
        while (end<=s.length()){
            if(s.substring(start,end).equalsIgnoreCase(s1)){
               a.add(start);
            }
            ++start;
            ++end;
        }
        System.out.println(a);
    }
}
