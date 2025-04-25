// https://www.codewars.com/kata/5811597e9d278beb04000038/train/sql

SELECT
  DATE(created_at) AS day,
  description,
  COUNT(*) AS count
FROM events
WHERE name = 'trained'
GROUP BY DATE(created_at), description
ORDER BY day
