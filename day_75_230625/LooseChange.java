// https://www.codewars.com/kata/5571f712ddf00b54420000ee/train/java

import java.util.HashMap;

public class Change {
	public static HashMap<String, Integer> looseChange(int cent) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Pennies", 0);
        map.put("Nickels", 0);
        map.put("Dimes", 0);
        map.put("Quarters", 0);

        if (cent <= 0) {
            return map;
        }

        int quarters = cent / 25;
        cent -= quarters * 25;

        int dimes = cent / 10;
        cent -= dimes * 10;

        int nickels = cent / 5;
        cent -= nickels * 5;

        int pennies = cent;

        map.put("Pennies", pennies);
        map.put("Nickels", nickels);
        map.put("Dimes", dimes);
        map.put("Quarters", quarters);
        return map;
	}
}
