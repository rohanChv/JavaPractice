public class Main {
    public static void main(String[] args) {
        String s="swiss";
        char[] arr=s.toCharArray();
        char c = 0;
        int counter=0;
        char current=0;
        for(int i=0;i<arr.length;i++){
            current=arr[i];
            for(char cr:arr){
                if(cr==current){
                    ++counter;
                }
            }
            if(counter==1){
                break;
            }
            counter=0;
        }
        System.out.println(current);
    }
}
