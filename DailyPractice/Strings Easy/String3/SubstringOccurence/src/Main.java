public class Main {

    public static void main(String[] args) {
        String s="bakbakabak";
        String s2="bak";
        int i=0;
        int start=0;
        int end=s2.length();
        int counter=0;
        while (end<=s.length()){
            if(s.substring(start,end).equalsIgnoreCase(s2)){
                ++counter;
            }
            ++start;
            ++end;

        }
        System.out.println(counter);
    }

}
