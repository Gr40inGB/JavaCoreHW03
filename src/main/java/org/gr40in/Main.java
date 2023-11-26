package org.gr40in;

import org.gr40in.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employer[] employers = {
                new Worker("HUGH LAURIE", LocalDate.of(1959, 6, 11), new BigDecimal(100_000)),
                new Freelancer("TAYLOR SWIFT", LocalDate.of(1989, 12, 13)),
                new Freelancer("MR.BEAST =)", LocalDate.of(1998, 5, 7), new BigDecimal(1000_000)),
                new Worker("JUSTIN BIEBER", LocalDate.of(1994, 3, 1), new BigDecimal(150_000)),
                new Freelancer("ARIANA GRANDE", LocalDate.of(1993, 6, 26)),
                new Freelancer("MILLIE B.BROWN", LocalDate.of(2004, 2, 19), new BigDecimal(500)),
                new Worker("BILLIE EILISH", LocalDate.of(2001, 12, 18), new BigDecimal(70_000)),
                new Freelancer("MATTHEW PERRY", LocalDate.of(1969, 8, 19)),
                new Worker("JENNA ORTEGA", LocalDate.of(2002, 9, 27), new BigDecimal(50_000)),
                new Worker("ZENDAYA ^_^", LocalDate.of(1996, 9, 1), new BigDecimal(120_000)),
                new Freelancer("TOM HOLLAND", LocalDate.of(1996, 6, 1), new BigDecimal(100))
        };


        List<Employer> list = new ArrayList<>(Arrays.asList(employers));
        printList(list);
        //  default sort by name
        Collections.sort(list);
        printList(list);

        //  sort by salary
        Collections.sort(list, new EmployerSalaryComparator());
        printList(list);

        Staff staff = new Staff(employers);

        //sort by years
        staff.getStaffList().sort(new EmployerOldComparator());

        staff.forEach(System.out::println);

    }

    public static void printList(List<Employer> list) {
        for (Employer employer : list) {
            System.out.println("\t" + employer);
        }
        System.out.println("*********************************************************");
    }

}