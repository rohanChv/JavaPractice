public class rotateByK {
    public static void main(String[] args) {
        String s="abcdef";
        int k=2;
        StringBuilder sb=new StringBuilder();
        sb.append(s.substring(k,s.length()));
        sb.append(s, 0, k);

        System.out.println(sb.toString());
    }
}
