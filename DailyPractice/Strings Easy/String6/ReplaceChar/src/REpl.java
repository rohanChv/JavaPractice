public class REpl {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("a1b2c3");
        for(int i=0;i<sb.length();i++){
            if(Character.isDigit(sb.charAt(i))){
                sb.replace(i,i+1,"#");
            }
        }
        System.out.println(sb.toString());
    }
}
