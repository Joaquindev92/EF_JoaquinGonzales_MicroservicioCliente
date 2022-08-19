package com.idat.EF_JOAQUINGONZALES_MICROSERVICIOCLIENTE.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.EF_JOAQUINGONZALES_MICROSERVICIOCLIENTE.modelo.Cliente;

@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
