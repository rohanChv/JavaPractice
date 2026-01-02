public class StringREm {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("spring");
        sb.replace(0,1,"");
        sb.replace(sb.length()-1,sb.length(),"");
        System.out.println(sb.toString());
    }
}
