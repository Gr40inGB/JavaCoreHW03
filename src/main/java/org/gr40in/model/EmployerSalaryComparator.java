package org.gr40in.model;

import java.util.Comparator;

public class EmployerSalaryComparator implements Comparator<Employer> {
    @Override
    public int compare(Employer o1, Employer o2) {
        return o1.getMonthlySalary().subtract(o2.getMonthlySalary()).intValue();
    }
}
