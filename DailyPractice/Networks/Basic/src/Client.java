import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket client=new Socket("127.0.0.1",8090);
        OutputStream output =client.getOutputStream();
        for(int i=0;i<5;i++){
            output.write("Hello .. Good u learnt network.. Time to forget the Past\n".getBytes());
        }
        client.close();
    }
}
