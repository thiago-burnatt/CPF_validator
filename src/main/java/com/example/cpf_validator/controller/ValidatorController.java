package com.example.cpf_validator.controller;

import com.example.cpf_validator.implementations.CpfValidatorImpl;
import com.example.cpf_validator.implementations.DigitGenetatorImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/validator")
public class ValidatorController {

    CpfValidatorImpl cpfValidator;
    DigitGenetatorImpl digitGenetator;

    @GetMapping(value = "/{cpf}")
    public String validator(@PathVariable String cpf) {
        cpfValidator = new CpfValidatorImpl();
        boolean valid = cpfValidator.validator(cpf);

        if (!valid || cpfValidator.isSequence(cpf)) {
            return "CPF" + " " + cpf + " é" + " inválido";
        } else {
            return "CPF" + " " + cpf + " é" + " válido";
        }
    }
}
