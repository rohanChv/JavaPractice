import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try{
            Socket client=new Socket("localhost",8090);
            BufferedReader reader=new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            String s="";
            while (true){
                System.out.println("Client :");
                Scanner sc=new Scanner(System.in);
                s=sc.nextLine();
                if(s.equalsIgnoreCase("Quit")) {
                    client.close();
                    break;
                }
                writer.write(s);
                writer.newLine();
                writer.flush();
                System.out.println("Server :"+reader.readLine());
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
