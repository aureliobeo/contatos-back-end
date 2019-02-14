package com.marcosaurelio.contatos.controllers;

import com.marcosaurelio.contatos.models.Contato;
import com.marcosaurelio.contatos.services.ContatosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/contatos")
@CrossOrigin
public class ContatosController {

    @Autowired
    private ContatosService contatosService;

    @GetMapping(value = "/")
    public List<Contato> getContatos() {
        return this.contatosService.getContatos();
    }

    @PostMapping(value = "/")
    public Contato save(Contato contato) {
        return this.contatosService.save(contato);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Long id) {
        this.contatosService.delete(id);
    }

    @PutMapping(value = "/{id}")
    public Contato update(@PathVariable("id") Long id, Contato contato) {
        return this.contatosService.update(id, contato);
    }

}
