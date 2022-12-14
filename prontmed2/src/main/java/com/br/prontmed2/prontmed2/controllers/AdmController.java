package com.br.prontmed2.prontmed2.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.PathVariable;

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


    @RequestMapping("/administradores")
    public ModelAndView adms(){
        ModelAndView mv = new ModelAndView("administradores/index");
        Iterable<AdmModel> adModel = ar.findAll();
        mv.addObject("administradores", adModel);
        return mv;

    }
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ModelAndView adms(@PathVariable("id")long id){
        Optional<AdmModel> adModel = ar.findById(id);
        ModelAndView mv = new ModelAndView("administradores/index");
        mv.addObject("administradores", adModel);
        System.out.println("administradores"+ adModel);
        return mv;

    }

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
   

    @RequestMapping("/pacientes")
    public ModelAndView listaEventos(){
        ModelAndView mv = new ModelAndView("perfil/verPaciente");
        Iterable<PacienteModel> pModel = pr.findAll();
        mv.addObject("paciente",pModel);
        return mv;

    }
    @RequestMapping(value="/{id}", method=RequestMethod.GET)
    public ModelAndView detalhesEvento(@PathVariable("id")long id){
        PacienteModel pModel = pr.findById(id);
        ModelAndView mv = new ModelAndView("perfil/pacienteMenu");
        mv.addObject("paciente",pModel);
        System.out.println("paciente"+ pModel);
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
