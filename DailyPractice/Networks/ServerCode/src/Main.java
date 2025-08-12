import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(9091);
        Socket newServerSocket=server.accept();
        BufferedReader br=new BufferedReader(new InputStreamReader(newServerSocket.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(newServerSocket.getOutputStream()));
        System.out.println("Connection Initiated");
        while (true){
            System.out.println("Server : ");
            Scanner sc=new Scanner(System.in);
            String inp=sc.nextLine();
            if (inp.equalsIgnoreCase("FileProto")){
                File clientFile=new File("Cli.txt");
                FileWriter fw=new FileWriter(clientFile);
                bw.write(inp);
                bw.newLine();
                bw.flush();
                System.out.println("Reading File.....");
                DataInputStream di=new DataInputStream(newServerSocket.getInputStream());
                int a;
                while (true){
                    a=di.read();
                    fw.write(a);
                    if((char)a=='#'){
                        break;
                    }
                }
                fw.close();
                System.out.println("Completed");
                bw.write("written file...");
                bw.newLine();
                bw.flush();
                continue;
            }
            else {
                bw.write(inp);
                bw.newLine();
                bw.flush();
            }
            String output=br.readLine();
            System.out.println("Client : "+output);

            if(output.equalsIgnoreCase("Quit")){
                newServerSocket.close();
                server.close();
                break;
            }

        }
    }
}