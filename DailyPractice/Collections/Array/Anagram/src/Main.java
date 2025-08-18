//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean isAnagram(char[]s1,char[] s2){
        int counter=0;
        for(int i=0;i<s1.length;i++){
            counter=0;
            for (int j=0;j<s2.length;j++){
               if(s1[i]==s2[j]){
                   ++counter;
                   if(counter>1){
                      break;
                   }
               }
            }
            if(counter==0)
                break;
        }
        return (counter>1||counter==0)?false:true;
    }
    public static void main(String[] args) {
        String s1="restful";
        String s2="fluste";
        System.out.println(isAnagram(s1.toCharArray(),s2.toCharArray()));
    }
}