public class UL {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("AbCdefG");
        int counter=0;
        for(int i=0;i<sb.length();i++){
            if(Character.isUpperCase(sb.charAt(i))){
                ++counter;
            }
        }
        System.out.println(counter);
    }
}
