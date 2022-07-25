package com.example.cpf_validator.implementations;

import com.example.cpf_validator.interfaces.CpfValidator;

public class CpfValidatorImpl implements CpfValidator {
    CpfGeneratorImpl cpfGenerator;

    @Override
    public Boolean validator(String cpf) {
        cpfGenerator = new CpfGeneratorImpl();
        return cpf.equals(cpfGenerator.cpfGenerator(cpf));
    }

    @Override
    public boolean isSequence(String cpf) {
        char number = cpf.charAt(0);
        return cpf.matches(number + "+");
    }
}
