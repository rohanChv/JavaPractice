import java.io.*;

public class FileCreator {

    public static void createFile(String s) throws IOException {
        s=s.concat(".txt");
        File outputFile=new File(s);
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputFile)));
        File inputFile=new File("Input_File.txt");
        FileInputStream fis=new FileInputStream(inputFile);
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        String s1=br.readLine();
        while(s1!=null){
            bw.write(s1);
            s1=br.readLine();
        }
    }
}
