public class Main {
    public static void main(String[] args) {
        String s="Hello, world!";
        char[] array=s.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(char c:array){
            if(Character.isDigit(c)||Character.isLetter(c)||Character.isWhitespace(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
