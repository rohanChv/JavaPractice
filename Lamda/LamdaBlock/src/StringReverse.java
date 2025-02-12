public class StringReverse {
    public static void main(String[] args) {
        reverse inputstring=(s)->{
            String result="";
            for(int i=s.length()-1;i>=0;i--)
                result+=s.charAt(i);
            return result;
        };
        System.out.println("Input string is Malayalam : "+inputstring.getReverse("Malayalam"));
    }
}
