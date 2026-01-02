import java.util.ArrayList;
import java.util.List;

public class SubS {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        StringBuilder stringBuilder=new StringBuilder();
        String s="abcd";

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                list.add(s.substring(i,j));
            }
        }
        list.sort((a,b)->a.length()-b.length());
        System.out.println(list +"<=>"+list.size());

    }
}
