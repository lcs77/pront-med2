package com.br.prontmed2.prontmed2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.prontmed2.prontmed2.models.AdmModel;
import com.br.prontmed2.prontmed2.repository.AdmRepository;

@Controller 
public class AdmController {

    @Autowired
    private AdmRepository ar;

    @RequestMapping(value = "/inicio", method=RequestMethod.GET)
    public String menu(){
        return "perfil/landingPage";
    }


    //cadastro de administrador
    @RequestMapping(value = "/cadastroAdm", method=RequestMethod.GET)
    public String cadastro(){
        return "cadastros/cadastroAdm";
    }
    //cadastro de administrador
    @RequestMapping(value = "/cadastroAdm", method=RequestMethod.POST)
    public String cadastro(AdmModel admModel){
        ar.save(admModel);
        return "cadastros/cadastroAdm";
    }
   //chamado do login de funcionario
    @RequestMapping( "/login")
    public String login(){

        return "logins/loginFuncionario";
        

    }



    
}
