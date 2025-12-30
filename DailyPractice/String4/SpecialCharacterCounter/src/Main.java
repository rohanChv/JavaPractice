public class Main {
    public static void main(String[] args) {
        String s="abc@#12 *(&";
        int counter=0;
        for(int i=0;i<s.length();i++){
            if(!(Character.isLetter(s.charAt(i))||Character.isWhitespace(s.charAt(i))
            ||Character.isDigit(s.charAt(i))
            )){
                ++counter;
            }
        }
        System.out.println(counter);
    }
}
