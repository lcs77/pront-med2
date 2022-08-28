package com.br.prontmed2.prontmed2.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.br.prontmed2.prontmed2.models.Agendamento;



public interface AgendamentoRepository extends JpaRepository <Agendamento, Long>{
   
    
}
