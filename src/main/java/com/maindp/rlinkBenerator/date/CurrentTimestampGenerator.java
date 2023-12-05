package com.maindp.rlinkBenerator.date;

import com.rapiddweller.benerator.util.ThreadSafeNonNullGenerator;

import java.sql.Timestamp;

public class CurrentTimestampGenerator extends ThreadSafeNonNullGenerator<Timestamp> {

    @Override
    public Timestamp generate() {
        return new Timestamp(System.currentTimeMillis());
    }

    @Override
    public Class<Timestamp> getGeneratedType() {
        return Timestamp.class;
    }
}
