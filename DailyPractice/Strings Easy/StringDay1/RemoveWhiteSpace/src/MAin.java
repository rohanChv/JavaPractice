public class MAin {
    public static void main(String[] args) {
        String s="a b\tc\n" +
                " d";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!Character.isWhitespace(s.charAt(i))){
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
