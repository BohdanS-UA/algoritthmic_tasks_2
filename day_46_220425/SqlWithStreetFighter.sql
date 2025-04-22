// https://www.codewars.com/kata/5ac698cdd325ad18a3000170/train/sql

SELECT
    f.name,
    SUM(f.won) AS won,
    SUM(f.lost) AS lost
FROM fighters f
JOIN winning_moves wm ON f.move_id = wm.id
WHERE wm.move NOT IN ('Hadoken', 'Shouoken', 'Kikoken')
GROUP BY f.name
ORDER BY won DESC
LIMIT 6
