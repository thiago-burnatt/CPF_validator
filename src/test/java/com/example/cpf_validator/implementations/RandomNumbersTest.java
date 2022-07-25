package com.example.cpf_validator.implementations;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumbersTest {

    @RepeatedTest(10)
    void randomNumersLengthEqualsNine() {
        RandomNumbersImpl randomNumbers = new RandomNumbersImpl();
        assertEquals(9, randomNumbers.randomNumbers().length());
    }
}