// https://www.codewars.com/kata/569218bc919ccba77000000b/train/java

import java.text.*;
import java.util.*;
import java.time.LocalDate;

public class DateDays {
    
    public static String dateNbDays(double a0, double a, double p) {
        double dailyRate = p / 360;
        int counterDays = 0;
        do {
            a0 = a0 * (dailyRate/100 + 1);
            counterDays++;
        } while (a0 < a);
        LocalDate startDate = LocalDate.of(2016, 01, 01);
        LocalDate finalDate = startDate.plusDays(counterDays);
        return finalDate.toString();
    }
}
