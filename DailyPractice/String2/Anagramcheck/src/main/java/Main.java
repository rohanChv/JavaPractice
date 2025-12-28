import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String s1="flutter";
        String s2="restful";
        char[] a=s1.toLowerCase().toCharArray();
        Arrays.sort(a);
        char[] b=s2.toLowerCase().toCharArray();
        Arrays.sort(b);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.equals(a,b));

    }
}
