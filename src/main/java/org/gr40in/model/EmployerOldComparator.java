package org.gr40in.model;

import java.util.Comparator;

public class EmployerOldComparator implements Comparator<Employer> {
    @Override
    public int compare(Employer o1, Employer o2) {
        return o2.getBirthDate().compareTo(o1.getBirthDate());
    }
}
