package com.tiagoportela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoportela.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer> {

}
