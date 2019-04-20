package com.daniel.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.cursomc.domain.Cidade;


@Repository
public interface CidadeRopository extends JpaRepository<Cidade,Integer> {

}