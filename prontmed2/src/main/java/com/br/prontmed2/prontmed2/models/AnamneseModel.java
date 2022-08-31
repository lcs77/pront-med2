package com.br.prontmed2.prontmed2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;



@Entity
public class AnamneseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "cpf", length = 100)
    private String cpf;

    @Column(name = "exercicoFisicos", length = 100)
    private String exerciciosFisicos;

    @Column(name = "alimentacaoBalanceada", length = 100)
    private String alimentacaoBalanceada;

    @Column(name = "Tabagista", length = 100)
    private String tabagista;

    @Column(name = "antededentesAlergicos", length = 100)
    private String antecedentesAlergicos;

    @Column(name = "problemasOrtopedicos", length = 100)
    private String problemasOrtopedicos;

    @Column(name = "problemasCardiacos", length = 100)
    private String problemasCardiacos;

    @OneToOne
    private PacienteModel paciente;


    public String getExerciciosFisicos() {
        return exerciciosFisicos;
    }

    public void setExerciciosFisicos(String exerciciosFisicos) {
        this.exerciciosFisicos = exerciciosFisicos;
    }

    public String getAlimentacaoBalanceada() {
        return alimentacaoBalanceada;
    }

    public void setAlimentacaoBalanceada(String alimentacaoBalanceada) {
        this.alimentacaoBalanceada = alimentacaoBalanceada;
    }

    public String getTabagista() {
        return tabagista;
    }

    public void setTabagista(String tabagista) {
        this.tabagista = tabagista;
    }

    public String getAntecedentesAlergicos() {
        return antecedentesAlergicos;
    }

    public void setAntecedentesAlergicos(String antecedentesAlergicos) {
        this.antecedentesAlergicos = antecedentesAlergicos;
    }

    public String getProblemasOrtopedicos() {
        return problemasOrtopedicos;
    }

    public void setProblemasOrtopedicos(String problemasOrtopedicos) {
        this.problemasOrtopedicos = problemasOrtopedicos;
    }

    public String getProblemasCardiacos() {
        return problemasCardiacos;
    }

    public void setProblemasCardiacos(String problemasCardiacos) {
        this.problemasCardiacos = problemasCardiacos;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public PacienteModel getPaciente() {
        return paciente;
    }

    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
