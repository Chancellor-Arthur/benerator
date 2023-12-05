package com.maindp.rlinkBenerator.company;

import com.github.javafaker.Faker;
import com.rapiddweller.benerator.util.ThreadSafeNonNullGenerator;

public class CompanyIndustryGenerator extends ThreadSafeNonNullGenerator<String> {
    private final Faker faker = new Faker();

    @Override
    public String generate() {
        return faker.company().industry();
    }

    @Override
    public Class<String> getGeneratedType() {
        return String.class;
    }
}
