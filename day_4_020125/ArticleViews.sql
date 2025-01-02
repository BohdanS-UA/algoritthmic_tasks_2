// https://leetcode.com/problems/article-views-i/submissions/1494959707/?envType=study-plan-v2&envId=top-sql-50

SELECT DISTINCT author_id AS id
FROM views
WHERE viewer_id = author_id
ORDER BY author_id
