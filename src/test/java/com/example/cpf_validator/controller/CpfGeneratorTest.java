package com.example.cpf_validator.controller;

import com.example.cpf_validator.implementations.CpfValidatorImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CpfGeneratorTest {

    CpfGeneratorController cpfGenerator;
    CpfValidatorImpl cpfValidator;

    @BeforeEach
    void setUp() {
        cpfGenerator = new CpfGeneratorController();
        cpfValidator = new CpfValidatorImpl();
    }

    @Test
    void generatedCpf() {
        assertTrue(cpfValidator.validator(cpfGenerator.generatedCpf()));
    }
}