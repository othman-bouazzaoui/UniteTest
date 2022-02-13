package com.tawdi7atnet.unittest;

import java.util.function.Supplier;

public class N2FunctionsClass {

    public static Supplier<String> dbName = () -> "GSTOCK";

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
