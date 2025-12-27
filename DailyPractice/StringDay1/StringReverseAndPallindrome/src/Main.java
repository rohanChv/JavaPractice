public class Main {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcd");
        System.out.println(sb.reverse());
        String s="A man, a plan, a canal: Panama";
        sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isAlphabetic(c)){
                sb.append(c);
            }
        }
        String output=sb.toString();
        System.out.println(output.equalsIgnoreCase(sb.reverse().toString()));
    }
}
