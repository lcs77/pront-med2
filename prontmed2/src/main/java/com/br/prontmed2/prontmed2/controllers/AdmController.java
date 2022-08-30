package com.br.prontmed2.prontmed2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.br.prontmed2.prontmed2.models.AdmModel;

import com.br.prontmed2.prontmed2.models.Agendamento;
import com.br.prontmed2.prontmed2.repository.AdmRepository;
import com.br.prontmed2.prontmed2.repository.AgendamentoRepository;


import com.br.prontmed2.prontmed2.models.AnamneseModel;
import com.br.prontmed2.prontmed2.repository.AnamneseRepository;


@Controller 
public class AdmController {

    @Autowired
    private AdmRepository ar;
    @Autowired

    private AgendamentoRepository aRepository;
    
    @Autowired
    private AnamneseRepository anaRepo;


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

    @RequestMapping( "/perfilAdm")
    public String perfilAdm(){
        return "perfil/perfilMedico";
    }


    @RequestMapping(value = "/agendamentos", method=RequestMethod.POST)
    public String addAgenda(Agendamento agendamento){
        aRepository.save(agendamento);
        return "perfil/perfilMedico";
    }
    @RequestMapping(value = "/agendamentos", method=RequestMethod.GET)
    public String agenda(){
        return "formularios/agendamento";
    }




























    @RequestMapping(value = "/anamnese", method=RequestMethod.POST)
    public String cadastro(AnamneseModel anamneseModel){
        anaRepo.save(anamneseModel);
        return "perfil/perfilMedico";
    }




    
}
