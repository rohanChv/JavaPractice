public class Main {
    public static void main(String[] args) {
        String s="a1b3c3443CCF67";
        StringBuilder sb=new StringBuilder();
        char[] array=s.toCharArray();
        for(char c:array){
            if (Character.isLetter(c)){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }

}
