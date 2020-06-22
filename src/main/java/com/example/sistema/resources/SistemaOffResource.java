package com.example.sistema.resources;

import java.util.List;

import com.example.sistema.domain.SistemaOff;
import com.example.sistema.repository.SistemaOffRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class SistemaOffResource {

@Autowired
SistemaOffRepository sistemaOffRepository;

@GetMapping("/sistemaoff")
public List<SistemaOff> listaSistemas(){
    return SistemaOffRepository.findAll();
}

    
}