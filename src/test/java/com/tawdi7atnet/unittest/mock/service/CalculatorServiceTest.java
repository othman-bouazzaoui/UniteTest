package com.tawdi7atnet.unittest.mock.service;

import com.tawdi7atnet.unittest.mock.operator.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class CalculatorServiceTest {

    @Mock
    Calculator calculator ;

    CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorServiceImpl(calculator);
    }

    @Test
    @DisplayName("La 1ere manière pour utiliser les methode du MocK")
    public void calculate_twoNumberIntegerM1() {
        //GIVEN
        when(calculator.add(2, 2)).thenReturn(4);

        //WHEN
        int result = calculatorService.calculate(2,2, "+");

        //THEN
        verify(calculator).add(2,2);
        assertThat(result).isEqualTo(4);
    }

    @Test
    @DisplayName("La 2eme manière pour utiliser les methode du MocK")
    public void calculate_twoNumberIntegerM2() {
        //GIVEN
        when(calculator.add(any(Integer.class), any(Integer.class))).thenReturn(5);

        //WHEN
        int result = calculatorService.calculate(2,3, "+");

        //THEN
        //times(1) Pour qu'on assure que cette methode est appelé 1 seul fois
        verify(calculator,times(1)).add(any(Integer.class),any(Integer.class));

        //never() Vérifier si la méthode à été jamais sollicité sinon il suppose qu'il y a une erreur
        verify(calculator,never()).sub(any(Integer.class),any(Integer.class));
        assertThat(result).isEqualTo(5);
    }
}
