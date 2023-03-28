package com.fgh.pro.school.service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtRequestService {

    private static final String secret = "secret" ;

    private static final long exepared_date = 60*60;

    public String generateToken(UserDetails userDetails) {



        Map<String, Object> objectMap = new HashMap<>();

        return doGenerateToken(objectMap, userDetails.getUsername());


    }

    public String doGenerateToken(Map<String, Object> objectMap, String subject) {


        return Jwts.builder()
                .setClaims(objectMap)
                .setSubject(subject)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + exepared_date*1000))
                .signWith(SignatureAlgorithm.ES256, secret)
                .compact();

    }

    private Boolean exepiredToken(String token) {
        final Date exepiredDate = extract(token);
        return exepiredDate.before(new Date());
    }

    public Boolean validToken(String token, UserDetails userDetails) {

        final String userName = usres(token);
        return (userName.equals(userDetails.getUsername()) && !exepiredToken(token));
    }



    public String usres(String token) {
        return claims(token, Claims:: getSubject);
    }

    public Date extract(String token) {
        return claims(token, Claims::getExpiration);
    }

    public <T> T claims(String token, Function<Claims, T> function) {
        final Claims claims = exsclaims(token);
        return function.apply(claims);
    }

    private Claims exsclaims(String token) {

        return Jwts.parser()
                .setSigningKey(secret)
                .parseClaimsJws(token).getBody();
    }

}
