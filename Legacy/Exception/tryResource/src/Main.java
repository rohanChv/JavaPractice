import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     try(Scanner sc=new Scanner(new FileReader("C:\\Users\\rohangch\\Documents\\JavaPractice\\Exception\\tryResource\\src\\Test.txt"))){
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }
    }
}