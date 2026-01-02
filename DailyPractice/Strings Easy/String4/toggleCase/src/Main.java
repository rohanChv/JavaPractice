public class Main {
    public static void main(String[] args) {
        String s1="AbC123!";
        char[] array=s1.toCharArray();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<array.length;i++){
            if(Character.isLetter(array[i])){
                if(Character.isLowerCase(array[i])){
                    array[i]=Character.toUpperCase(array[i]);
                }
                else if (Character.isUpperCase(array[i])){
                    array[i]=Character.toLowerCase(array[i]);
                }
            }
            sb.append(array[i]);
        }
        System.out.println(sb.toString());
    }
}
