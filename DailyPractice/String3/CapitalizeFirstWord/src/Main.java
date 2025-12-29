public class Main {
    public static void main(String[] args) {
        String s="HEllO WoRld TheRe HOW aRe yoU";
        String [] s1=s.split("\\s");
        StringBuilder sb=new StringBuilder();
        for(String s2:s1){
            char[] c=s2.toCharArray();
            for(int i=0;i<s2.length();i++){
                if(i==0){
                    char c1=c[0];
                    sb.append(Character.toUpperCase(c1));
                }
                else
                    sb.append(Character.toLowerCase(c[i]));
            }
            sb.append(" ");

        }
        System.out.println(sb.toString());
    }
}
