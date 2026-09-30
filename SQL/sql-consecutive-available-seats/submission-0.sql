-- Write your query below
SELECT Distinct c1.seat_id
FROM cinema c1 JOIN cinema c2
    ON (c1.seat_id = 1 + c2.seat_id OR c1.seat_id = c2.seat_id - 1)
WHERE c1.free = 1 AND c2.free = 1
ORDER BY c1.seat_id