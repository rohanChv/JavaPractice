import javax.sound.midi.Soundbank;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static boolean checkAnagram(char[]s1,char[]s2){
        if(s1.length!=s2.length)return false;
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkAnagram("Daniel".toCharArray(),"linDae".toCharArray()));
    }
}