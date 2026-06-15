package br.com.marktview.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

import javax.crypto.SecretKey;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;

public class JWTTokenService {

    private static final long EXPIRATION_TIME = 959990000;
    /*  Precisa ter NO MÍNIMO 256 bits (32 caracteres/bytes).*/
    private static final String SECRET = "378402&!@(#-90@)_+@!#$%%9hjs-marktview-security-2026";
    private static final String TOKEN_PREFIX = "Bearer";
    private static final String HEADER_STRING = "Authorization";

    public void gerarToken(HttpServletResponse response, String username) throws IOException {

        Date agora = new Date();
        SecretKey key = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));

        String jwt = Jwts.builder()
                .subject(username)
                .setIssuedAt(agora) // Data de geração
                .expiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(key)
                .compact();

        String token = TOKEN_PREFIX + " " + jwt;
        response.addHeader(HEADER_STRING, token);

        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");

        response.getWriter().write("{\"Authorization\": \"" + token + "\"}");
    }

    public String validarToken(String token) {
        try {

            if (token.startsWith("Bearer ")) {
                token = token.replace("Bearer ", "").trim();
            }

            SecretKey key = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));

            String username = Jwts.parser()
                    .verifyWith(key)
                    .build()
                    .parseSignedClaims(token)
                    .getPayload()
                    .getSubject();

            return username;
        } catch (io.jsonwebtoken.JwtException exception) {
            return "";
        }
    }
}
