// https://www.codewars.com/kata/586a1af1c66d18ad81000134/train/java

import java.util.HashMap;
import java.util.Map;

public class Solution {
  public static String driver(final String[] data) {
    StringBuilder builder = new StringBuilder();
        Map<String, Integer> monthes = new HashMap<>();
        monthes.put("Jan", 1);
        monthes.put("Feb", 2);
        monthes.put("Mar", 3);
        monthes.put("Apr", 4);
        monthes.put("May", 5);
        monthes.put("Jun", 6);
        monthes.put("Jul", 7);
        monthes.put("Aug", 8);
        monthes.put("Sep", 9);
        monthes.put("Oct", 10);
        monthes.put("Nov", 11);
        monthes.put("Dec", 12);
        monthes.put("January", 1);
        monthes.put("February", 2);
        monthes.put("March", 3);
        monthes.put("April", 4);
        monthes.put("May", 5);
        monthes.put("June", 6);
        monthes.put("July", 7);
        monthes.put("August", 8);
        monthes.put("September", 9);
        monthes.put("October", 10);
        monthes.put("November", 11);
        monthes.put("December", 12);

        String surname = data[2];
        if (surname.length() < 5) {
            builder.append(surname);
            for (int i = surname.length(); i < 5; i++) {
                builder.append('9');
            }
        } else {
            builder.append(surname.substring(0, 5)); //1–5: The first five characters of the surname (padded with 9s if less than 5 characters)
        }

        String birthdate = data[3];
        String[] birthdateArr = birthdate.split("-");
        builder.append(birthdateArr[2].charAt(2)); //The decade digit from the year of birth (e.g. for 1987 it would be 8)

        String month = birthdateArr[1];
        Integer monthInt = monthes.get(month); //7–8: The month of birth (7th character incremented by 5 if driver is female i.e. 51–62 instead of 01–12)
        if (data[4].equals("F")) {
            monthInt += 50;
            builder.append(monthInt);
        } else {
            String s = String.valueOf(monthInt);
            if (s.length() == 1) {
                builder.append("0").append(s);
            } else {
                builder.append(s);
            }
        }

        builder.append(birthdateArr[0]); //9–10: The date within the month of birth

        builder.append(birthdateArr[2].charAt(3)); //11: The year digit from the year of birth (e.g. for 1987 it would be 7)

        builder.append(data[0].charAt(0)); //12–13: The initial letter of the first name and middle name, padded with a 9 if no middle name
        if (data[1].isEmpty()) {
            builder.append('9');
        } else {
            builder.append(data[1].charAt(0));
        }

        builder.append("9AA"); //14: Arbitrary digit – usually 9, but decremented to differentiate drivers with the first 13 characters in common. We will always use 9
        // 15–16: Two computer check digits. We will always use "AA"

        return builder.toString().toUpperCase();
  }
}
