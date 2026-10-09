# Write your MySQL query statement below
Select d.name Department ,
        e.name Employee ,
        e.salary Salary 
from Employee e
join Department d
on e.departmentId=d.id
WHERE (e.departmentId, e.salary) IN (
    SELECT departmentId, MAX(salary)
    FROM Employee
    GROUP BY departmentId
);