public class Delimiter {
    public static void main(String[] args) {
        String s="123456789";
        StringBuilder sb=new StringBuilder();
        char[] array=s.toCharArray();
        int counter=1;
        for(int i=0;i<s.length();i++){
            sb.append(array[i]);
            if(counter==3&&i<s.length()-1){
                sb.append("-");
                counter=1;
            }else
                ++counter;
        }
        System.out.println(sb.toString());
    }
}
