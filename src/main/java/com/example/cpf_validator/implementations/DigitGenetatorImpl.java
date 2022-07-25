package com.example.cpf_validator.implementations;

import com.example.cpf_validator.interfaces.DigitGenerator;

public class DigitGenetatorImpl implements DigitGenerator {

    @Override
    public String digitGenerator(String cpf) {
        int stringSize = (cpf.length() == 10) ? 10 : 9;

        String newCpf = cpf.substring(0, stringSize);

        char[] cpfChar = newCpf.toCharArray();
        int sum = 0;
        int counter = (cpf.length() == 10) ? 11 : 10;
        int firstDigit = 0;

        for (char c : cpfChar) {
            sum += counter * Integer.parseInt(String.valueOf(c));
            counter--;

            if (counter < 2) {
                firstDigit = (sum % 11 < 2) ? 0 : (11 - sum % 11);
                newCpf = newCpf.concat(Integer.toString(firstDigit));
            }
        }
        return newCpf;
    }

}
