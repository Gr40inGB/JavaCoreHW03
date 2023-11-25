package org.gr40in.model;

import java.math.BigDecimal;

public class EmployerService {
    public static BigDecimal getMinHourlyRate() {
        return BigDecimal.valueOf(100.00);
    }

    public static BigDecimal getMinFixedPeeForMonth() {
        return BigDecimal.valueOf(60_000.00);
    }

    public static BigDecimal getWorkHoursOfTheMonth() {
        return BigDecimal.valueOf(20.8 * 8);
    }

}
