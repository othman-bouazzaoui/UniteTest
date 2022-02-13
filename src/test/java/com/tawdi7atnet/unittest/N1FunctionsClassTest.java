package com.tawdi7atnet.unittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

public class N1FunctionsClassTest {

    private static Instant startAt=Instant.now();

    @BeforeAll
    static public void methodCallBeforeAllTest(){
        System.out.println("ce traitement s'execute avant tous les test unitaire start at : " + startAt);
    }

    @AfterAll
    static public void methodCallAfterAllTest(){
        Instant endAt = Instant.now();
        System.out.println("ce traitement s'execute après tous test unitaire => finished at : " + endAt);
        System.out.println("le nombre des ms a pris le traitement : " + Duration.between(startAt,endAt).toMillis());
    }

    @BeforeEach
    public void methodCallBeforeAnyTest(){
        System.out.println("ce traitement s'execute avant chaque test unitaire");
    }
    @AfterEach
    public void methodCallAfterAnyTest(){
        System.out.println("ce traitement s'execute après chaque test unitaire");
    }

    @Test
    void sommeTest(){
        //étape Arrange : je paramètre les entrants des tests
        int a = 10;
        int b = 5;

        //étape Act : j'effectue l'action sur la classe à tester
        Integer resultat = N1FunctionsClass.somme.apply(a,b);

        //étape Assert : je vérifie les résultats (sortants) de l'action.
        assertEquals(15,resultat);

    }

    //Il est possible de passer des arguments à travres cette annotation
    //@ValueSource est nécessaire en cas d'utilisation de @ParameterizedTest
    @ParameterizedTest(name = "{0} fois 0 doit etre egal 0")
    @ValueSource(ints = {10,20,30})
    //@CsvSource() il est possible de faire appel un format csv
    //@CsvSource({ "1,1,2", "2,3,5", "42,57,99" })

    void multiply(int args){
        //étape Arrange : je paramètre les entrants des tests
        int a = args;
        int b = 0;

        //étape Act : j'effectue l'action sur la classe à tester
        Integer resultat = N1FunctionsClass.multiply.apply(a,b);

        //étape Assert : je vérifie les résultats (sortants) de l'action.
        assertEquals(0,resultat);
    }

    //@Timeout pour tester la performance et la réponse dans un temps accéptable si dépasse ce le temps indiqué donc le test sera en erreur
    @Timeout(value = 3000,unit = TimeUnit.MILLISECONDS)
    @Test
    void methodTakeTimeTest(){
        N1FunctionsClass.methodTakeTime();
    }
}
