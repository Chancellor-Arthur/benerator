package com.maindp.rlinkBenerator.company;

import com.github.javafaker.Faker;
import com.rapiddweller.benerator.util.ThreadSafeNonNullGenerator;

import java.util.Locale;

public class CompanyNameGenerator extends ThreadSafeNonNullGenerator<String> {
    private final Faker faker = new Faker();

    @Override
    public String generate() {
        return faker.company().name();
    }

    @Override
    public Class<String> getGeneratedType() {
        return String.class;
    }
}
