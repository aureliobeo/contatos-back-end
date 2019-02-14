package com.marcosaurelio.contatos.services;

import com.marcosaurelio.contatos.models.Contato;
import com.marcosaurelio.contatos.repositories.ContatosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatosService {

    @Autowired
    private ContatosRepository contatosRepository;

    public List<Contato> getContatos() {
        return this.contatosRepository.findAll();
    }

    public Contato save(Contato contato) {
        return this.contatosRepository.save(contato);
    }

    public void delete(Long id) {
        this.contatosRepository.deleteById(id);
    }

    public Contato update(Long id, Contato contato) {
        return this.contatosRepository.save(contato);
    }
}
