// https://leetcode.com/problems/average-time-of-process-per-machine/solutions/3722056/sql-join-or-subquery-easy-to-understand/?envType=study-plan-v2&envId=top-sql-50

SELECT 
    machine_id,
    ROUND(AVG(end_time - start_time), 3) AS processing_time
FROM (
    SELECT
        machine_id,
        process_id,
        MAX(CASE WHEN activity_type = 'end' THEN timestamp ELSE NULL END) AS end_time,
        MAX(CASE WHEN activity_type = 'start' THEN timestamp ELSE NULL END) AS start_time
    FROM activity
    GROUP BY machine_id, process_id
) AS processing_time
GROUP BY machine_id


