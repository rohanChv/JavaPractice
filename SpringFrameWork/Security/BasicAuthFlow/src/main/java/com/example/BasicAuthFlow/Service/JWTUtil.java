package com.example.BasicAuthFlow.Service;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import javax.crypto.SecretKey;
import java.util.Date;
@Component
public class JWTUtil {

    private final String key="ABCSDICNSIDCjsd89chsdchusndc#X";


    public String generateToken(String userName){
        return Jwts.builder()
                .setSubject(userName)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+(1000*60*10)))
                .signWith(SignatureAlgorithm.HS512,key).compact();
    }
    public String getUsername(String token){
        return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody().getSubject();
    }
    public boolean isExpired(String token){
        return Jwts.parser().setSigningKey(key).parseClaimsJws(token).getBody().getExpiration().before(new Date());
    }

}
