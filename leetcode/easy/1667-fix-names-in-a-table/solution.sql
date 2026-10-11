# Write your MySQL query statement below
select user_id ,
        CONCAT(UPPER(LEFT(name, 1)), LOWER(SUBSTRING(name, 2))) AS name
from Users
ORDER BY user_id;
