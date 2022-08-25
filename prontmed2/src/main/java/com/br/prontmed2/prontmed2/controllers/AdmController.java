package com.br.prontmed2.prontmed2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class AdmController {

    @RequestMapping(value = "/inicio", method=RequestMethod.GET)
    public String menu(){
        return "perfil/landingPage";
    }

    @RequestMapping(value = "/login", method=RequestMethod.GET)
    public String login(){
        return "";
    }



    
}
