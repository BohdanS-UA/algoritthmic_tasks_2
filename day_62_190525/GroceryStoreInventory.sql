// https://www.codewars.com/kata/5a8eb3fb57c562110f0000a1/train/sql

SELECT id, name, stock
FROM products
WHERE (producent = 'CompanyA' AND stock <= 2)
ORDER BY id
