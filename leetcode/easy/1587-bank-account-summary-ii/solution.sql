# Write your MySQL query statement below
select u.name , 
        SUM(t.amount) balance 
from Users u
join Transactions t
on u.account = t.account
GROUP BY u.account, u.name
HAVING SUM(t.amount) > 10000;