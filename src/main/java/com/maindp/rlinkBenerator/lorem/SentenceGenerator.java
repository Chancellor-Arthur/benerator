package com.maindp.rlinkBenerator.lorem;
import com.github.javafaker.Faker;
import com.rapiddweller.benerator.util.ThreadSafeNonNullGenerator;

import java.util.Locale;

public class SentenceGenerator extends ThreadSafeNonNullGenerator<String> {
    private final Faker faker = new Faker();
    private final int wordsCount;
    private final int randomWordsToAdd;

    public SentenceGenerator() {
        this.wordsCount = 10;
        this.randomWordsToAdd = 5;
    }

    public SentenceGenerator(int wordsCount, int randomWordsToAdd) {
        this.wordsCount = wordsCount;
        this.randomWordsToAdd = randomWordsToAdd;
    }


    @Override
    public String generate() {
        return faker.lorem().sentence(wordsCount, randomWordsToAdd);
    }

    @Override
    public Class<String> getGeneratedType() {
        return String.class;
    }
}
