package com.marcosaurelio.contatos.repositories;

import com.marcosaurelio.contatos.models.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContatosRepository extends JpaRepository<Contato, Long> {

}
