import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket clientSocket=new Socket("localhost",8090);
        BufferedReader br=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Client :");
            bw.write(sc.nextLine());
            bw.newLine();
            bw.flush();
            System.out.print("Server :");
            String s=br.readLine();
            if(s.equalsIgnoreCase("Quit"))
                break;
            System.out.println(s);
        }
        clientSocket.close();
    }
}
