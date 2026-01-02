public class Main {
    public static void main(String[] args) {
        String s="Java is Cool, JavaScript is not Cool. But Kotlin is better than Java";
        String find="Java";
        String replace="Kotlin";
        StringBuilder sb=new StringBuilder();
        int start=0;
        int end=0;
        System.out.println(s.length());
        for(int i=0;i<s.length();i++){
            System.out.println(i+","+s.charAt(i));
            if(Character.isWhitespace(s.charAt(i))||(i==s.length()-1)){
                end=i;
                if (i==s.length()-1){
                    ++end;
                }
                if(s.substring(start,end).equalsIgnoreCase(find)){
                    sb.append(replace+" ");
                }
                else
                    sb.append(s.substring(start,end)+" ");
                start=i+1;

            }
        }
        System.out.println(sb.toString());
    }
}
