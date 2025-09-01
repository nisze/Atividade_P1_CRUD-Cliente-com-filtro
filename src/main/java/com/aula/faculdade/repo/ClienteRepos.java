package com.aula.faculdade.repo;

import com.aula.faculdade.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepos extends JpaRepository<Cliente, Long>, JpaSpecificationExecutor<Cliente> {
}
