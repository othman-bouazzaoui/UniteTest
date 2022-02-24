package com.tawdi7atnet.unittest.mock.service;

import com.tawdi7atnet.unittest.mock.operator.Calculator;
import com.tawdi7atnet.unittest.mock.operator.CalculatorImpl;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private final Calculator calculator;

    public CalculatorServiceImpl(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Integer calculate(Integer a, Integer b, String operation) {

        Integer response = 0;
        switch (operation) {
            case "+":
                response = calculator.add(a, a);
                break;
            case "-":
                response = calculator.sub(a, b);
            break;
            default:
        }

        return response;
    }
}
