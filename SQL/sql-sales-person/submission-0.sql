-- Write your query below
SELECT name 
FROM sales_person
WHERE sales_id NOT IN  (
    SELECT sales_id 
    FROM company JOIN orders
    ON company.com_id = orders.com_id
    WHERE company.name = 'CRIMSON'
);