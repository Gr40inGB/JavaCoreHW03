package org.gr40in.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Freelancer extends Employer {
    private BigDecimal hourlyRate;

    @Override
    public BigDecimal getMonthlySalary() {
        return null;
    }

    public Freelancer(String name, LocalDate birthDate, BigDecimal hourlyRate) {
        this(name, birthDate);
        this.hourlyRate = hourlyRate;
    }

    public Freelancer(String name, LocalDate birthDate) {
        super(name, birthDate);
    }

    @Override
    public String toString() {
        return super.toString() + " - Freelancer(" + hourlyRate + ")";
    }
}

