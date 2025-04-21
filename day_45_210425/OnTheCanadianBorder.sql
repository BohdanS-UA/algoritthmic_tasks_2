// https://www.codewars.com/kata/590ba881fe13cfdcc20001b4/train/sql

SELECT name, country
FROM travelers
WHERE 
  country != 'USA' AND
  country != 'Canada' AND
  country != 'Mexico'
