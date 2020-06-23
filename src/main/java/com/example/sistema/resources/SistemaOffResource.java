package com.example.sistema.resources;

import java.util.List;

import com.example.sistema.domain.SistemaOff;
import com.example.sistema.repository.SistemaOffRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class SistemaOffResource {

    @Autowired
    SistemaOffRepository sistemaOffRepository;

    @GetMapping("/sistemaoff")
    public List<SistemaOff> listaSistemas() {
        return sistemaOffRepository.findAll();
    }

    @GetMapping("/sistemaoff/{id}")
    public SistemaOff listaSistemaUnico(@PathVariable(value = "id") Integer id) {
        return sistemaOffRepository.findById(id).orElseThrow(null);
    }

    @PostMapping("/sistemaoff")
    public SistemaOff salvaSistemaOff(@RequestBody SistemaOff sistemaOff) {
        return sistemaOffRepository.save(sistemaOff);
    }

    @DeleteMapping("/sistemaoff")
    public void deletaSistemaOff(@RequestBody SistemaOff sistemaOff) {
        sistemaOffRepository.delete(sistemaOff);
    }

    @PutMapping("/sistemaoff")
    public SistemaOff atualizaSistemaOff(@RequestBody SistemaOff sistemaOff) {
        return sistemaOffRepository.save(sistemaOff);
    }

}