# Write your MySQL query statement below
select * from products
where description REGEXP '(^|[A-Za-z0-9])SN[0-9]{4}-[0-9]{4}([^0-9]|$)'
order by product_id asc;