package com.example.cpf_validator.controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratorValidatorTest {

    CpfGenerator cpfGenerator;
    ValidatorController validatorController;

    @BeforeEach
    void setUp() {
        cpfGenerator = new CpfGenerator();
        validatorController = new ValidatorController();
    }

    @RepeatedTest(10)
    void generateAndValidateCpfByControllers() {
        String cpf = cpfGenerator.generatedCpf();
        assertEquals("CPF" + " " + cpf + " é" + " válido", validatorController.validator(cpf));
    }
}
