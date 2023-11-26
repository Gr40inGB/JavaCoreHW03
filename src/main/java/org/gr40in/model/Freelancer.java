package org.gr40in.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Freelancer extends Employer {
    private BigDecimal hourlyRate;

    @Override
    public BigDecimal getMonthlySalary() {
        return hourlyRate.multiply(EmployerService.getWorkHoursOfTheMonth());
    }

    public Freelancer(String name, LocalDate birthDate, BigDecimal hourlyRate) {
        this(name, birthDate);
        this.hourlyRate = hourlyRate == null ? EmployerService.getMinHourlyRate() : hourlyRate;
    }

    public Freelancer(String name, LocalDate birthDate) {
        super(name, birthDate);
        if (this.hourlyRate == null) this.hourlyRate = EmployerService.getMinHourlyRate();
    }

    @Override
    public String toString() {
        return super.toString() + " - Freelancer(" + getMonthlySalary() + ")";
    }
}

