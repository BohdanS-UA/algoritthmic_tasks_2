// https://www.codewars.com/kata/5ab828bcedbcfc65ea000099/train/sql

SELECT p.pokemon_name, 
       (p.str * m.multiplier) AS modifiedStrength, 
       m.element
FROM pokemon p
LEFT JOIN multipliers m ON p.element_id = m.id
WHERE (p.str * m.multiplier) >= 40
ORDER BY modifiedStrength DESC;
