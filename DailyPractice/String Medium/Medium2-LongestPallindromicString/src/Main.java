public class Main {

    private static int moveAround(String s,int left,int right){
        //Condition to check if the elements at right are equal to left
        while (left>=0&&right<s.length()&&(s.charAt(right)==s.charAt(left))){
            left--;
            right++;
        }
        return right-left-1;
    }


    public static void main(String[] args) {
        //Input String
        String s="abcbcddcb";
        int oddLength=0;
        int evenLength=0;
        int start=0;
        int end=0;

        for(int i=0;i<s.length();i++){
            oddLength=moveAround(s,i,i);
            evenLength=moveAround(s,i,i+1);
            int length=Math.max(oddLength,evenLength);
            if(length>=(end-start+1)){
                start=i-(length-1)/2;
                end=i+length/2;
            }
        }
        System.out.println(s.substring(start,end+1));
    }

}
