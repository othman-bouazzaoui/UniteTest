package com.tawdi7atnet.unittest.mock.operator;

import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void setUp(){
        calculator = new CalculatorImpl();
    }

    @Test
    void add_shouldReturntheSum_OfTwoNumbertypeInt(){
        assertThat(4).isEqualTo(calculator.add(2,2));
    }
    @Test
    void sub_shouldReturntheDifference_BetweenTwoNumbertypeInt(){
        assertThat(3).isEqualTo(calculator.sub(5,2));
    }
}
