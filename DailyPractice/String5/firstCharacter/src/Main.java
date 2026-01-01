public class Main {
    public static void main(String[] args) {
        String s="loveleetcode";
        char[] array=s.toCharArray();
        int counter=0;
        int j=0;
        for(char c: array){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==c){
                    ++counter;
                }
            }
            if(counter==1){
                System.out.println(c +"index : "+j);
                break;
            }
            counter=0;
            ++j;
        }

    }
}
