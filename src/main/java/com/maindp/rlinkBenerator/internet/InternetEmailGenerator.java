package com.maindp.rlinkBenerator.internet;

import com.github.javafaker.Faker;
import com.rapiddweller.benerator.util.ThreadSafeNonNullGenerator;

import java.util.Locale;

public class InternetEmailGenerator extends ThreadSafeNonNullGenerator<String> {
    private final Faker faker = new Faker();

    @Override
    public String generate() {
        return faker.internet().emailAddress();
    }

    @Override
    public Class<String> getGeneratedType() {
        return String.class;
    }
}
