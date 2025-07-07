// https://www.codewars.com/kata/557af4c6169ac832300000ba/train/java

public class FruitGuy{
 
 public static String[] removeRotten(String[] fruitBasket) {
        if (fruitBasket == null || fruitBasket.length == 0) {
            return new String[]{};
        }
        for (int i = 0; i < fruitBasket.length; i++) {
            if (fruitBasket[i].contains("rotten")) {
                fruitBasket[i] = fruitBasket[i].substring(6).toLowerCase();
            } else {
                fruitBasket[i] = fruitBasket[i].toLowerCase();
            }
        }
        return fruitBasket;
 }
}
