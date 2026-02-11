package com.example.configurationProp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

@Service
public class MakeRequest {
   @Autowired
    UrlReqService urlReq;
   public Environment env;

   public String makeConnection() throws IOException {
       URL url=new URL(urlReq.getGetUrl());
       HttpURLConnection connection=(HttpURLConnection)url.openConnection();
       BufferedReader br=new BufferedReader(new InputStreamReader(connection.getInputStream()));
       String s;
       StringBuilder sb=new StringBuilder();
       while ((s=br.readLine())!=null){
           System.out.println(s);
           sb.append(s);
       }
       System.out.println(env.getProperty("spring.application.name"));
       connection.disconnect();
       return sb.toString();
   }
}
