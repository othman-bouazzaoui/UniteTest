package com.tawdi7atnet.unittest;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class N3FunctionsClass  {

    public Predicate<String> isValidatedMail = (s) -> Pattern.compile("^([a-zA-Z-0-9]){5,20}@tawdi7atnet\\.(com|fr)?").matcher(s).matches();

    public Predicate<String> isValidatedLastName = Pattern.compile("^([A-Z]){2,25}?").asPredicate();

    public Predicate<String> isValidatedFirstName = Pattern.compile("^([A-Z]){1}?([a-z]){1,25}?").asPredicate();
}
