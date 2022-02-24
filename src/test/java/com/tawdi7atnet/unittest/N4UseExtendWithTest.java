package com.tawdi7atnet.unittest;

import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(LoggingExtension.class)
public class N4UseExtendWithTest {

    private Logger logger;

    private N4UseExtendWith n4UseExtendWith;

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    @BeforeEach
    void beforeEveryMethode() {
        logger.info("L'execution avant chaque Test");
        n4UseExtendWith = new N4UseExtendWith();
    }

    @AfterEach
    void afterEveryMethode() {
        logger.info("L'execution après chaque Test");
    }

    @Test
    void sayHelloTest() {

        assertThat(n4UseExtendWith.sayHello()).isEqualTo("hello");
    }


}
