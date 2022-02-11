package com.tawdi7atnet.unittest;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionsClassTest {

    //L'utilisation du assertJ au lieu de JUnit
    @Test
    void dbNameTest() {
        assertEquals("GSTOCK",FunctionsClass.dbName.get());

    }

    @Test
    void additionTest(){
        //GIVEN
        int a = 10;
        int b = 20;

        //WHEN
        int somme = FunctionsClass.addition(a,b);

        //THEN
        assertThat(30).isEqualTo(somme);
    }

}
