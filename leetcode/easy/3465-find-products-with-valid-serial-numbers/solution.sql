SELECT *
FROM products
WHERE description REGEXP 'SN[0-9]{4}-[0-9]{4}([^0-9][A-Za-z]|$)'
ORDER BY product_id ASC;