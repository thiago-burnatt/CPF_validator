package com.example.cpf_validator.controller;

import com.example.cpf_validator.implementations.CpfValidatorImplTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ValidatorControllerTest {

    ValidatorController validatorController;

     private CpfValidatorImplTest cpfValidatorImplTest;

    @BeforeEach
    void setUp() {
        validatorController = new ValidatorController();
        cpfValidatorImplTest = new CpfValidatorImplTest();
    }

    @Test
    void validatorAssertEquals() {
        for (String s : cpfValidatorImplTest.incorrectCpfList) {
            assertEquals("CPF" + " " + s + " é" + " inválido", validatorController.validator(s));
        }
    }

    @Test
    void validatorAssertNotEquals() {
        for (String s : cpfValidatorImplTest.correctCpfList) {
            assertNotEquals("CPF" + " " + s + " é" + " inválido", validatorController.validator(s));
        }
    }
}