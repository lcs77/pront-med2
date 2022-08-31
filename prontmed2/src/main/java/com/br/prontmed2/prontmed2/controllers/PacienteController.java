package com.br.prontmed2.prontmed2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.prontmed2.prontmed2.models.PacienteModel;
import com.br.prontmed2.prontmed2.repository.PacienteRepository;

@Controller
public class PacienteController{

    @Autowired
    private PacienteRepository pacienteRepository;
    
    @RequestMapping(value="/loginPaciente", method=RequestMethod.GET)
    public String loginPaciente(){
        return "logins/loginPaciente";
    }

    @RequestMapping(value="/cadastroPaciente", method=RequestMethod.GET)
    public String cadastroPaciente(){
        return "cadastros/cadastropaciente1";
    }

    @RequestMapping(value = "/cadastroPaciente", method=RequestMethod.POST)
    public String cadastro(PacienteModel pacienteModel){
        pacienteRepository.save(pacienteModel);
        return "cadastros/cadastroPaciente1";
    }

    @RequestMapping(value="/perfilPaciente", method=RequestMethod.GET)
    public String perfilPaciente(){
        return "perfil/perfilPaciente";
    }
    
    

}