package com.br.prontmed2.prontmed2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class AnamneseModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne
    private PacienteModel cpf;

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

    



    
    
}
