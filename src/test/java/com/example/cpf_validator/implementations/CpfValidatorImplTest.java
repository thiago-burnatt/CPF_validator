package com.example.cpf_validator.implementations;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ListIterator;

import static org.junit.jupiter.api.Assertions.*;

public class CpfValidatorImplTest {

    private CpfValidatorImpl cpfValidator;
    private CpfGeneratorImpl cpfGenerator;

    public List<String> correctCpfList = List.of("27993988047", "13045735088", "66185902052", "32150994038",
            "79052603057", "99451804013", "09049723055", "49729684006", "19478303090", "68709560068");

    public List<String> incorrectCpfList = List.of("27993988044", "13045735084", "66185102052", "32155994038",
            "79052603957", "99451824013", "09049793055", "49729384006", "19478343090", "68709565068");


    @BeforeEach
    void setUp() {
        cpfValidator = new CpfValidatorImpl();
        cpfGenerator = new CpfGeneratorImpl();
    }

    @Test
    void returnsGeneratedCpfAndCompareWithRealCpfList() {
        for (String s : correctCpfList) {
            assertEquals(cpfGenerator.cpfGenerator(s), s);
        }
    }

    @Test
    void validationOfRealCpfListReturnsTrue() {
        for (String s : correctCpfList) {
            assertTrue(cpfValidator.validator(s));
        }
    }

    @Test
    void validationOfRealCpfListReturnsFalse() {
        for (String s : incorrectCpfList) {
            assertFalse(cpfValidator.validator(s));
        }
    }

    @Test
    void validatorAssertNotEquals() {
        for (String s : incorrectCpfList) {
            assertFalse(cpfValidator.validator(s));
        }
    }

    @RepeatedTest(10)
    void isSequence() {
        String sequence = "";
        int digit = (int) (Math.random() * 10);
        for (int x = 0; x <=10; x++) {
            sequence = sequence.concat(Integer.toString(digit));
        }
        assertTrue(cpfValidator.isSequence(sequence));
    }
}
