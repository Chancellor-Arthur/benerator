package com.maindp.rlinkBenerator.lorem;
import com.github.javafaker.Faker;
import com.rapiddweller.benerator.util.ThreadSafeNonNullGenerator;

import java.util.Locale;

public class WordGenerator extends ThreadSafeNonNullGenerator<String> {
    private final Faker faker = new Faker();

    @Override
    public String generate() {
        return faker.lorem().word();
    }

    @Override
    public Class<String> getGeneratedType() {
        return String.class;
    }
}
