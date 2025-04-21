// https://www.codewars.com/kata/590ba881fe13cfdcc20001b4/train/sql

SELECT name, country
FROM travelers
WHERE country NOT IN ('Canada', 'Mexico', 'USA' )
