public class Main {
    public static void main(String[] args) {
        String s="  Java   is awesome  MAIN hooon SSS   DON";
        s=s.trim();//remove starting & ending spaces
        System.out.println(s);
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(i==0){
                sb.append(s.charAt(i));
                continue;
            }
            if(sb.charAt(sb.length()-1)==' '&& s.charAt(i)==' ')
                continue;
            else
                sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
        System.out.println(sb.toString().split("\\s").length);
    }
}
