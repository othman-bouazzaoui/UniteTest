package com.tawdi7atnet.unittest.mock.operator;

import java.util.function.BiFunction;

public class CalculatorImpl implements Calculator{
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b + 1;
    }

    BiFunction<Integer,Integer,Integer> addP = Integer::sum;

    @Override
    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

}
