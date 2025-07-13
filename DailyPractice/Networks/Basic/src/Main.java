import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8090);
        Socket serverSocket=server.accept();
        InputStream input=serverSocket.getInputStream();
        int data;
        while ((data=input.read())!=-1){
            System.out.print((char)data);
        }
        serverSocket.close();
    }
}