import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       try{
           URL tokenUrl=new URL("https://api.escuelajs.co/api/v1/auth/login");
           HttpURLConnection tokenConnection=(HttpURLConnection) tokenUrl.openConnection();
           tokenConnection.setRequestProperty("Content-Type","application/json");
           tokenConnection.setRequestProperty("Accept","application/json");
           tokenConnection.setRequestMethod("POST");
           tokenConnection.setDoOutput(true);
           tokenConnection.setDoInput(true);

           String tokenBody="{\"email\": \"john@mail.com\", \"password\": \"changeme\"}";
           BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(tokenConnection.getOutputStream()));
           writer.write(tokenBody);
           writer.flush();
           BufferedReader reader=new BufferedReader(new InputStreamReader(tokenConnection.getInputStream()));
           String accessToken=reader.readLine();
           String response=accessToken.replaceAll("[{}]","");
           String[] temp=response.split(":");
           temp=temp[1].split(",");
           accessToken=temp[0].replaceAll("\"","");
           System.out.println("Token Generated");

           URL getUrl=new URL("https://api.escuelajs.co/api/v1/auth/profile");
           HttpURLConnection getRequest=(HttpURLConnection) getUrl.openConnection();
           getRequest.setRequestMethod("GET");
           getRequest.setRequestProperty("Accept","application/json");
           getRequest.setRequestProperty("Authorization","Bearer "+accessToken);
           reader=new BufferedReader(new InputStreamReader(getRequest.getInputStream()));
           System.out.println(reader.readLine());
       }catch (Exception e){
           System.out.println("Exc"+e.getMessage());
       }
    }
}