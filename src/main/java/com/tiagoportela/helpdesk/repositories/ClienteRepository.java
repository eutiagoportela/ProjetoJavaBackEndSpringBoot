package com.tiagoportela.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoportela.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
