package com.br.prontmed2.prontmed2.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

  

    @ManyToOne
    private PacienteModel paciente;
    private String tipoAgenda;
    private String data;
    private String hora;

    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return PacienteModel return the paciente
     */
    public PacienteModel getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(PacienteModel paciente) {
        this.paciente = paciente;
    }

    /**
     * @return String return the tipoAgenda
     */
    public String getTipoAgenda() {
        return tipoAgenda;
    }

    /**
     * @param tipoAgenda the tipoAgenda to set
     */
    public void setTipoAgenda(String tipoAgenda) {
        this.tipoAgenda = tipoAgenda;
    }

    /**
     * @return String return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return String return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

}
