package com.example.cpf_validator.controller;

import com.example.cpf_validator.implementations.CpfCreator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/generate")
public class CpfGenerator {

    @GetMapping
    public String generatedCpf() {
        CpfCreator cpfCreator = new CpfCreator();
        return cpfCreator.cpfGenerator();
    }
}
