package com.example.filmeteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String carregaPaginaListagem(){
        return "autenticacao/login";
    }
}