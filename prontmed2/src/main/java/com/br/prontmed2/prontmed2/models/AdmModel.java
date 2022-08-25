package com.br.prontmed2.prontmed2.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AdmModel {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String nome;
    private String email;
    private String senha;
    private String cpf;
    private String rg;
    private String endereco;
    private String bairro;
    private String cidade;
    private String matricula;
    private String crm;
    private String dataNasc;
    private String telefone;
    private String estado;
    private String genero;


    
    
    

    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }

 
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }


    public void setSenha(String senha) {
        this.senha = senha;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getCidade() {
        return cidade;
    }


    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

 
    public String getCrm() {
        return crm;
    }

 
    public void setCrm(String crm) {
        this.crm = crm;
    }

  
    public String getDataNasc() {
        return dataNasc;
    }

   
    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

  
    public String getTelefone() {
        return telefone;
    }

    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEstado() {
        return estado;
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getGenero() {
        return genero;
    }


    public void setGenero(String genero) {
        this.genero = genero;
    }

}
