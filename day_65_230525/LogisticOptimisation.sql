// https://www.codewars.com/kata/5a8ec692b17101bfc70001ba/train/sql

SELECT producer, COUNT(id) AS count_products_types
FROM products
GROUP BY producer
ORDER BY count_products_types DESC, producer
