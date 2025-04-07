// https://www.codewars.com/kata/5837fd7d44ff282acd000157/train/java

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Day{
  public String countDays(Date d){
        Date today = new Date();
        if (d.before(today)) {
            return "The day is in the past!";
        }
        if (d.equals(today)) {
            return "Today is the day!";
        }
        long diffInMillis = d.getTime() - today.getTime();
        long days = TimeUnit.MILLISECONDS.toDays(diffInMillis);

        return days + " days";
    }
}
