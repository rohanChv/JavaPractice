import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fr=new FileOutputStream("C:\\Users\\rohangch\\Documents\\JavaPractice\\FileSystems\\Trial\\src\\Sucess.txt");

        int data=0;
        while((data=br.read())!=-1){
            if(((char)data=='#'))
                break;

            fr.write(data);
        }
    }
}