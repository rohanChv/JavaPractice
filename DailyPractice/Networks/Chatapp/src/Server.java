import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {
        try{
            ServerSocket server=new ServerSocket(8090);
            Socket incomingData=server.accept();
            BufferedReader br=new BufferedReader(new InputStreamReader(incomingData.getInputStream()));
            BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(incomingData.getOutputStream()));
            Scanner sc=new Scanner(System.in);
            while (true){
                String s=br.readLine();
                System.out.println("Client :"+s);
                System.out.print("Reply :");
                s=sc.nextLine();
                bw.write(s);
                bw.newLine();
                bw.flush();
                if(s.equalsIgnoreCase("Quit"))
                    break;
            }
            server.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
