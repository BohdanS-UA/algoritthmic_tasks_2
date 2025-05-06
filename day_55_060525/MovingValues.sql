// https://www.codewars.com/kata/594a389387a7c6a77a000005/train/sql

SELECT
  LENGTH(CAST(m.name AS TEXT)) AS id,
  LENGTH(CAST(m.legs AS TEXT)) AS name,
  LENGTH(CAST(m.arms AS TEXT)) AS legs,
  LENGTH(CAST(m.characteristics AS TEXT)) AS arms,
  LENGTH(CAST(m.id AS TEXT)) AS characteristics
FROM monsters m
