public class Main {
    public static void main(String[] args) {
        String input="  a   b   c  ";
        input=input.trim();

        StringBuilder sb=new StringBuilder();
        for(int i=0;i< input.length();i++){
            if(Character.isWhitespace(input.charAt(i))){
                if(!Character.isWhitespace(sb.charAt(sb.length()-1))){
                    sb.append(input.charAt(i));
                }
            }
            else
                sb.append(input.charAt(i));
        }
        System.out.println(sb.toString());
    }
}
