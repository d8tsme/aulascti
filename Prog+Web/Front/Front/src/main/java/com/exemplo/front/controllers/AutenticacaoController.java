package com.exemplo.front.controllers;

import lombok.*;
import org.springframework.http.ResponseEntity;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.exemplo.front.seguranca.*;
import java.util.Date;

@RestController
@RequestMapping("/auth")
public class AutenticacaoController {
    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;
    public AutenticacaoController(AuthenticationManager authenticationManager, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    @PostMapping
    public ResponseEntity<?> autenticar(@RequestBody Login credenciais) {
        UsernamePasswordAuthenticationToken dadosLogin = new UsernamePasswordAuthenticationToken(credenciais.getLogin(), credenciais.getSenha());
        try {
            Authentication authentication = authenticationManager.authenticate(dadosLogin);
            String token = tokenService.gerarToken(authentication.getName());
            return ResponseEntity.ok(new Token(token, "Bearer", new Date(System.currentTimeMillis() + 86400000)));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new Erro("Credenciais inválidas"));
        }
    }
}

@Getter
@Setter
class Login {
    private String login;
    private String senha;
}

@Getter
@Setter
@AllArgsConstructor
class Token {
    private String token;
    private String tipo;
    private Date dataExpiracao;
}

@Getter
@Setter
@AllArgsConstructor
class Erro {
    private String mensagem;
}
