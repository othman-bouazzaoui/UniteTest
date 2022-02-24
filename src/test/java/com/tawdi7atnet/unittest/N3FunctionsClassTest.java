package com.tawdi7atnet.unittest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("TAG_VALIDATION")
public class N3FunctionsClassTest {

    static N3FunctionsClass n3FunctionsClass;

    @BeforeAll
    public static void init() {
        System.out.println("init");
        n3FunctionsClass = new N3FunctionsClass();
    }

    @AfterAll
    public static void end() {
        System.out.println("End");
        n3FunctionsClass = null;
    }

    @ParameterizedTest(name = "IS A VALIDATED Mail {0}")
    @ValueSource(strings = {"othman@tawdi7atnet.com", "othmanbouazzaoui9@tawdi7atnet.fr"})
    public void isValidatedEmail(String email) {
        boolean result = n3FunctionsClass.isValidatedMail.test(email);
        assertThat(result).isTrue();
    }

    @Nested
    @DisplayName("Nested Class pour regrouper plusieurs Test ex le nom et prenom")
    public class TestFirstName_LastName_Validation {
        @ParameterizedTest(name = "IS A VALIDATED LASTNAME {0}")
        @ValueSource(strings = {"BOUAZZAOUI", "KHOUIRI"})
        public void isValidatedLastName(String name) {
            boolean result = n3FunctionsClass.isValidatedLastName.test(name);
            assertThat(result).isTrue();
        }
        @ParameterizedTest(name = "IS A VALIDATED FIRSTNAME {0}")
        @ValueSource(strings = {"Othman", "Mohamed"})
        public void isValidatedFirstName(String name) {
            boolean result = n3FunctionsClass.isValidatedFirstName.test(name);
            assertThat(result).isTrue();
        }
    }

}
