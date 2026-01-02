public class Str {
    public static void main(String[] args) {
        String s="SpringBootApp";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isUpperCase(s.charAt(i))&& i!=0){
                String s1=" "+s.charAt(i);
                sb.append(s1);
            }
            else
                sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
