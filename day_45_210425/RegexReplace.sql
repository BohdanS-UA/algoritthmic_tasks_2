// https://www.codewars.com/kata/5942b066db68b6f35f000084/train/sql

SELECT
  project,
  commits,
  contributors,
  REGEXP_REPLACE(address, '\d', '!') AS address
FROM repositories
