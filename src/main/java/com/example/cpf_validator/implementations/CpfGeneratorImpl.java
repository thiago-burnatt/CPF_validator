package com.example.cpf_validator.implementations;

import com.example.cpf_validator.interfaces.CpfGenerator;

public class CpfGeneratorImpl implements CpfGenerator {

    @Override
    public String cpfGenerator(String cpf) {
        DigitGenetatorImpl digitGenetator = new DigitGenetatorImpl();
        String cpfWithFirstDigit = digitGenetator.digitGenerator(cpf);
        return digitGenetator.digitGenerator(cpfWithFirstDigit);
    }

    @Override
    public String cpfGenerator() {
        return null;
    }
}
