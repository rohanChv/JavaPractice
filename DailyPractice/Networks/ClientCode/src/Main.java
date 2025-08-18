import com.sun.xml.internal.messaging.saaj.util.CharReader;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Socket clienSocket=new Socket("localhost",9091);
        BufferedReader br=new BufferedReader(new InputStreamReader(clienSocket.getInputStream()));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(clienSocket.getOutputStream()));
        System.out.println("Connection Initiated");
        while (true){

            String serverInp=br.readLine();
            System.out.println("Server :"+serverInp);
            if(serverInp.equalsIgnoreCase("FileProto")){
                File myCode=new File("C:\\Users\\rohangch\\Documents\\JavaPractice\\DailyPractice\\Networks\\ClientCode\\src\\Main.java");
                byte[] bytes=Files.readAllBytes(Paths.get(myCode.getAbsolutePath()));
                DataOutputStream ds=new DataOutputStream(clienSocket.getOutputStream());
                ds.write(bytes,0,bytes.length);
                ds.flush();
                continue;
            }
            System.out.println("Client :");
            Scanner sc=new Scanner(System.in);
            String inp=sc.nextLine();
            bw.write(inp);
            bw.newLine();
            bw.flush();
        }
    }
}
//###