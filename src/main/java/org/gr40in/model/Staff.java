package org.gr40in.model;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Staff implements Iterable<Employer>{
    private List<Employer> staffList;

    public Staff() {
    }

    public Staff(List<Employer> staffList) {
        this.staffList = staffList;
    }

    public Staff(Employer[] employersArray) {
        this(Arrays.asList(employersArray));
    }


    public List<Employer> getStaffList() {
        return staffList;
    }

    public void setStaffList(List<Employer> staffList) {
        this.staffList = staffList;
    }

    @Override
    public Iterator<Employer> iterator() {
        return null;
    }
}
