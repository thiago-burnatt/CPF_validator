package com.example.cpf_validator.implementations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitGenetatorImplTest {

    DigitGenetatorImpl digitGenetator;
    CpfCreator cpfCreator;

    @BeforeEach
    void setUp() {
        digitGenetator = new DigitGenetatorImpl();
        cpfCreator = new CpfCreator();
    }

    @RepeatedTest(10)
    void lenghtOfCpfWithFirstDigitEqualsTen() {
        String cpf = cpfCreator.cpfGenerator();
        assertEquals(10, digitGenetator.digitGenerator(cpf).length());
    }

    @RepeatedTest(10)
    void lenghtOfCpfWithSecondDigitEqualsEleven() {
        String cpf = cpfCreator.cpfGenerator();
        String cpfWithFirstDigit = digitGenetator.digitGenerator(cpf);
        assertEquals(11, digitGenetator.digitGenerator(cpfWithFirstDigit).length());
    }
}