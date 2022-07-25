package com.example.cpf_validator.implementations;

import com.example.cpf_validator.interfaces.CpfGenerator;

public class CpfCreator implements CpfGenerator {

    DigitGenetatorImpl digitGenetator;
    RandomNumbersImpl randomNumbers;

    @Override
    public String cpfGenerator() {
        digitGenetator = new DigitGenetatorImpl();
        randomNumbers = new RandomNumbersImpl();

        String cpfWithFirsDigit = digitGenetator.digitGenerator(randomNumbers.randomNumbers());
        return digitGenetator.digitGenerator(cpfWithFirsDigit);
    }

    @Override
    public String cpfGenerator(String cpf) {
        return null;
    }
}
