package com.maindp.rlinkBenerator.job;

import com.github.javafaker.Faker;
import com.rapiddweller.benerator.util.ThreadSafeNonNullGenerator;

import java.util.Locale;

public class JobKeySkillsGenerator extends ThreadSafeNonNullGenerator<String> {
    private final Faker faker = new Faker();

    @Override
    public String generate() {
        return faker.job().keySkills();
    }

    @Override
    public Class<String> getGeneratedType() {
        return String.class;
    }
}
