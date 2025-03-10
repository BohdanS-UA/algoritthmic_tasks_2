// https://leetcode.com/problems/average-selling-price/submissions/1568892397/?envType=study-plan-v2&envId=top-sql-50

WITH SalesWithPrices AS (
  SELECT 
    p.product_id,
    COALESCE(SUM(u.units * p.price), 0) AS total_revenue,
    COALESCE(SUM(u.units), 0) AS total_units
  FROM Prices p
  LEFT JOIN UnitsSold u
    ON p.product_id = u.product_id
    AND u.purchase_date BETWEEN p.start_date AND p.end_date
  GROUP BY p.product_id
)

SELECT 
  product_id,
  ROUND(
    COALESCE(total_revenue / NULLIF(total_units, 0), 0),
    2
  ) AS average_price
FROM SalesWithPrices;
