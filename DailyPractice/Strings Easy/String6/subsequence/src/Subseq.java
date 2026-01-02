public class Subseq {
    public static void main(String[] args) {
        String s="abcde";
        String t="ace";
        int i=0;
        int j=0;
        for(j=0;j<s.length();j++){
            if(s.charAt(j)==t.charAt(i)){
                ++i;
            }
        }
        if(i==t.length()){
            System.out.println("TRUE");
        }
    }
}
