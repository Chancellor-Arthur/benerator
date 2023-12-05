package com.maindp.rlinkBenerator.job;

import com.github.javafaker.Faker;
import com.rapiddweller.benerator.util.ThreadSafeNonNullGenerator;

import java.util.Locale;

public class CompanyProfessionGenerator extends ThreadSafeNonNullGenerator<String> {
    private final Faker faker = new Faker();

    @Override
    public String generate() {
        return faker.company().profession();
    }

    @Override
    public Class<String> getGeneratedType() {
        return String.class;
    }
}
