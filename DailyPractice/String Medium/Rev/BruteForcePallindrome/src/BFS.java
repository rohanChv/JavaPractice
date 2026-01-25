public class BFS {

    public static void main(String[] args) {
        String s="babad";
        StringBuilder sb;
        StringBuilder pallindrome = new StringBuilder();
        for(int i=0;i<s.length();i++){
            for (int j=i;j<s.length();j++){
                if(j==i){
                    continue;
                }
                else {
                    sb=new StringBuilder(s.substring(i,j+1));
                    if(sb.toString().equals(sb.reverse().toString())){
                        if(pallindrome.length()<=sb.length()){
                            pallindrome=new StringBuilder(sb.toString());
                        }
                    }
                }
            }
        }
        System.out.println(pallindrome.toString());
    }

}
