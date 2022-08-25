package com.br.prontmed2.prontmed2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PacienteController{

    @RequestMapping(value="/loginPaciente", method=RequestMethod.GET)
    public String loginPaciente(){
        return "logins/loginPaciente";
    }

    @RequestMapping(value="/cadastroPaciente", method=RequestMethod.GET)
    public String cadastroPaciente(){
        return "cadastros/cadastropaciente1";
    }

    @RequestMapping(value="/perfilPaciente", method=RequestMethod.GET)
    public String perfilPaciente(){
        return "perfil/perfilPaciente";
    }

    
    

}