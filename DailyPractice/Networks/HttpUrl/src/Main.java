import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        URL tokenUrl=new URL("https://api.escuelajs.co/api/v1/auth/login");

        HttpURLConnection tokenConnection=(HttpURLConnection)tokenUrl.openConnection();
        tokenConnection.setRequestProperty("Content-Type","application/json");
        tokenConnection.setRequestProperty("Accept","application/json");
        tokenConnection.setRequestMethod("POST");
        tokenConnection.setDoOutput(true);
        tokenConnection.setDoInput(true);

       String tokenRequestBody="{\"email\": \"john@mail.com\", \"password\": \"changeme\"}";

        OutputStream writer=tokenConnection.getOutputStream();
        byte[] buf=tokenRequestBody.getBytes();
        writer.write(buf,0, buf.length);
        System.out.println(tokenConnection.getResponseCode());
        System.out.println(tokenConnection.getResponseMessage());

        BufferedReader reader=new BufferedReader(new InputStreamReader(tokenConnection.getInputStream()));

        String response=reader.readLine();
        response=response.replaceAll("\"","");
        response=response.replaceAll("[{}]","");
        System.out.println(response);
        String[] responseSplit=response.split(",");
        responseSplit=responseSplit[0].split(":");
        String accessToken=responseSplit[1];
        System.out.println("Access Token-> "+accessToken);

    }
}