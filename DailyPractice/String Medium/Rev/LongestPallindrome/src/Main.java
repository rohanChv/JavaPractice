public class Main {

    public static int getLength(String s,int left, int right){
        while (left>=0&&right<s.length()&&s.charAt(left)==s.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public static void main(String[] args) {
        String inputString="badabad";
        int start=0;
        int end=0;
        for(int i=0;i<inputString.length();i++){
            int oddLength=getLength(inputString,i,i);
            int evenLength=getLength(inputString,i,i+1);
            int maxLen=Math.max(oddLength,evenLength);
            if(maxLen>(end-start+1)){
                start=i-(maxLen-1)/2;
                end=i+(maxLen/2);
            }
        }
        System.out.println(inputString.substring(start,end+1));
    }

}
