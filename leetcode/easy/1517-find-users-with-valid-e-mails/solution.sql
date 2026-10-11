# Write your MySQL query statement below

select * from Users
WHERE REGEXP_LIKE(
    mail,
    '^[A-Za-z][A-Za-z0-9._-]*@leetcode[.]com$',
    'c'
);