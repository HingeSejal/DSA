# Write your MySQL query statement below
select * from products
where description REGEXP 'SN[0-9]{4}-[0-9]{4}([^0-9][A-Za-z]|$)'
order by product_id asc;