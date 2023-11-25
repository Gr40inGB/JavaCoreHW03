package org.gr40in.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

public class Worker extends Employer {

    private BigDecimal fixedPeeForMonth;

    @Override
    public BigDecimal getMonthlySalary() {
        return fixedPeeForMonth != null ? fixedPeeForMonth : EmployerService.getMinFixedPeeForMonth();
    }

    //region Constructor

    public Worker(String name, LocalDate birthDate) {
        super(name, birthDate);
        if (this.fixedPeeForMonth == null) this.fixedPeeForMonth = EmployerService.getMinFixedPeeForMonth();
    }

    public Worker(String name, LocalDate birthDate, BigDecimal fixedPeeForMonth) {
        this(name, birthDate);
        this.fixedPeeForMonth = fixedPeeForMonth;
    }

    //endregion

    @Override
    public String toString() {
        return super.toString() + " - Worker(" + fixedPeeForMonth + ")";
    }


    //region getters/setters

    public BigDecimal getFixedPeeForMonth() {
        return fixedPeeForMonth;
    }

    public void setFixedPeeForMonth(BigDecimal fixedPeeForMonth) {
        this.fixedPeeForMonth = fixedPeeForMonth;
    }

    //endregion
}
