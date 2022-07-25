package com.example.cpf_validator.implementations;

public class RandomNumbersImpl implements com.example.cpf_validator.interfaces.RandomNumbers {
    @Override
    public String randomNumbers() {
        String numbers = "";

        for (int x = 0; x <= 8; x++) {
            int number = (int) (Math.random() * 10);
            numbers = numbers.concat(Integer.toString(number));
        }
        return numbers;
    }
}
