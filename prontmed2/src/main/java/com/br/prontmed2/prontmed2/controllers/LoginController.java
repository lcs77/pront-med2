package com.br.prontmed2.prontmed2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {


    
    //chamado do login de funcionario
    @GetMapping( "/login")
    public String login(){
        return "logins/loginFuncionario";
        
    }
}
