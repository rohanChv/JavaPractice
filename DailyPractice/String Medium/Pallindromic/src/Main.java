public class Main {

    public static int moveAround(String s,int left, int right){
        while(left>=0&&right<s.length()&&(s.charAt(left)==s.charAt(right))){
            --left;
            ++right;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        String inputString="malamba";
        int start=0;
        int end=0;
        for(int i=0;i<inputString.length();i++){
            int evenLength=moveAround(inputString,i,i);
            int oddLength=moveAround(inputString,i,i);
            int len=Math.max(evenLength,oddLength);
            if(len>(end-start-1)){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        System.out.println(inputString.substring(start,(end+1)));


    }

}
