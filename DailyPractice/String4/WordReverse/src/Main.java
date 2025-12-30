public class Main {
    public static void main(String[] args) {
        String s1="  Java  Spring Boot  ";
        s1=s1.trim();
        char[] array=s1.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c:array){
           if(Character.isLetter(c)){
               sb.append(c);
           }
           if(Character.isWhitespace(c)){
               if(!Character.isWhitespace(sb.charAt(sb.length()-1))){
                  sb.append(c);
               }
           }
        }
        String[] s2=sb.toString().split("\\s");
        sb=new StringBuilder();
        for(int i=s2.length-1;i>=0;i--){
            sb.append(s2[i]+" ");
        }
        System.out.println(sb.toString());
    }
}
