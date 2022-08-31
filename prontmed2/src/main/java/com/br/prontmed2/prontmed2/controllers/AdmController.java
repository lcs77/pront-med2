package com.br.prontmed2.prontmed2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.br.prontmed2.prontmed2.models.AdmModel;

import com.br.prontmed2.prontmed2.models.Agendamento;
import com.br.prontmed2.prontmed2.repository.AdmRepository;
import com.br.prontmed2.prontmed2.repository.AgendamentoRepository;


import com.br.prontmed2.prontmed2.models.AnamneseModel;
import com.br.prontmed2.prontmed2.models.PacienteModel;
import com.br.prontmed2.prontmed2.repository.AnamneseRepository;
import com.br.prontmed2.prontmed2.repository.PacienteRepository;


@Controller 
public class AdmController {

    @Autowired
    private AdmRepository ar;
    @Autowired

    private AgendamentoRepository aRepository;
    
    @Autowired
    private AnamneseRepository anaRepo;

    @Autowired
    private PacienteRepository pr;


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
   

    @RequestMapping("/eventos")
    public ModelAndView listaEventos(){
        ModelAndView mv = new ModelAndView("perfil/perfilMedico2");
        Iterable<PacienteModel> pModel = pr.findAll();
        mv.addObject("paciente",pModel);
        return mv;

    }

    @RequestMapping("/Prontuario")
    public ModelAndView Prontuario(){
        ModelAndView mv = new ModelAndView("perfil/perfilPaciente2");
        Iterable<AnamneseModel> aModel = anaRepo.findAll();
        mv.addObject("anamneses",aModel);
        return mv;

    }
    @RequestMapping(value = "/anamnese", method=RequestMethod.GET)
    public String anamnese(){
        return "formularios/anamnese";
    }
   

    @RequestMapping(value = "/anamnese", method=RequestMethod.POST)
    public String cadastro(AnamneseModel anamneseModel){
        anaRepo.save(anamneseModel);
        return "formularios/anamnese";
    }


}
