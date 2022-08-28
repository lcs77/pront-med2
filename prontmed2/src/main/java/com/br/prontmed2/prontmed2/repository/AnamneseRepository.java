package com.br.prontmed2.prontmed2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.prontmed2.prontmed2.models.AnamneseModel;

public interface AnamneseRepository extends JpaRepository<AnamneseModel,Long>  {
    //classe que possui um metodo abstrato que salva a entidade Paciente no banco de dados descrito nas propriedades do application.yml

}
