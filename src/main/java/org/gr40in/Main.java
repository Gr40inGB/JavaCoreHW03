package org.gr40in;

import org.gr40in.model.Employer;
import org.gr40in.model.Freelancer;
import org.gr40in.model.Staff;
import org.gr40in.model.Worker;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employer[] employers = {
                new Worker("HUGH LAURIE", LocalDate.of(1959, 6, 11)),
                new Freelancer("TAYLOR SWIFT", LocalDate.of(1989, 12, 13)),
                new Freelancer("MR.BEAST", LocalDate.of(1998, 5, 7)),
                new Worker("JUSTIN BIEBER", LocalDate.of(1994, 3, 1)),
                new Freelancer("ARIANA GRANDE", LocalDate.of(1993, 6, 26)),
                new Freelancer("MILLIE BOBBY BROWN", LocalDate.of(2004, 2, 19)),
                new Worker("BILLIE EILISH", LocalDate.of(2001, 12, 18)),
                new Freelancer("MATTHEW PERRY", LocalDate.of(1969, 8, 19)),
                new Worker("JENNA ORTEGA", LocalDate.of(2002, 9, 27)),
                new Freelancer("TOM HOLLAND", LocalDate.of(1996, 6, 1)),
                new Worker("ZENDAYA", LocalDate.of(1996, 9, 1)),
        };

        Staff currentStaff = new Staff(employers);
        System.out.println(currentStaff.getStaffList());

    }


}