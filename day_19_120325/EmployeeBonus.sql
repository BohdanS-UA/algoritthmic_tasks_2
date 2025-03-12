// https://leetcode.com/problems/employee-bonus/submissions/1571140422/?envType=study-plan-v2&envId=top-sql-50

SELECT e.name, b.bonus
FROM Employee e
LEFT JOIN Bonus b
ON e.empId = b.empId
WHERE bonus < 1000 OR bonus IS NULL
