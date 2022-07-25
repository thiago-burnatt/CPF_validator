package com.example.cpf_validator.implementations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class CpfCreatorTest {

    private CpfCreator cpfCreator;
    private CpfGeneratorImpl cpfGenerator;
    private CpfValidatorImpl cpfValidator;


    @BeforeEach
    void setUp() {
        cpfCreator = new CpfCreator();
        cpfGenerator = new CpfGeneratorImpl();
        cpfValidator = new CpfValidatorImpl();

    }

    @RepeatedTest(10)
    void cpfGenerator() {
        String cpf = cpfCreator.cpfGenerator();
        assertEquals(cpf, cpfGenerator.cpfGenerator(cpf));
    }

    @RepeatedTest(10)
    void generateACpfAndAssertEquals() {
        String cpf = cpfCreator.cpfGenerator();
        assertTrue(cpfValidator.validator(cpf));
    }

    @RepeatedTest(10)
    void cpfGeneratorLengthEqualsToEleven() {
        String cpf = cpfCreator.cpfGenerator();
        assertEquals(11, cpf.length());
    }
}