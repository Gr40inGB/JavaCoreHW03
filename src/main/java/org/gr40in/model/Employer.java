package org.gr40in.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Date;
import java.util.Objects;

/**
 *  in default compare by name
 */
public abstract class Employer implements Comparable<Employer> {
    private String name;
    private LocalDate birthDate;
    private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMM yyyy");


    public abstract BigDecimal getMonthlySalary();

    public Employer(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public int compareTo(Employer o) {
        return this.name.compareTo(o.name);
    }

    //region equals & hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employer employer = (Employer) o;
        return Objects.equals(name, employer.name) && Objects.equals(birthDate, employer.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthDate);
    }
    //endregion

    //region getters/setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return  name + " \t" + birthDate.format(formatter);
    }

    //endregion
}
