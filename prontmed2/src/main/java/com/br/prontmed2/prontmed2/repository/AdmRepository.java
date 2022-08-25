package com.br.prontmed2.prontmed2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.prontmed2.prontmed2.models.AdmModel;



public interface AdmRepository extends JpaRepository<AdmModel,Long>  {
    //classe que possui um metodo abstrato que salva a entidade Paciente no banco de dados descrito nas propriedades do application.yml

}
