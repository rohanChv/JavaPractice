import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket server=new ServerSocket(8090);
            Socket serverRequest=server.accept();
            BufferedReader reader=new BufferedReader(new InputStreamReader(serverRequest.getInputStream()));
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(serverRequest.getOutputStream()));
            String s="";
            System.out.println("Request Received... Initiating Communication");
            while (true){
                if((s= reader.readLine()).equalsIgnoreCase("Quit")){
                    serverRequest.close();
                    break;
                }
                System.out.println("Client :"+s);
                System.out.print("Server :");
                Scanner sc=new Scanner(System.in);
                writer.write(sc.nextLine());
                writer.newLine();
                writer.flush();
            }
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
