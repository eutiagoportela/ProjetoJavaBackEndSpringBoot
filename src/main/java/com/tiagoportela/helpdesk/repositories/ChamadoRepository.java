package com.tiagoportela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoportela.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

}
