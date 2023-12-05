package com.maindp.rlinkBenerator.job;

import com.github.javafaker.Faker;
import com.rapiddweller.benerator.util.ThreadSafeNonNullGenerator;

public class JobTitleGenerator extends ThreadSafeNonNullGenerator<String> {
    private final Faker faker = new Faker();

    @Override
    public String generate() {
        return faker.job().title();
    }

    @Override
    public Class<String> getGeneratedType() {
        return String.class;
    }
}
