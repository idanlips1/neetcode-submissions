-- Write your query below
SELECT MIN(ABS(p1.x - p2.x)) AS shortest
from point p1 join point p2
    ON p1.x < p2.x